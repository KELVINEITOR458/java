package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono tel = new Telefono("Movi", "09941234123", 10);
		
		System.out.println(tel.getOperadora() + " " + tel.getNumero() + " " + tel.getCodigo());
		
		
		
	}

}
