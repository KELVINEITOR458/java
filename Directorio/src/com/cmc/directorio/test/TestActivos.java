package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.AdminTelefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("Claro", "0992922231", 1);
		Telefono telf2 = new Telefono("Claro", "0992911238", 2);
		Contacto c1 = new Contacto("Anahi", "Ardilla", telf1, 18.2);
		Contacto c2 = new Contacto("Blue", "Guacamayo", telf2, 29.8);
		
		AdminTelefono at1 = new AdminTelefono();
		AdminTelefono at2 = new AdminTelefono();
		
		at1.activarMensajeria(telf1);
		at2.activarMensajeria(telf2);
		
		if(telf1.isTieneWhatsapp() == false) {
			System.out.println("Telefono 1 no tiene WhatsApp");
		}
		
		if(telf2.isTieneWhatsapp() == false) {
			System.out.println("Telefono 2 no tiene WhatsApp");

		}
		
		AdminContactos ac1 = new AdminContactos();
		AdminContactos ac2 = new AdminContactos();
		
		ac1.activarContacto(c1);
		ac2.activarContacto(c2);
		
		if(c1.isActivo() == false) {
			System.out.println("El contacto no tiene Whatsapp por lo cual no esta activo");
		}
		if(c2.isActivo() == false) {
			System.out.println("El contacto no tiene Whatsapp por lo cual no esta activo");

		}
		
		
	}

}
