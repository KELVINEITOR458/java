package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;
		
		auto1 = new Auto();
		auto2 = new Auto();
		
		auto1.setMarca("Chevrolet"); 
		auto1.setAnio(2020);
		auto1.setPrecio(40.001);
		
		auto2.setMarca("Audi");
		auto2.setAnio(2018);
		auto2.setPrecio(37.001);
		
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
