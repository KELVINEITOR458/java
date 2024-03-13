package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("Movi", "0992900231", 1);
		Contacto c = new Contacto("Yaneli", "Velez", telf, 50.3);
		
		System.out.println("Nombre: " + c.getNombre());
		System.out.println("Apeliido: " + c.getApellido());
		System.out.println("Operadora: " + telf.getOperadora());
		System.out.println("Número: " + telf.getNumero());
		System.out.println("Peso: " + c.getPeso());
		
		
	}

}
