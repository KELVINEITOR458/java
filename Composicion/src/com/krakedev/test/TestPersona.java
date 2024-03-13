package com.krakedev.test;

import com.krakedev.composicion.Persona;
import com.krakedev.composicion.Direccion;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		
		p1.setNombre("Yaneli");
		p1.setApellido("Velez");
		
		Direccion dir = new Direccion();
		dir.setCallePrincipal("Avenida siempre viva");
		dir.setCalleSecundaria("La que cruza");
		dir.setNumero("N-47");
		p1.setDireccion(dir);
		
		
		String nombre = p1.getNombre();
		Direccion d1 = p1.getDireccion();
		
		System.out.println(nombre);
		//d1 esta null, por eso sale el error
		System.out.println(d1.getCallePrincipal());
		
		
		p1.imprimir();
		
		Persona p2 = new Persona();
		Direccion d2 = new Direccion("Av de los Shyris", "Eloy Alfaro", "S/N");
		
		p2.setNombre("Kelvin");
		p2.setDireccion(d2);
		
		p2.imprimir();
		
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("X", "Y", "123"));
		p3.imprimir();
		
		
	}

}
