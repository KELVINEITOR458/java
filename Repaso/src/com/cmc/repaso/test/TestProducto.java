package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto = new Producto("Webos", 0);
		
		double descuento;
		
		producto.setPrecio(12.48);
		descuento = producto.calcularPrecioPromo(12.3);
		
		System.out.println("El precio de " + producto.getNombre() + " es: " + producto.getPrecio());
		System.out.println("Con un descuento de: " + descuento);
		
		
	}

}
