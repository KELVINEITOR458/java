package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.DiasSemana;
import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;

public class TestAlarmas {

	public static void main(String[] args) {
		AdminAlarmas admin = new AdminAlarmas();
		Alarma alarma1 = new Alarma(DiasSemana.LUNES, 1, 45);
		Alarma alarma2 = new Alarma(DiasSemana.MARTES, 2, 45);
		Alarma alarma3 = new Alarma(DiasSemana.MIERCOLES, 3, 45);
		Alarma alarma4 = new Alarma(DiasSemana.JUEVES, 4, 45);
		Alarma alarma5 = new Alarma(DiasSemana.VIERNES, 5, 45);
		admin.agregarAlarma(alarma1);
		admin.agregarAlarma(alarma2);
		admin.agregarAlarma(alarma3);
		admin.agregarAlarma(alarma4);
		admin.agregarAlarma(alarma5);
		
		ArrayList<Alarma> alarmasActuales = admin.getAlarma();
		System.out.println(alarmasActuales);
	}

}
