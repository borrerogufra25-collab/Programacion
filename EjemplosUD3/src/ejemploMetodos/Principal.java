package ejemploMetodos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int total, num1, num2;

		Operaciones op = new Operaciones();

		System.out.println("Introduzca el 1º número: ");
		num1 = Leer.datoInt();
		System.out.println("Introduzca el 2º número: ");
		num2 = Leer.datoInt();

		total = op.sumarDosEnteros(num1, num2);

		// Para imprimir. Opción a
		// Guardo el resultado en una variable y la muestro

		System.out.println("Resultado: " + total);

		// Opción b
		// Mostrar directamente en el syso

		System.out.println("Resultado: " + op.sumarDosEnteros(num1, num2));

		// Resta

		System.out.println("Resultado resta: " + op.restarDosEnteros(num1, num2));

		// Multiplicación

		System.out.println("Resultado multiplicación: " + op.multiplicarDosEnteros(num1, num2));

		// División

		System.out.println("Resultado división: " + op.dividirDosEnteros(num1, num2));

	}

}
