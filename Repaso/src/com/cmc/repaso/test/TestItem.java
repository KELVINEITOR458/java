package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		
		Item objeto = new Item();
		
		objeto.setProductosActuales(20);
		objeto.imprimir();
		System.out.println("-----Despues de la venta-----");
		objeto.vender(5);
		objeto.imprimir();
		System.out.println("-----Despues de la devolucion-----");
		objeto.devolver(5);
		objeto.imprimir();
		
		System.out.println("///////////////////////");
		Item objeto2 = new Item();
		objeto2.setProductosActuales(45);
		objeto2.imprimir();
		System.out.println("-----Despues de la venta-----");
		objeto2.vender(8);
		objeto2.imprimir();
		System.out.println("-----Despues de la devolucion-----");
		objeto2.devolver(3);
		objeto2.imprimir();
		
	}

}
