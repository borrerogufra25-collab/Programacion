package ejercicio;

import java.util.*;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion;
		String matricula;
		double precioBase, extra, menoresCantidad;
		boolean conEspeciales = true;
		Coche coche;
		Barco barco = new Barco();

		Coche c1 = new Coche("192323HDS", 17333.43, false);
		Coche c2 = new Coche("742904YRS", 84932.43, true);
		Coche c3 = new Coche("582018WPA", 453452.43, true);

		List<Coche> listaCoches = new ArrayList<Coche>();

		listaCoches.add(c1);
		listaCoches.add(c2);
		listaCoches.add(c3);

		do {
			System.out.println("Probar opciones");
			System.out.println("1. Añadir coche");
			System.out.println("2. Modificar Precio coche");
			System.out.println("3. Mostrar coches");
			System.out.println("4. Buscar coche");
			System.out.println("5. Buscar coches menores de un precio de transporte");
			System.out.println("6. Calcular dinero total");
			System.out.println("7. Ordenar por matrículas");
			System.out.println("8. Ordenar por precio final");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:

				System.out.println("Indique la matrícula");
				matricula = Leer.dato();
				System.out.println("Indique el precio base");
				precioBase = Leer.datoDouble();
				System.out.println("¿Es especial? (Cómo este examen)");
				System.out.println("1. SI 2. NO");
				opcion = Leer.datoInt();
				switch (opcion) {
				case 1:
					conEspeciales = true;
					break;
				case 2:
					conEspeciales = false;

				default:
					System.out.println("Opción incorrecta");
					break;
				}

				listaCoches.add(coche = new Coche(matricula, precioBase, conEspeciales));

				break;

			case 2:
				System.out.println("¿Qué coche quieres modificar? (Indique la matrícula)");
				matricula = Leer.dato();
				System.out.println("Indique su nuevo precio");
				precioBase = Leer.datoDouble();

				if (barco.modificarPrecio(matricula, precioBase)) {
					System.out.println("Cambio hecho");
				} else {
					System.out.println("Operación fallida");
				}

				break;

			case 3:
				System.out.println("Mostrar coches");
				barco.imprimirTodos();

				break;

			case 4:
				System.out.println("Indique la matricula");
				matricula = Leer.dato();
				System.out.println(barco.buscarCoche(matricula));

				break;

			case 5:
				extra = 324.12;
				menoresCantidad = 50000;

				System.out.println(barco.buscarCocheTransporte(extra, menoresCantidad));

				break;

			case 6:
				extra = 453;

				System.out.println("El total es: " + barco.calcularTotalEspec(extra));

				break;

			case 7:

				break;

			case 8:

				break;

			case 0:

				break;

			default:
				System.out.println("Opción incorrecta");
				break;
			}

		} while (opcion != 0);

	}

}
