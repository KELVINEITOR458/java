package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	public void metodo1() {
		String a = null;
		a.substring(1);
		//NPE es Unchecked
	}
	
	public void metodo2() {
		File f = new File("archivo1.txt");

		try {
		f.createNewFile(); //IOException CHECKED
		}catch(IOException ex) {
			System.out.println("Error");
		}
	}
	
	public void metodo3() throws IOException{
		File f = new File("archivo1.txt");
		f.createNewFile(); //IOException CHECKED
	}
	
	public void metodo4() {
		
	}
}
