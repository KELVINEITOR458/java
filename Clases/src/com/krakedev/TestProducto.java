package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();
		
		productoA.nombre = "Hibuprofeno";
		productoA.descripcion = "Alivia cualquier tipo de dolor";
		productoA.precio = 0.35;
		productoA.stockAnual = 240;
		
		productoB.nombre = "Amoxicilina";
		productoB.descripcion = "Detiene el crecimiento de las bacterias";
		productoB.precio = 0.75;
		productoB.stockAnual = 180;
		
		productoC.nombre = "Condones";
		productoC.descripcion = "Evita las ETS o las bendiciones";
		productoC.precio = 4.99;
		productoC.stockAnual = 400;

		System.out.println("PRODUCTO 1");
		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripcion: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("Stock Anual: " + productoA.stockAnual);
		System.out.println("---------------");
		System.out.println("PRODUCTO 2");
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripcion: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("Stock Anual: " + productoB.stockAnual);
		System.out.println("---------------");
		System.out.println("PRODUCTO 3");
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripcion: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("Stock Anual: " + productoC.stockAnual);

		
		
		
		
	}

}
