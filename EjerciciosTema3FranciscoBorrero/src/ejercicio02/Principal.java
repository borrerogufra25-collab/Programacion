package ejercicio02;

import utilidades.Leer;

/*
 * Hacer un programa que calcule el área de un círculo en cm2.
 * Debemos tener la clase Círculo, con un solo atributo llamado radio.
 * En el main, debemos crear un objeto tipo Círculo y llamar a dicho método.
 * Mejorar el programa añadiendo a la clase Círculo otro método que calcule el área del círculo en m2.
 *  
 */

public class Principal {

	public static void main(String[] args) {

		double radio;
		Circulo c;

		System.out.println("Introduzca el radio: ");
		radio = Leer.datoDouble();

		c = new Circulo(radio);

		System.out.printf("El resultado es: %.2f", c.calcularArea());

	}

}
