package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {
	private static final Logger LOGGER = LogManager.getLogger(ConexionBDD.class);

	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
	private static final String USER = "postgres";
	private static final String PASSWORD = "postgres";
	public static Connection conectar() throws Exception{
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER,PASSWORD);
			LOGGER.debug("CONEXION EXITOSA");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error en la infraestructura" , e);
			throw new Exception("Error en la infraestructura");
		} catch (SQLException e) {
			LOGGER.error("Error al conectar, revise usuario y contraseña", e);
			throw new Exception("Error al conectar, revise usuario y contraseña");
		}
		return connection;
	}
}
