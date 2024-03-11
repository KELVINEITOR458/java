package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha1 = new Fecha(3000, 13, 12);
	
		
		System.out.println("Año: " + fecha1.getAnio());
		System.out.println("Mes: " + fecha1.getMes());
		System.out.println("Dia: " + fecha1.getDia());
		
	}

}
