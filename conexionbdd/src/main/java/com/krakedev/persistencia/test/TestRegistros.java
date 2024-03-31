package com.krakedev.persistencia.test;


import java.util.Date;

import com.krakedev.persistencia.entidades.Empleado;
import com.krakedev.persistencia.entidades.RegistrosEntrada;
import com.krakedev.persistencia.servicios.AdminBanco;
import com.krakedev.persistencia.servicios.AdminRegistros;
import com.krakedev.persistencia.utils.Convertidor;

public class TestRegistros {

	public static void main(String[] args) {
		/*Empleado e = new Empleado(2203, "KELVINEITOR");
		try {
			Date fecha = Convertidor.convertirFecha("2006/26/06");
			Date hora = Convertidor.convertirHora("03:33");
			e.setFecha(fecha);
			e.setHora(hora);
			
			RegistrosEntrada re = new RegistrosEntrada(4586, "1727039458", e);
			Date fechaRe = Convertidor.convertirFecha("2024/03/31");
			Date horaRe = Convertidor.convertirHora("18:10");
			re.setFecha(fechaRe);
			re.setHora(horaRe);
			
			AdminRegistros.insertar(re);
		} catch (Exception e1) {
			System.out.println("error en el sistema: " + e1.getMessage());
		}*/
		
		//Test de actualizacion
		/*Empleado e = new Empleado(2203, "KELVINEITOR");
		RegistrosEntrada re = new RegistrosEntrada( "6666039458", e);

		try {
			Date fechaRe;
			fechaRe = Convertidor.convertirFecha("1966/06/06");
			Date horaRe = Convertidor.convertirHora("06:06");
			re.setFecha(fechaRe);
			re.setHora(horaRe);
			
			AdminRegistros.actualizar(re);
		} catch (Exception e1) {
			System.out.println("error en el sistema: " + e1.getMessage());
		}*/
		
		
		//Test de ELIMINAR
		int codigo = 2203;
		try {
			AdminRegistros.eliminar(codigo);
		} catch (Exception e1) {
			System.out.println("error en el sistema: " + e1.getMessage());
			}
		
	}
	
	

}
