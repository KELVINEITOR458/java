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
		System.out.println("CELDA 1: " + celda1.getCodigo());
		System.out.println("CELDA 2: " + celda2.getCodigo());
		System.out.println("CELDA 3: " + celda3.getCodigo());
		System.out.println("CELDA 4: " + celda4.getCodigo());
	}
	
	public Celda buscarCelda(String codigo) {
		Celda celdaRetorno = null;
		Celda celdaN1 = new Celda(codigo);
		if(celda1.getCodigo() == celdaN1.getCodigo()) {
			celdaRetorno = celda1;
		}
		if(celda2.getCodigo() == celdaN1.getCodigo()) {
			celdaRetorno = celda2;
		}
		if(celda3.getCodigo() == celdaN1.getCodigo()) {
			celdaRetorno = celda3;
		}
		if(celda4.getCodigo() == celdaN1.getCodigo()) {
			celdaRetorno = celda4;
		}
		return celdaRetorno;
	}
	
	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada;
		celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}
	
	public void mostrarProductos() {
		Producto producto1;
		Producto producto2;
		Producto producto3;
		Producto producto4;
		
		producto1 = celda1.getProducto();
		producto2 = celda2.getProducto();
		producto3 = celda3.getProducto();
		producto4 = celda4.getProducto();
		
		System.out.println("********CELDA " + celda1.getCodigo());
		System.out.println("STOCK: " + celda1.getStock());
		if(celda1.getProducto() != null ) {
			System.out.println("NOMBRE PRODUCTO: " + producto1.getNombre());
			System.out.println("PRECIO PRODUCTO: " + producto1.getPrecio());
			System.out.println("CODIGO PRODUCTO: " + producto1.getCodigo());

		}else {
			System.out.println("LA CELDA NO TIENE PRODUCTO!!!!");
		}
		
		
		System.out.println("********CELDA " +celda2.getCodigo());
		System.out.println("STOCK: " + celda2.getStock());
		if(celda2.getProducto() != null ) {
			System.out.println("NOMBRE PRODUCTO: " + producto2.getNombre());
			System.out.println("PRECIO PRODUCTO: " + producto2.getPrecio());
			System.out.println("CODIGO PRODUCTO: " + producto2.getCodigo());
		}else {
			System.out.println("LA CELDA NO TIENE PRODUCTO!!!!");
		}
		
		System.out.println("********CELDA " +celda3.getCodigo());
		System.out.println("STOCK: " + celda3.getStock());
		if(celda3.getProducto() != null ) {
			System.out.println("NOMBRE PRODUCTO: " + producto3.getNombre());
			System.out.println("PRECIO PRODUCTO: " + producto3.getPrecio());
			System.out.println("CODIGO PRODUCTO: " + producto3.getCodigo());
		}else {
			System.out.println("LA CELDA NO TIENE PRODUCTO!!!!");
		}
		
		System.out.println("********CELDA " +celda4.getCodigo());
		System.out.println("STOCK: " + celda4.getStock());
		if(celda4.getProducto() != null ) {
			System.out.println("NOMBRE PRODUCTO: " + producto4.getNombre());
			System.out.println("PRECIO PRODUCTO: " + producto4.getPrecio());
			System.out.println("CODIGO PRODUCTO: " + producto4.getCodigo());
		}else {
			System.out.println("LA CELDA NO TIENE PRODUCTO!!!!");
		}
		
		System.out.println("El saldo de la maquina es: " + saldo);
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
	
	public Celda buscarCeldaProducto(String codigo) {
		Celda celda = null;
		Producto producto1 = celda1.getProducto();
		Producto producto2 = celda2.getProducto();
		Producto producto3 = celda3.getProducto();
		Producto producto4 = celda4.getProducto();
		if(producto1 != null) {
			if(codigo == producto1.getCodigo()) {
				celda = celda1;
			}
		}
		
		if(producto2 != null) {
			if(codigo == producto2.getCodigo()) {
				celda = celda2;
			}
		}
		
		
		if(producto3 != null) {
			if(codigo == producto3.getCodigo()) {
				celda = celda3;
			}
		}
		
		
		if(producto4 != null) {
			if(codigo == producto4.getCodigo()) {
				celda = celda4;
			}
		}
		return celda;
	}
	
	public void incrementarProductos(String codigo, int cantidad) {
		Celda celdaEncontrada;
		int aumento;
		
		celdaEncontrada = buscarCeldaProducto(codigo);
		
		aumento = celdaEncontrada.getStock() + cantidad;
		
		celdaEncontrada.setStock(aumento);
	}
	
	public void vender(String codigo) {
		Producto producto;
		int stockMenos;
		double precio;
		if(codigo == celda1.getCodigo()) {
			stockMenos = celda1.getStock() - 1;
			celda1.setStock(stockMenos);
			producto = celda1.getProducto();
			precio = producto.getPrecio();
			saldo = saldo + precio;
		}
		if(codigo == celda2.getCodigo()) {
			stockMenos = celda2.getStock() - 1;
			celda2.setStock(stockMenos);
			producto = celda2.getProducto();
			precio = producto.getPrecio();
			saldo = saldo + precio;
		}
		if(codigo == celda3.getCodigo()) {
			stockMenos = celda3.getStock() - 1;
			celda3.setStock(stockMenos);
			producto = celda3.getProducto();
			precio = producto.getPrecio();
			saldo = saldo + precio;
		}
		if(codigo == celda4.getCodigo()) {
			stockMenos = celda4.getStock() - 1;
			celda4.setStock(stockMenos);
			producto = celda4.getProducto();
			precio = producto.getPrecio();
			saldo = saldo + precio;
		}
	}
	
	public double venderConCambio(String codigo, double valor) {
		int nuevoStock;
		double cambio = 0.0;
		double precio;
		Producto producto;
		if(celda1.getStock() > 0) {
			if(codigo == celda1.getCodigo()) {
				cambio = valor - saldo;
				producto = celda1.getProducto();
				precio = producto.getPrecio();
				saldo = saldo + precio;
				nuevoStock = celda1.getStock() -1;
				celda1.setStock(nuevoStock);
				
			}
		}
		
		if(celda2.getStock() > 0) {
			if(codigo == celda2.getCodigo()) {
				cambio = valor - saldo;
				producto = celda2.getProducto();
				precio = producto.getPrecio();
				saldo = saldo + precio;
				nuevoStock = celda2.getStock() -1;
				celda2.setStock(nuevoStock);;
				
			}
		}
		
		if(celda3.getStock() > 0) {
			if(codigo == celda3.getCodigo()) {
				cambio = valor - saldo;
				producto = celda3.getProducto();
				precio = producto.getPrecio();
				saldo = saldo + precio;
				nuevoStock = celda3.getStock() -1;
				celda3.setStock(nuevoStock);
				
			}
		}
		
		if(celda4.getStock() >0) {
			if(codigo == celda4.getCodigo()) {
				cambio = valor - saldo;
				producto = celda4.getProducto();
				precio = producto.getPrecio();
				saldo = saldo + precio;
				nuevoStock = celda4.getStock() -1;
				celda4.setStock(nuevoStock);
				
			}
		}
		
		return cambio;
	}
}
