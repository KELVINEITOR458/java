package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Banco;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminBanco {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Banco banco) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		LOGGER.trace("Banco a insertar >> " + banco);
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into banco(codigo_banco, codigo_transaccion, detalle)"
							+ "	values(?, ?, ?)");
			ps.setInt(1, banco.getCodigoBanco());
			ps.setInt(2, banco.getCodigoTransaccion().getCodigo());
			ps.setString(3, banco.getDetalle());
			
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
	public static void actualizar(Banco banco) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		LOGGER.trace("Banco a insertar >> " + banco);
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"update banco set detalle=? where codigo_transaccion= '"
							+ banco.getCodigoTransaccion().getCodigo() + "';");
			ps.setString(1, banco.getDetalle());
			

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
	
	//ELIMINAR
	public static void eliminar(int codigoTransaccion) throws Exception{
		PreparedStatement ps = null;
		Connection con = null;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"delete from banco where codigo_transaccion = '" + codigoTransaccion + "';");
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
