package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("A3"));
        maquina.agregarCelda(new Celda("A4"));
        maquina.agregarCelda(new Celda("A5"));
        maquina.agregarCelda(new Celda("A6"));
        
        Producto producto1=new Producto("K001","Doritos",0.70);
		maquina.cargarProducto(producto1, "A1", 6);
		
		Producto producto2=new Producto("K002","Platanitos",0.60);
		maquina.cargarProducto(producto2, "A2", 10);
		
		Producto producto3=new Producto("K003","Tatos",0.30);
		maquina.cargarProducto(producto3, "A3", 7);
		
		Producto producto4=new Producto("K004","Cachitos",0.35);
		maquina.cargarProducto(producto4, "A4", 8);
		
		Producto producto5=new Producto("K005","Politos",0.25);
		maquina.cargarProducto(producto5, "A5", 15);
		
		Producto producto6=new Producto("K006","Manicho",0.50);
		maquina.cargarProducto(producto6, "A6", 6);
		
		ArrayList<Producto> productosMenores;
		productosMenores = maquina.buscarMenores(0.40);
		System.out.println("Productos menores: " + productosMenores.size());
		
		
	}

}
