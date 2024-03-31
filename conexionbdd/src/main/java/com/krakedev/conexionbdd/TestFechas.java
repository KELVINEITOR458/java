package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		//Date = java.util.Date
		//Time = java.sql.Date
		SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechaStr = "2020/03/22 10:05:04";
		try {
			//para FECHA
			Date fecha =sf.parse(fechaStr);
			System.out.println(fecha);
			//long guarda tipos de texto laaaaaaaaaaargos
			long fechaMilis = fecha.getTime();
			java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
			System.out.println(fechaSQL);

			
			//para HORA
			Time time = new Time(fechaMilis);
			System.out.println(time);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
