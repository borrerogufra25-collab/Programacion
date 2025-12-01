package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		double radio, altura, volumen;

		System.out.println("Introduzca el área: ");
		radio = Leer.datoDouble();
		System.out.println("Introduzca la altura: ");
		altura = Leer.datoDouble();

		Cilindro c1 = new Cilindro(radio, altura);

		System.out.printf("El volumen es: %.2f", c1.formulaVolumen());

		System.out.println("\nIntroduzca el área: ");
		radio = Leer.datoDouble();
		System.out.println("Introduzca la altura: ");
		altura = Leer.datoDouble();

		Cilindro c2 = new Cilindro(radio, altura);

		System.out.printf("El volumen es: %.2f", c2.formulaVolumen());

	}

}
