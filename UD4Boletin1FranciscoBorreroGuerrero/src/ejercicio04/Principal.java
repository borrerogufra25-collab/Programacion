package ejercicio04;

import utilidades.Leer;

/*Hacer un programa que imprima un ticket de compra, basándonos en
un supermercado. Debemos crear la clase Producto genérica y dos
hijas con un atributo más cada una (Alimentación y Electrónica). Cada
producto genérico deberá estar caracterizado por el precio unitario,
nombre, código de identificación, etc.
El precio de los productos de electrónica lleva un impuesto especial
por ser de lujo y la alimentación un descuento cuando le quedan menos
de 2 días para caducar.
Crear la clase Línea de venta, con un producto y una cantidad como
atributos y la clase Venta con un array de líneas de venta.
El ticket debe mostrar una venta completa con varios productos y
varias cantidades. Se pueden crear los productos directamente en el
main antes de empezar.
Agregar un método que solo estará en la clase alimentación, que avise
si al producto le quedan menos de 2 días para caducar.
Crear un main, donde crearemos directamente los objetos necesarios. Solo habrá la opción imprimir
ticket y listar todos los productos guardados, avisando cuando a un producto de alimentación le falten
menos de dos días para caducar. Se pueden crear más métodos si quieres entrenar.*/

public class Principal {

	public static void main(String[] args) {

		// Alimentacion: Precio Unidad, Nombre, iD, descuento Caducidad, dias para
		// caducar
		// Electronica: Precio Unidad, Nombre, iD, impuesto Lujo

		int opcion;
		Producto p; // Para mostrar

		Producto p1 = new Alimentacion(1.37, "Tomate Frito", 02, 20, 4);
		Producto p2 = new Alimentacion(2.84, "Huevos", 01, 20, 1);
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
			System.out.print("Elige una opci�n: ");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:

				venta.imprimirTicket();
				break;

			case 2:
				System.out.println("\n=== LISTA DE PRODUCTOS ===");

				for (int i = 0; i < listaProductos.length; i++) {

					if (listaProductos[i] != null) {
						p = listaProductos[i];
						System.out.println(p);
					}
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
