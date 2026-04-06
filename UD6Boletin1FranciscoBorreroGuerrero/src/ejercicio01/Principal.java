/* Realizar un programa que haga las operaciones básicas de una
 * calculadora solo con números enteros (sumar, resta, multiplicar,
 * dividir y raíz cuadrada) teniendo en cuenta las posibles
 * excepciones que se pueden producir (entrada de datos, división
 * por cero, raíz de un número negativo, etc.)*/

package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int num1, num2, resultado, opcion = 0;

		do {
			try {
				System.out.println("\n\n --- Mini Calculadora ---");
				System.out.println("1. Suma");
				System.out.println("2. Resta");
				System.out.println("3. Multiplicación");
				System.out.println("4. División");
				System.out.println("5. Par o impar");
				System.out.println("0. Salir");
				System.out.println("Elegir opción: ");
				opcion = Leer.datoInt();

				switch (opcion) {

				case 1:
					System.out.println("Introduce el primer número: ");
					num1 = Leer.datoInt();
					System.out.println("Introduce el segundo número: ");
					num2 = Leer.datoInt();
					resultado = num1 + num2;
					System.out.printf("\nResultado: %.2f", resultado);
					break;

				case 2:
					System.out.println("Introduce el primer número: ");
					num1 = Leer.datoInt();
					System.out.println("Introduce el segundo número: ");
					num2 = Leer.datoInt();
					resultado = num1 - num2;
					System.out.printf("\nResultado: %.2f", resultado);
					break;

				case 3:
					System.out.println("Introduce el primer número: ");
					num1 = Leer.datoInt();
					System.out.println("Introduce el segundo número: ");
					num2 = Leer.datoInt();
					resultado = num1 * num2;
					System.out.printf("\nResultado: %.2f", resultado);

					break;

				case 4:
					System.out.println("Introduce el dividendo: ");
					num1 = Leer.datoInt();
					System.out.println("Introduce el divisor: ");
					num2 = Leer.datoInt();

					resultado = num1 / num2;
					System.out.printf("\nResultado: %.2f", resultado);

					break;

				case 5:
					System.out.println("Introduce un número entero: ");
					num1 = Leer.datoInt();
					if (num1 % 2 == 0) {
						System.out.println(num1 + " es par");

					} else {
						System.out.println(num1 + " es impar");
					}

					break;

				case 0:
					System.out.println("Gracias por usar nuestro programa");

					break;

				default:
					System.out.println("Opción incorrecta");
					break;
				}

			} catch (RuntimeException r) {
			}

		} while (opcion != 0);

	}

}
