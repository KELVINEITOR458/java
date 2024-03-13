package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono tel1 = new Telefono("Movi", "0992900239", 10);
		Telefono tel2 = new Telefono("Claro","0992900238", 11);
		Telefono tel3 = new Telefono("Movi", "0992900237", 12);
		Telefono tel4 = new Telefono("Claro","0992900236", 13);
		
		AdminTelefono at = new AdminTelefono();
		int numeroMovi;
		
		numeroMovi = at.contarMovi(tel1, tel2, tel3);
		System.out.println("Cantidad de telefonos con operadora Movi: " + numeroMovi);
		
		int numeroClaro;
		numeroClaro = at.contarClaro(tel1, tel2, tel3, tel4);
		System.out.println("Cantidad de telefonos con operadora Claro: " + numeroClaro);
		
		

		
		
		
	}

}
