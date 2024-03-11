package com.krakedev;
/* 
 * comentario de varias lineas
 */
public class TestPersona {

	public static void main(String[] args) {
		Persona p; // 1.Declaro la variable p de tipo Persona
		Persona p2;
		p2 = new Persona();
		p = new Persona();// 2. Crear un objeto Persona hacemos que p referencie al pbjeto creado

		// 3 Modificar los atributos
		p.setNombre("Kelvin");
		p.setEdad(17);
		p.setEstatura(1.80);

		p2.setNombre("Yaneli");

		// 4. Accedo a los atributos
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());
		System.out.println("********");
		System.out.println("Nombre 2: " + p2.getNombre());
	}

}
