package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		AdminProducto admin = new AdminProducto();
		Producto a = new Producto("Doritos", 0.60);
		Producto b = new Producto("Papitas", 0.50);
		
		Producto mc;
		mc = admin.BuscarMasCaro(a, b);
		
		if(mc == null) {
			System.out.println("Son iguales");
		}else {
			System.out.println("El mas caro es: " + mc.getNombre());
		}
				
	}

}
