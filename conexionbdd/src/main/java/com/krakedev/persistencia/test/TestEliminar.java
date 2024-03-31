package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("1234567887", "Boliviano", "Che Mati", ec);
		try {
			AdminPersonas.eliminar(p.getCedula());
		} catch (Exception e) {
			System.out.println("error en el sistema: " + e.getMessage());
		}
	}

}
