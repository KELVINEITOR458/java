package com.krakedev.estaticos;

public class TestEstaticos {

	public static void main(String[] args) {
		//para invocar un metodo estatico se lo hace directamente se lo hace 
		//directamente desde la clase, NO hace falta instanciar un objeto
		Double random = Math.random();
		System.out.println(random);
	}

}
