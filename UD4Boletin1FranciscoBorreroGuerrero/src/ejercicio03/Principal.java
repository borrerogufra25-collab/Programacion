package ejercicio03;

public class Principal {

	public static void main(String[] args) {

		// Todo esto sería leyendo por teclado
		// Como siempre se declara arriba y se instancia abajo

		Vehiculos v;

		Coche c = new Coche(3, 2.80);
		System.out.println(c);

		System.out.printf("Impuesto del coche: ", c.calcularImpuesto(25));

		v = new Vehiculos(0);
		System.out.println(v);

	}

}
