package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Empleado;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.entidades.RegistrosEntrada;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminRegistros {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(RegistrosEntrada registro) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		LOGGER.trace("Persona a insertar >> " + registro);
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into registros_entrada(codigo_registro, cedula_empleado, fecha, hora, codigo_empleado_registro)"
							+ "	values(?,?,?,?,?)");
			ps.setInt(1, registro.getCodigo_registro());
			ps.setString(2, registro.getCedula());
			ps.setDate(3, new java.sql.Date(registro.getFecha().getTime()));
			ps.setTime(4, new Time(registro.getHora().getTime()));
			ps.setInt(5, registro.getCodigo_empleado().getCodigo_empleado());
			ps.executeUpdate();
		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error de infraestructura", e);
				throw new Exception("Error de infraestructura");
			}
		}

	}
	
	//ACTUALIZAR
	public static void actualizar(RegistrosEntrada registro) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		LOGGER.trace("Persona a insertar >> " + registro);
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"update registros_entrada set cedula_empleado=?, fecha=?, hora=? where codigo_empleado_registro ='"
							+ registro.getCodigo_empleado().getCodigo_empleado() + "';");
			ps.setString(1, registro.getCedula());
			ps.setDate(2, new java.sql.Date(registro.getFecha().getTime()));
			ps.setTime(3, new Time(registro.getHora().getTime()));

			ps.executeUpdate();
		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al Actualizar");

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error de infraestructura", e);
				throw new Exception("Error de infraestructura");
			}
		}
	}
	
	public static void eliminar(int codigo) throws Exception{
		PreparedStatement ps = null;
		Connection con = null;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"delete from registros_entrada where codigo_empleado_registro = '" + codigo + "';");
			ps.executeUpdate();
		} catch (Exception e) {
			// loggear el error
			LOGGER.error("Error al encontrar a la persona", e);
			throw new Exception("Error al encontrar a la persona");

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error de infraestructura", e);
				throw new Exception("Error de infraestructura");
			}
		}
	}
}
