/* Crear un programa que convierta los grados Celsius a Fahrenheit
 * y que tenga previsto un mecanismo para que al introducir una 
 * temperatura menor a -273 ºC, aparezca algún mensaje: “no puede
 * haber temperaturas menores a -273 ºC” y vuelva a pedir la temperatura.
 */

package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int celsius, bucle = 1;
		double resultado;
		Operaciones o = new Operaciones();

		do {
			try {
				System.out.print("Introduce la temperatura en grados Celsius: ");
				celsius = Leer.datoInt();

				o.validarTemperatura(celsius);

				resultado = o.pasarCelsius(celsius);
				System.out.println("La temperatura en Fahrenheit es: " + resultado + " ºF");

			} catch (Exception e) {
				System.out.println(e.getMessage() + ". Inténtalo de nuevo.\n");
			}
		} while (bucle != 0);

	}

}
