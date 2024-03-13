package com.cmc.directorio.entidades;

public class AdminTelefono {

	public void activarMensajeria(Telefono tel) {
		if (tel.getOperadora() == "Movi") {
			tel.setTieneWhatsapp(true);
		}
	}

	public int contarMovi(Telefono tel1, Telefono tel2, Telefono tel3) {
		int contador = 0;
		if(tel1.getOperadora() == "Movi") {
			contador = contador + 1;
		}
		if(tel2.getOperadora() == "Movi") {
			contador = contador + 1;
		}
		if(tel3.getOperadora() == "Movi") {
			contador = contador + 1;
		}

		return contador;
	}
}
