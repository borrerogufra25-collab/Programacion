package ejemploAbstracto;

public class Principal {

	public static void main(String[] args) {

		// Figura2D f = new Figura2D(); Esto no se puede, vamos no funciona. No se puede
		// instanciar clases abstractas

		Circulo c = new Circulo(2.3, 2.7, 6.4);

		System.out.println(c);

		Cuadrado cua = new Cuadrado(2.75, 2.98, 2.1);

		System.out.println(cua);

		System.out.printf("\n¡rea del cÌculo: %.2f", c.calcularArea());
		System.out.printf("\n¡rea del cuadrado: %.2f", cua.calcularArea());

	}

}
