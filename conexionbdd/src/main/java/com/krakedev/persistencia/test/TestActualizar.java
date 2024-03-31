package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("C", "Casado");
		Persona p = new Persona("1234567887", "Argentino", "Pe Causa", ec);
		try {
			Date fechaNacimiento = Convertidor.convertirFecha("2007/07/27");
			Date horaNacimiento = Convertidor.convertirHora("09:40");
			p.setFechaNacimiento(fechaNacimiento);
			p.setHoraNacimiento(horaNacimiento);
			p.setEstatura(1.99);
			p.setCantidadAhorrada(new BigDecimal(1230.234));
			p.setNumeroHijos(11);
			AdminPersonas.actualizar(p);
		} catch (Exception e) {
			System.out.println("error en el sistema: " + e.getMessage());
		}
		
	}

}
