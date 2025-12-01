package ejercicio01;

import utilidades.Leer;

/*
 * Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos debe ser 
 * precio de fábrica y otro, si es frágil o no). En esta clase se debe tener el método
 * para calcular el precio de coste, que será el precio de fábrica más un porcentaje 
 * pasado como parámetro que será el coste en el transporte. 
 * */

public class Principal {

	public static void main(String[] args) {

		String nombre;
		String categoria;
		double precio;
		boolean fragil;
		int cantidad;
		int indice;
		double porcentajeTransporte;
		double porcentajeVenta;
		int opcionFragil;

		Tienda t = new Tienda("Carrefour", 10);

		int opcion;
		do {
			System.out.println("\n--- MENÚ TIENDA ---");
			System.out.println("1. Añadir producto");
			System.out.println("2. Listar productos");
			System.out.println("3. Comprobar si producto es frágil");
			System.out.println("4. Calcular inversión");
			System.out.println("5. Calcular PVP");
			System.out.println("6. Calcular ganancias");
			System.out.println("0. Salir");
			System.out.print("Elige opción: ");
			opcion = Leer.datoInt();

			switch (opcion) {

			case 1:
				System.out.print("Nombre: ");
				nombre = Leer.dato();

				System.out.print("Categoría: ");
				categoria = Leer.dato();

				do {
					System.out.print("Precio fábrica: ");
					precio = Leer.datoDouble();
					if (precio < 0) {
						System.out.println("El precio no puede ser negativo.");
					}
				} while (precio < 0);

				System.out.print("¿Es frágil? Pulse 1 para si otro número para no: ");
				opcionFragil = Leer.datoInt();
				fragil = (opcionFragil == 1);

				do {
					System.out.print("Cantidad: ");
					cantidad = Leer.datoInt();
					if (cantidad < 0) {
						System.out.println("La cantidad no puede ser negativa.");
					}
				} while (cantidad < 0);

				t.agregarProducto(new Producto(nombre, categoria, precio, fragil, cantidad));
				break;

			case 2:
				System.out.println("\n--- LISTADO DE PRODUCTOS ---");
				t.listarProductos();
				break;

			case 3:
				System.out.print("Introduce índice del producto: ");
				indice= Leer.datoInt();

				if (indice < 0 || indice >= t.getProductos().length || t.getProductos()[indice] == null) {
					System.out.println("Índice no válido o producto inexistente.");
				} else {
					System.out.println("¿Es frágil? " + t.esFragil(indice));
				}
				break;

			case 4:
				System.out.print("Porcentaje transporte: ");
				porcentajeTransporte = Leer.datoDouble();

				System.out.println("Inversión total: " + t.calcularInversion(porcentajeTransporte) + " €");
				break;

			case 5:
				System.out.print("Porcentaje transporte: ");
				porcentajeTransporte = Leer.datoDouble();

				System.out.print("Porcentaje venta: ");
				porcentajeVenta = Leer.datoDouble();

				System.out.println("PVP total: " + t.calcularPVP(porcentajeTransporte, porcentajeVenta) + " €");
				break;

			case 6:
				System.out.print("Porcentaje transporte: ");
				porcentajeTransporte = Leer.datoDouble();

				System.out.print("Porcentaje venta: ");
				porcentajeVenta = Leer.datoDouble();

				System.out.println("Ganancias: " + t.calcularGanancias(porcentajeTransporte, porcentajeVenta) + " €");
				break;

			case 0:
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Opción no válida.");
			}
		} while (opcion != 0);
	}
}
