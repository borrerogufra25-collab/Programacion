package ejemplo01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int num, den, solucion = 0, tam = 3, op = 0;
		int[] listaArray = new int[tam];

		do {

			// El try es el código que puede dar algún problema

			try {
				System.out.println("Indique el numerador: ");
				num = Leer.datoInt();
				System.out.println("Indique el denominador ");
				den = Leer.datoInt();
				solucion = num / den;
				System.out.println("El resultado es: " + solucion);
				System.out.println("\nIndique la posición del array");
				num = Leer.datoInt();
				System.out.println(listaArray[num]);
				op = 1;

				// El catch es lo que hay que hacer cuando falle (Normalmente un mensaje)
			} catch (NumberFormatException n) {
				System.err.println("Error de lectura");
			} catch (ArithmeticException a) {
				System.err.println("Error de división");
			} catch (ArrayIndexOutOfBoundsException ar) {
				System.err.println("Fuera de límites del array");
			} catch (Exception e) { // Las genéricas se ponen runTime en vez de Exception
				System.err.println("Error inesperado");
			}

		} while (op != 0);
	}

}
