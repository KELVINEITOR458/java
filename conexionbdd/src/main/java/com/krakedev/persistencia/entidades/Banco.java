package com.krakedev.persistencia.entidades;

public class Banco {
	private int codigoBanco;
	private Transacciones codigoTransaccion;
	private String detalle;
	public Banco() {
		
	}
	
	
	public Banco(Transacciones codigoTransaccion) {
		super();
		this.codigoTransaccion = codigoTransaccion;
	}


	public Banco(Transacciones codigoTransaccion, String detalle) {
		super();
		this.codigoTransaccion = codigoTransaccion;
		this.detalle = detalle;
	}

	public Banco(int codigoBanco, Transacciones codigoTransaccion, String detalle) {
		super();
		this.codigoBanco = codigoBanco;
		this.codigoTransaccion = codigoTransaccion;
		this.detalle = detalle;
	}
	public int getCodigoBanco() {
		return codigoBanco;
	}
	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	public Transacciones getCodigoTransaccion() {
		return codigoTransaccion;
	}
	public void setCodigoTransaccion(Transacciones codigoTransaccion) {
		this.codigoTransaccion = codigoTransaccion;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	@Override
	public String toString() {
		return "Banco [codigoBanco=" + codigoBanco + ", codigoTransaccion=" + codigoTransaccion + ", detalle=" + detalle
				+ "]";
	}
	
}
