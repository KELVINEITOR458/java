package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Banco;
import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.entidades.Transacciones;
import com.krakedev.persistencia.servicios.AdminBanco;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestBanco {

	public static void main(String[] args) {
		//Test de insercion

		/*Transacciones tr = new Transacciones(11, "00458", new BigDecimal(1458.89), "C");
		try {
			Date fecha = Convertidor.convertirFecha("2006/26/06");
			Date hora = Convertidor.convertirHora("05:35");
			tr.setFecha(fecha);
			tr.setHora(hora);
			Banco b = new Banco(2231, tr, "Ahuevo si funciona!!!!");

			try {
				AdminBanco.insertar(b);
			} catch (Exception e) {
				System.out.println("error en el sistema: " + e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("error en el sistema: " + e.getMessage());
		}*/
		

		//Test de Actualizacion
		/*Transacciones tr = new Transacciones(11, "77458", new BigDecimal(99998.89), "C");
		try {
			Banco b = new Banco(tr, "Esta es la actualizacion");

			try {
				AdminBanco.actualizar(b);
			} catch (Exception e) {
				System.out.println("error en el sistema: " + e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("error en el sistema: " + e.getMessage());
		}*/
		
		
		//Test de eliminar
		Transacciones tr = new Transacciones(11, "77458", new BigDecimal(99998.89), "C");
		Banco b = new Banco(tr);
		try {
			AdminBanco.eliminar(b.getCodigoTransaccion().getCodigo());
		} catch (Exception e) {
			System.out.println("error en el sistema: " + e.getMessage());
		}
		
		
	}

	
}
