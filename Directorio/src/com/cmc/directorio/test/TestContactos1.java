package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;

public class TestContactos1 {

	public static void main(String[] args) {
		
		Telefono telf1 = new Telefono("Movi", "0992900231", 1);
		Telefono telf2 = new Telefono("Claro", "0992900238", 2);
		Contacto c1 = new Contacto("Kelvin", "Bermeo", telf1, 68.2);
		Contacto c2 = new Contacto("Matias", "Ramirez", telf2, 59.8);
		
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
