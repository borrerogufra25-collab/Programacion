package ejercicio04Correccion;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion;
		Producto p; // Para mostrar

		Producto p1 = new Alimentacion(1.62, "Leche", 02, 4);
		Producto p2 = new Alimentacion(2.84, "Huevos", 01, 1);
		Producto p3 = new Electronica(600, "Móvil", 07, 15);
		Producto p4 = new Electronica(700, "Play 5", 04, 15);

		Producto[] listaProductos = { p1, p2, p3, p4 };

		LineaVenta lv1 = new LineaVenta(p1, 2);
		LineaVenta lv2 = new LineaVenta(p3, 2);
		LineaVenta lv3 = new LineaVenta(p2, 3);
		LineaVenta lv4 = new LineaVenta(p4, 1);

		LineaVenta[] listaLineaVentas = { lv1, lv2, lv3, lv4 };

		Venta venta = new Venta(listaLineaVentas);

		do {

			System.out.println("\n***** MENÚ *****");
			System.out.println("1. Imprimir ticket");
			System.out.println("2. Listar productos");
			System.out.println("3. Salir");
			System.out.print("Elige una opción: ");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:

				break;

			case 2:
				System.out.println("\n=== LISTA DE PRODUCTOS ===");

				for (int i = 0; i < listaProductos.length; i++) {

					p = listaProductos[i];
					System.out.println(p);
				}
				break;

			case 3:

				System.out.println("¡Hasta pronto!");
				break;

			default:

				System.out.println("Opción no válida");
				break;
			}

		} while (opcion != 3);

	}

}