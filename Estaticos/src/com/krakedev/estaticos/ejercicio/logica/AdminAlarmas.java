package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> alarmas = new ArrayList<>();

	public ArrayList<Alarma> getAlarma() {
		return alarmas;
	}
	public void agregarAlarma(Alarma alarmaRecibida) {
		alarmas.add(alarmaRecibida);
	}
}
