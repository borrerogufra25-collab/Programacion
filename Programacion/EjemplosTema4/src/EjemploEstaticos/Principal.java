package EjemploEstaticos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		double ganancia = 0.0;

		// Contador de creación de objetos
		Producto p1 = new Producto("Patatas", 10.00);
		System.out.println(p1);

		Producto p3 = new Producto("Cocacola", 20.00);
		System.out.println(p3);

		Producto p4 = new Producto("Lechuga", 1.00);
		System.out.println(p4);

		Gestion g = new Gestion();
		Gestion g2 = new Gestion();
		Gestion g3 = new Gestion();

		// Vendo los productos
		System.out.println("¿Cuánto le va a ganar a los productos?");
		ganancia = Leer.datoDouble();

		g.calcularLineaVenta(ganancia, 1, p1);
		g.calcularLineaVenta(ganancia, 2, p3);

		g2.calcularLineaVenta(ganancia, 3, p1);
		g2.calcularLineaVenta(ganancia, 2, p3);

		g3.calcularLineaVenta(ganancia, 6, p1);
		g3.calcularLineaVenta(ganancia, 3, p3);

		g.mostrarCaja();
		g2.mostrarCaja();
		g3.mostrarCaja();

		// Otro de prueba
		g.calcularLineaVenta(ganancia, 1, p4);
		g.mostrarCaja();

	}

}
