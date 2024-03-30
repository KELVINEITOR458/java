package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Inicio");
		String a = "ddddd";
		try {
			System.out.println("ABRE CONECXION BASE DE DATOS");
			a.substring(3);
			System.out.println("Fin");
		}catch(Exception ex) {
			System.out.println("Entra al catch");
		}finally {
			//el finaly se ejecuta si o si
			System.out.println("Ingresa al finally");
			System.out.println("CIERRA CONEXION");

		}
		System.out.println("Fuera del catch");
	}

}
