package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA = new Producto("Hibuprofeno", "Alivia cualquier tipo de dolor", 0.35, 240);
		productoB = new Producto("Amoxicilina", "Detiene el crecimiento de las bacterias", 0.75, 180);
		productoC = new Producto("Condones", "Evita las ETS o las bendiciones", 4.99, 400);

		System.out.println("PRODUCTO 1");
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock Anual: " + productoA.getStockAnual());
		System.out.println("---------------");
		System.out.println("PRODUCTO 2");
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock Anual: " + productoB.getStockAnual());
		System.out.println("---------------");
		System.out.println("PRODUCTO 3");
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock Anual: " + productoC.getStockAnual());

		
		
		
		
	}

}
