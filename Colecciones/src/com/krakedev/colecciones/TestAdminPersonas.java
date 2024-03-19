package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		
		admin.agregar(new Persona("Mario", "Benedetti", 150));
		admin.agregar(new Persona("Clar", "Kent", 30));
		admin.agregar(new Persona("Bruno", "Diaz", 25));

		admin.imprimir();
		
		Persona p1;
		p1 =admin.buscarPorNombre("Kelvin");
		
		if(p1 != null) {
			System.out.println("ENCONTRADO!!! " +  p1.getApellido() + " " +  p1.getEdad());
		}else {
			System.out.println("NO EXISTE LA PERSONA CON ESE NOMBRE");
		}
		
		ArrayList<Persona> personasMayores;
		personasMayores = admin.buscarMayores(10);
		System.out.println(personasMayores.size());
	}
	
	

}
