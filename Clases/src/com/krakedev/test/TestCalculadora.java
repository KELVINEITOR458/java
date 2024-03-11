package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		calcu = new Calculadora();
		resultadoSuma = calcu.sumar(5, 3);
		System.out.println("La suma dió: "+ resultadoSuma);
		
		Calculadora rest;
		double resultadoResta;
		rest = new Calculadora();
		resultadoResta = rest.restar(10, 3);
		System.out.println("La resta dió: " + resultadoResta);
		
		Calculadora multi;
		double resultadoMulti;
		multi = new Calculadora();
		resultadoMulti = multi.multiplicar(10, 5);
		System.out.println("La multiplicación dió: " + resultadoMulti);
		
		Calculadora div;
		double resultadoDiv;
		div = new Calculadora();
		resultadoDiv = div.dividir(10, 2);
		System.out.println("La división dió: " + resultadoDiv);
		
		Calculadora prom;
		double promedio;
		prom = new Calculadora();
		promedio = prom.promediar(10, 8, 9);
		System.out.println("El promedio es: " + promedio);
		
		Calculadora resultado;
		resultado = new Calculadora();
		resultado.mostrarResultado();
	}

}
