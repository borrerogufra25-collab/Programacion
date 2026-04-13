/*
 * Crea un programa que use dos variables, a y b.
 * Si la suma de estas dos variables es mayor que
 * 10, al ejecutarse el programa debe aparecer
 * una excepción que diga "La suma no puede ser
 * mayor que 10". Por lo tanto, dale valores a
 * "a" y a "b" para que su suma sea superior a 10.
 */

package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int a = 4, b = 6, suma;
		boolean bucle = true;

		while (bucle) {

			try {

				System.out.println("Introduce el primer valor:");
				a = Leer.datoInt();
				System.out.println("Introduce el segundo valor:");
				b = Leer.datoInt();

				suma = a + b;

				if (suma > 10) {
					throw new Exception("La suma no puede ser mayor que 10");
				}

				System.out.println("La suma es: " + suma);
				bucle = false;

			} catch (Exception e) {
				System.err.println("Error: " + e.getMessage());
				System.err.println("Prueba otra vez\n");

			}

		}

	}

}
