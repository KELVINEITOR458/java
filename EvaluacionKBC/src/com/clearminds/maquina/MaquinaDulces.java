package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		celda1 = new Celda(codigo1);
		celda2 = new Celda(codigo2);
		celda3 = new Celda(codigo3);
		celda4 = new Celda(codigo4);
	}
	
	public void mostrarConfiguracion() {
		System.out.println(celda1.getCodigo());
		System.out.println(celda2.getCodigo());
		System.out.println(celda3.getCodigo());
		System.out.println(celda4.getCodigo());
	}
	
	public Celda buscarCelda(String codigo) {
		Celda celda = null;
		if(codigo == celda1.getCodigo()) {
			celda = celda1;
		}
		if(codigo == celda2.getCodigo()) {
			celda = celda2;
		}
		if(codigo == celda3.getCodigo()) {
			celda = celda3;
		}
		if(codigo == celda4.getCodigo()) {
			celda = celda4;
		}
		return celda;
	}
	
	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada;
		MaquinaDulces celda = new MaquinaDulces();
		celdaRecuperada = celda.buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}
	
	public void mostrarProductos() {
		System.out.println(celda1.getCodigo());
		System.out.println(celda1.getStock());
		System.out.println(celda1.getProducto());
		
		System.out.println(celda2.getCodigo());
		System.out.println(celda2.getStock());
		System.out.println(celda2.getProducto());
		
		System.out.println(celda3.getCodigo());
		System.out.println(celda3.getStock());
		System.out.println(celda3.getProducto());
		
		System.out.println(celda4.getCodigo());
		System.out.println(celda4.getStock());
		System.out.println(celda4.getProducto());
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		Producto producto = null;
		if(codigo == celda1.getCodigo()) {
			producto =  celda1.getProducto();
		}
		
		if(codigo == celda2.getCodigo()) {
			producto = celda2.getProducto();
		}
		
		if(codigo == celda3.getCodigo()) {
			producto = celda3.getProducto();
		}
		
		if(codigo == celda4.getCodigo()) {
			producto = celda4.getProducto();
		}
		
		return producto;
		
	}

	public double consultarPrecio(String codigo) {
		Producto producto = null;
		double precio = 0.0;
		if(codigo == celda1.getCodigo()) {
			producto =  celda1.getProducto();
			precio = producto.getPrecio();
		}
		
		if(codigo == celda2.getCodigo()) {
			producto = celda2.getProducto();
			precio = producto.getPrecio();

		}
		
		if(codigo == celda3.getCodigo()) {
			producto = celda3.getProducto();
			precio = producto.getPrecio();

		}
		
		if(codigo == celda4.getCodigo()) {
			producto = celda4.getProducto();
			precio = producto.getPrecio();

		}
		
		return precio;
	}
}
