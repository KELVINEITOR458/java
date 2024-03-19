package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> personas;
	
	public AdminPersonas() {
		personas = new ArrayList<Persona>();
	}
	public void agregar(Persona persona){
		personas.add(persona);
	}
	
	public void imprimir() {
		Persona elementoPersona;
		for(int i=0; i<personas.size();i++) {
			elementoPersona = personas.get(i);
			System.out.println(elementoPersona.getNombre() + " " + elementoPersona.getApellido() + " " + elementoPersona.getEdad());
		}
	}
	
	public Persona buscarPorNombre(String nombre) {
		Persona personaEncontrada;
		Persona encontrado = null;
		
		for(int i=0; i<personas.size();i++) {
			personaEncontrada = personas.get(i);
			if(nombre.equals(personaEncontrada.getNombre())) {
				encontrado = personaEncontrada;
			}
		}
		
		return encontrado;
	}
	
	public ArrayList<Persona> buscarMayores(int edad){
		ArrayList<Persona> mayores = new ArrayList<Persona>();

		Persona elementoPersona = null;
		for(int i=0; i < personas.size(); i++) {
			elementoPersona = personas.get(i);
			if(elementoPersona.getEdad() > edad) {
				mayores.add(elementoPersona);
			}
		}
		
		return mayores;
	}
}
