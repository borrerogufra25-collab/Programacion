package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int celsius, fahrenheit, opcion = 0;
		double resultado;

		do {
			System.out.println("*** Calculadora de conversión de temperatura ***");
			System.out.println("1. Pasar Celsius a Fahrenheit");
			System.out.println("2. Pasar Fahrenheit a Celsius");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.println("Indique los Celsius a pasar: ");
				celsius = Leer.datoInt();
				resultado = (celsius * 9 / 5) + 32;
				System.out.printf("%dº Celsius es igual a %.2f", celsius, resultado);
				break;

			case 2:
				System.out.println("Indique los Fahrenheit a pasar: ");
				fahrenheit = Leer.datoInt();
				resultado = (fahrenheit - 32) * 5 / 0;
				break;

			default:
				System.out.println("Opción Incorrecta.");
				break;
			}

		} while (opcion != 0);

	}

}
