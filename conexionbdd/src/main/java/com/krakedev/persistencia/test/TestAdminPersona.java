package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

//sysout.println solo se va a poder usar en los test
public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("1234567887", "Boliviano", "Che Mati", ec);
		try {
			Date fechaNacimiento = Convertidor.convertirFecha("2006/06/26");
			Date horaNacimiento = Convertidor.convertirHora("09:30");
			p.setFechaNacimiento(fechaNacimiento);
			p.setHoraNacimiento(horaNacimiento);
			p.setCantidadAhorrada(new BigDecimal(1000.234));
			p.setNumeroHijos(10);
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			System.out.println("error en el sistema: " + e.getMessage());
		}
		
		
	}

}
