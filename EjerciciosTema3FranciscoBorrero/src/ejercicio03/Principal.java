package ejercicio03;

import utilidades.Leer;

/*
 * Implementar un programa que contenga dos métodos en una clase “operaciones”: un método 
 * al que se le pase un número entero y diga si este es positivo o negativo y otro que diga 
 * si un número es par o impar. La clase no debe tener ningún atributo. Se deben probar los métodos en el main.
 */

public class Principal {

	public static void main(String[] args) {

		Operaciones o = new Operaciones();

		System.out.println("Introduzca un número y digo si es positivo o negativo:");
		o.esPositivoONegativo(Leer.datoDouble());

		System.out.println("Introduzca un número y digo si es Par o Impar:");
		o.esParOImpar(Leer.datoDouble());

	}

}
