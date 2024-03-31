package com.krakedev.persistencia.entidades;

import java.util.Date;

public class RegistrosEntrada {
	private int codigo_registro;
	private String cedula;
	private Date fecha;
	private Date hora;
	private Empleado codigo_empleado;
	
	public RegistrosEntrada(String cedula, Empleado codigo_empleado) {
		super();
		this.cedula = cedula;
		this.codigo_empleado = codigo_empleado;
	}
	public RegistrosEntrada(int codigo_registro, String cedula, Empleado codigo_empleado) {
		super();
		this.codigo_registro = codigo_registro;
		this.cedula = cedula;
		this.codigo_empleado = codigo_empleado;
	}
	public RegistrosEntrada(int codigo_registro, String cedula, Date fecha, Date hora, Empleado codigo_empleado) {
		super();
		this.codigo_registro = codigo_registro;
		this.cedula = cedula;
		this.fecha = fecha;
		this.hora = hora;
		this.codigo_empleado = codigo_empleado;
	}
	public int getCodigo_registro() {
		return codigo_registro;
	}
	public void setCodigo_registro(int codigo_registro) {
		this.codigo_registro = codigo_registro;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public Empleado getCodigo_empleado() {
		return codigo_empleado;
	}
	public void setCodigo_empleado(Empleado codigo_empleado) {
		this.codigo_empleado = codigo_empleado;
	}
	@Override
	public String toString() {
		return "RegistrosEntrada [codigo_registro=" + codigo_registro + ", cedula=" + cedula + ", fecha=" + fecha
				+ ", hora=" + hora + ", codigo_empleado=" + codigo_empleado + "]";
	}
	
}
