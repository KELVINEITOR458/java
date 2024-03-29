package com.krakedev.estaticos;

public class Calculos {
	//con "final" hace que las variables tengan un valor que no se puede cambiar
	//las constantes siempre van en MAYUSCULAS
	private final double IVA = 12;
	
	public double calcularIva(double monto) {
		return (monto * IVA)/100;
	}
	
	
}
