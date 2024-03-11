package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;
		
		auto1 = new Auto("Chevrolet", 2020, 40.001);
		auto2 = new Auto("Audi", 2018, 37.001);
		
		System.out.println("AUTO 1..");
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());
		System.out.println("---------");
		System.out.println("AUTO 2..");
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());





	}

}
