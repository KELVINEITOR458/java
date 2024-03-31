package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"12345AWMfreefire");
			System.out.println("CONEXION EXITOSA");
			/*ps = connection.prepareStatement(
					"insert into personas(cedula, nombre, apellido, estado_civil_codigo, numero_hijos, estatura, cantidad_ahorrada, fecha_nacimiento, hora_nacimiento)"
							+ "	values(?, ?, ?, ?,?, ?,?,?,?)");
			ps.setString(1, "1234567890");
			ps.setString(2, "Juanita");
			ps.setString(3, "Tijuanita");
			ps.setString(4, "C");
			ps.setInt(5, 2);
			ps.setDouble(6, 1.61);
			// para tipos de dato money siempre se usa BigDecimal
			ps.setBigDecimal(7, new BigDecimal(1200.34));

			SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 10:05:04";
			try {
				// para FECHA
				Date fecha = sf.parse(fechaStr);
				System.out.println(fecha);
				// long guarda tipos de texto laaaaaaaaaaargos
				long fechaMilis = fecha.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);

				// para HORA
				Time time = new Time(fechaMilis);
				System.out.println(time);

				ps.setDate(8, fechaSQL);
				ps.setTime(9, time);
				
				ps.executeUpdate();
				System.out.println("Ejecuta insert");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			ps = connection.prepareStatement(
					"insert into transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)"
					+ "values(?,?,?,?,?,?)");
			ps.setInt(1, 777);
			ps.setString(2, "07770");
			ps.setBigDecimal(3, new BigDecimal(7777.77));
			ps.setString(4, "C");
			SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2024/03/30 21:05:04";
			try {
				// para FECHA
				Date fecha = sf.parse(fechaStr);
				System.out.println(fecha);
				// long guarda tipos de texto laaaaaaaaaaargos
				long fechaMilis = fecha.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);

				// para HORA
				Time time = new Time(fechaMilis);
				System.out.println(time);

				ps.setDate(5, fechaSQL);
				ps.setTime(6, time);
				
				ps.executeUpdate();
				System.out.println("Ejecuta insert");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			ps = connection.prepareStatement(
					"insert into empleado(codigo_empleado, nombre, fecha, hora)"
					+ "values(?,?,?,?)");
			ps.setInt(1, 7777);
			ps.setString(2, "Reto 32");

			SimpleDateFormat simplef = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStri = "2020/03/22 10:05:04";
			try {
				// para FECHA
				Date fecha2 = simplef.parse(fechaStri);
				System.out.println(fecha2);
				// long guarda tipos de texto laaaaaaaaaaargos
				long fechaMilis2 = fecha2.getTime();
				java.sql.Date fechaSQL2 = new java.sql.Date(fechaMilis2);
				System.out.println(fechaSQL2);

				// para HORA
				Time time2 = new Time(fechaMilis2);
				System.out.println(time2);

				ps.setDate(3, fechaSQL2);
				ps.setTime(4, time2);
				
				ps.executeUpdate();
				System.out.println("Ejecuta insert");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
