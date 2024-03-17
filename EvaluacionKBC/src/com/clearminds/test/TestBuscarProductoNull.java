package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		//La linea 16 tiene el error de null pointer exception en la variable "prod" ya que intenta conseguir el nombre de un producto que lo tiene null
		System.out.println("Producto encontrado:"+prod.getNombre());
		
		
		
		
	}
}
