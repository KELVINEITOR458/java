package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("Claro", "0992922231", 1);
		Telefono telf2 = new Telefono("Claro", "0992911238", 2);
		Contacto c1 = new Contacto("Anahi", "Ardilla", telf1, 18.2);
		Contacto c2 = new Contacto("Blue", "Guacamayo", telf2, 29.8);
		
		AdminContactos ac = new AdminContactos();
		Contacto mp;
		mp = ac.buscarMasPesado(c1, c2);
		System.out.println("El mas pesado es: " + mp.getNombre());
		
		boolean co;
		co = ac.compararOperadoras(telf1, telf2);
		if(co == true) {
			System.out.println("Los dos telefonos tienen las mismas operadoras");
		}else {
			System.out.println("Los telefonos tienen diferentes operadoras");
		}
	}

}
