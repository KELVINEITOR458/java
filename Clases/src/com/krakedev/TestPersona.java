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
		p.nombre = "Kelvin";
		p.edad = 17;
		p.estatura = 1.80;

		p2.nombre = "Yaneli";

		// 4. Accedo a los atributos
		System.out.println("Nombre: " + p.nombre);
		System.out.println("Edad: " + p.edad);
		System.out.println("Estatura: " + p.estatura);
		System.out.println("********");
		System.out.println("Nombre 2: " + p2.nombre);

	}

}
