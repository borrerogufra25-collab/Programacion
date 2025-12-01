package ejemploObjetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		double radio, total, pasar;

		// Declaramos el círculo

		Circulo c1;

		// Instanciamos el cículo
		System.out.println("¿Qué radio tiene el círculo?");
		radio = Leer.datoDouble();
		c1 = new Circulo(radio);

		System.out.println("Valores mal hecho: " + c1);

		c1.imprimirDatos();

		System.out.println("Y una más de regalo");

		total = c1.calcularArea();
		System.out.printf("El área es: %.2f\n", total);

		// Ahora la segunda version (NO RECOMENDABLE)

		System.out.printf("El área es: %.2f", c1.calcularAreaV2());

		// Ampliación

		System.out.printf("\nÁrea en m2: %.4f", c1.calcularAreaEnM2());

		System.out.printf("\nÁrea en m2: %.4f", c1.calcularAreaEnM2V2());

	}

}
