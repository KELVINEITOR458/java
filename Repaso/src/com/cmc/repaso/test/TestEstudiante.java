package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {

		Estudiante estu = new Estudiante("Kelvin");
		estu.calificar(5);
		
		System.out.println(estu.getNombre());
		System.out.println(estu.getNota());
		System.out.println(estu.getResultado());

	}

}
