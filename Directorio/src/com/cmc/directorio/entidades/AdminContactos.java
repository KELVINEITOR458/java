package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
		if(c1.getPeso() > c2.getPeso()) {
			return c1;
		}else {
			return c2;
		}
	}
	
	public boolean compararOperadoras(Telefono t1, Telefono t2) {
		if(t1.getOperadora() == t2.getOperadora()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void activarContacto(Contacto c) {
		Telefono tel = c.getTelefono();
		if(tel.isTieneWhatsapp() == true) {
			c.setActivo(true);
		}else {
			c.setActivo(false);
		}
	}
	
	
}
