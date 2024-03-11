package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		int areaR1;
		double perimetroR1;
		r1.setBase(10);
		r1.setAltura(5);
		areaR1 = r1.calcularArea();
		perimetroR1 = r1.calcularPerimetro();
		System.out.println("Área de R1: " + areaR1);
		System.out.println("Perímetro de R1: " + perimetroR1);
		System.out.println("-------------------");

		
		Rectangulo r2 = new Rectangulo();
		int areaR2;
		double perimetroR2;
		r2.setBase(8);
		r2.setAltura(5);
		areaR2 = r2.calcularArea();
		perimetroR2 = r2.calcularPerimetro();
		System.out.println("Área de R2: " +  areaR2);
		System.out.println("Perímetro de R2: " + perimetroR2);
		System.out.println("-------------------");
		
		Rectangulo r3 = new Rectangulo();
		double perimetroR3;
		r3.setBase(4);
		r3.setAltura(2);
		perimetroR3 = r3.calcularPerimetro();
		System.out.println("Perímetro de R3: " + perimetroR3);
	}

}
