package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int entero) {
		String valor = "0" +  entero;
		return valor;
	}
	
	public static String formatearDia(int entero) {
		String dia = null;
		if(entero == 1) {
			dia = "LUNES";
		}else if(entero == 2) {
			dia = "MARTES";
		}else if(entero == 3) {
			dia = "MIERCOLES";
		}else if(entero == 4) {
			dia = "JUEVES";
		}else if(entero == 5) {
			dia = "VIERNES";
		}else if(entero == 6) {
			dia = "SABADO";			
		}else if(entero == 7) {
			dia = "DOMINGO";
		}
		
		return dia;
	}
	
	
	
	
}
