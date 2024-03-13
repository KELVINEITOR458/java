package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminTelefono;


public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono tel = new Telefono("Movi", "098234234", 20);
		AdminTelefono at = new AdminTelefono();
		
		at.activarMensajeria(tel);
		
		System.out.println(tel.getOperadora() + " " + tel.getNumero() + " " + tel.getCodigo());
		if(tel.isTieneWhatsapp() == true) {
			System.out.println("Si tiene Whatsapp");
		}
		
		
	}

}
