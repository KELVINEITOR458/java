package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		LOGGER.trace("Persona a insertar >> " + persona);
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into personas(cedula, nombre, apellido, estado_civil_codigo, numero_hijos, estatura, cantidad_ahorrada, fecha_nacimiento, hora_nacimiento)"
							+ "	values(?, ?, ?, ?,?, ?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumeroHijos());
			ps.setDouble(6, persona.getEstatura());
			// para tipos de dato money siempre se usa BigDecimal
			ps.setBigDecimal(7, persona.getCantidadAhorrada());
			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));
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

	// RETO
	// 32 ---------------------------------------------------------------------------

	public static void actualizar(Persona persona) throws Exception {
		PreparedStatement ps = null;
		Connection con = null;
		LOGGER.trace("Persona a insertar >> " + persona);
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"update personas set nombre =?, apellido=?, estado_civil_codigo=?, numero_hijos=?, estatura=?, cantidad_ahorrada=?, fecha_nacimiento=?, hora_nacimiento=? where cedula ='"
							+ persona.getCedula() + "';");
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstadoCivil().getCodigo());
			ps.setInt(4, persona.getNumeroHijos());
			ps.setDouble(5, persona.getEstatura());
			// para tipos de dato money siempre se usa BigDecimal
			ps.setBigDecimal(6, persona.getCantidadAhorrada());
			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));

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
	
	public static void eliminar(String cedula) throws Exception{
		PreparedStatement ps = null;
		Connection con = null;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"delete from personas where cedula = '" + cedula + "';");
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
	
	//RETO 34-----------
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception{
		ArrayList<Persona> personas = new ArrayList<Persona>();
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		
		try {
			con = ConexionBDD.conectar();
			ps =con.prepareStatement("SELECT cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cast(cantidad_ahorrada as decimal(6,2)), numero_hijos, estado_civil\r\n"
					+ "	FROM public.personas where nombre like ?");
			ps.setString(1, "%" + nombreBusqueda + "%" );

			rs = ps.executeQuery();
			
			while(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("Apellido");
				double estatura = rs.getDouble("estatura");
				Date fecha = rs.getDate("fecha_nacimiento");
				Date hora = rs.getTime("hora_nacimiento");
				BigDecimal cantidadAhorrada = rs.getBigDecimal("cantidad_ahorrada");
				int numeroHijos = rs.getInt("numero_hijos");
				String estadoCivil = rs.getString("estado_civil");
				Persona p = new Persona();
				EstadoCivil es = new EstadoCivil(estadoCivil);

				p.setNombre(nombre);
				p.setCedula(cedula);
				p.setApellido(apellido);
				p.setEstatura(estatura);
				p.setCantidadAhorrada(cantidadAhorrada);
				p.setFechaNacimiento(fecha);
				p.setHoraNacimiento(hora);
				p.setNumeroHijos(numeroHijos);
				p.setEstadoCivil(es);
				personas.add(p);
			}
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre", e);
			throw new Exception("Error al consultar por nombre");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error de infraestructura", e);
				throw new Exception("Error de infraestructura");
			}
		}
		
		
		return personas;
	}
	
	public static Persona buscarPorCedula(String cedulaPri) throws Exception{
		Persona p = new Persona();
		PreparedStatement ps = null;
		Connection con = null;
		ResultSet rs = null;
		
		try {
			con = ConexionBDD.conectar();
			ps =con.prepareStatement("SELECT cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cast(cantidad_ahorrada as decimal(6,2)), numero_hijos, estado_civil\r\n"
					+ "	FROM public.personas where cedula = ?");
			ps.setString(1, cedulaPri );

			rs = ps.executeQuery();
			if(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				String apellido = rs.getString("Apellido");
				double estatura = rs.getDouble("estatura");
				Date fecha = rs.getDate("fecha_nacimiento");
				Date hora = rs.getTime("hora_nacimiento");
				BigDecimal cantidadAhorrada = rs.getBigDecimal("cantidad_ahorrada");
				int numeroHijos = rs.getInt("numero_hijos");
				String estadoCivil = rs.getString("estado_civil");
				
				p= new Persona();
				EstadoCivil es = new EstadoCivil(estadoCivil);
				
				
				p.setNombre(nombre);
				p.setCedula(cedula);
				p.setApellido(apellido);
				p.setEstatura(estatura);
				p.setCantidadAhorrada(cantidadAhorrada);
				p.setFechaNacimiento(fecha);
				p.setHoraNacimiento(hora);
				p.setNumeroHijos(numeroHijos);
				p.setEstadoCivil(es);
			}
			
			
		} catch (Exception e) {
			LOGGER.error("Error al consultar por cedula", e);
			throw new Exception("Error al consultar por cedula");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error de infraestructura", e);
				throw new Exception("Error de infraestructura");
			}
		}
		
		
		return p;
	}
	
	
}


