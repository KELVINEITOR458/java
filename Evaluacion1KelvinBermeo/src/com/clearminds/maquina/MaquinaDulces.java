package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private ArrayList<Celda> celdas;
	private double saldo;
	
	
	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}
	
	public void mostrarConfiguracion() {
		Celda elementoCelda;
		for(int i=0; i<celdas.size();i++) {
			elementoCelda = celdas.get(i);
			System.out.println("Celda" + (i+1) + ":" + elementoCelda.getCodigo());
		}
	}
	
	public Celda buscarCelda(String codigo) {
		Celda celdaEncontrada;
		Celda encontrado = null;
		
		for(int i=0; i<celdas.size();i++) {
			celdaEncontrada = celdas.get(i);
			if(codigo.equals(celdaEncontrada.getCodigo())) {
				encontrado = celdaEncontrada;
			}
		}
		
		return encontrado;
	}
	
	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada;
		celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}
	
	public void mostrarProductos() {
		Celda elementoCelda;
		Producto elementoProducto;
		for(int i=0; i<celdas.size();i++) {
			elementoCelda = celdas.get(i);
			elementoProducto = elementoCelda.getProducto();
			if(elementoProducto == null) {
				System.out.println("Celda" + (i+1) + ":" + elementoCelda.getCodigo() + " Stock:" + elementoCelda.getStock() + " Sin producto asignado" );
			}else {
				System.out.println("Celda" + (i+1) + ":" + elementoCelda.getCodigo() + " Stock:" + elementoCelda.getStock() + " Producto:" + elementoProducto.getNombre()  + " Precio:" + elementoProducto.getPrecio());
			}
		}
		System.out.println("Saldo: " + saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		Celda celdaEncontrada;
		Producto productoEncontrado = null;
		
		for(int i=0; i<celdas.size();i++) {
			celdaEncontrada = celdas.get(i);
			if(codigo.equals(celdaEncontrada.getCodigo())) {
				productoEncontrado = celdaEncontrada.getProducto();
			}
		}
		
		return productoEncontrado;
	}
	
	public double consultarPrecio(String codigo) {
		Producto producto;
		double precio = 0.0;
		producto = buscarProductoEnCelda(codigo);
		precio = producto.getPrecio();
		
		return precio;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda celda = null;
		Celda celdaEncontrada;
		Producto producto;
		
			for(int i=0; i<celdas.size(); i++) {
				celdaEncontrada = celdas.get(i);
				producto = celdaEncontrada.getProducto();
				if(producto != null) {
					if(codigoProducto.equals(producto.getCodigo())) {
						celda = celdaEncontrada;
					}
				}
			}
		
		return celda;
		
	}
	
	public void incrementarProductos(String codigoProducto, int cantidad) {
		Celda celdaEncontrada;
		int aumento;
		celdaEncontrada = buscarCeldaProducto(codigoProducto);
		aumento = celdaEncontrada.getStock() + cantidad;
		celdaEncontrada.setStock(aumento);
	}
	
	public void vender(String codigo) {
		Celda celda;
		Producto productoCelda;
		int stockMenos;
		double precio;
		
		celda = buscarCelda(codigo);
		stockMenos = celda.getStock() - 1;
		celda.setStock(stockMenos);
		
		productoCelda = celda.getProducto();
		precio = productoCelda.getPrecio();
		saldo = saldo + precio;
	}
	
	public double venderConCambio(String codigo, double valor) {
		Celda celda;
		Producto productoCelda;
		int stockMenos;
		double precio;
		double cambio = 0.0;
		
		celda = buscarCelda(codigo);
		
		if(celda.getStock() > 0) {
			stockMenos = celda.getStock() - 1;
			celda.setStock(stockMenos);
			
			productoCelda = celda.getProducto();
			precio = productoCelda.getPrecio();
			saldo = saldo + precio;
			cambio = valor - saldo;

		}
		return cambio;
	}
	
	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> menores = new ArrayList<Producto>();
		Celda celda;
		Producto elementoProducto = null;
		for(int i=0; i < celdas.size(); i++) {
			celda = celdas.get(i);
			elementoProducto = celda.getProducto();
			if(elementoProducto.getPrecio() <= limite) {
				menores.add(elementoProducto);
				System.out.println("Nombre:" + elementoProducto.getNombre() + " Precio:" + elementoProducto.getPrecio());
			}
		}
		
		return menores;

	}
}
