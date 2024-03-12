package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto pro = new Producto(5000, "Kelvin");
		pro.setDescripcion("Nose que poner aqui");
		pro.setPeso(58.70);
		
		System.out.println("Codigo: " + pro.getCodigo());
		System.out.println("Nombre: " + pro.getNombre());
		System.out.println("Descripcion: " + pro.getDescripcion());
		System.out.println("Peso: " + pro.getPeso());


	}

}
