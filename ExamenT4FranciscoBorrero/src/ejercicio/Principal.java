package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion = 0;

		Avion a1 = new NaveEspaciales(2, 13.5, 50.2, 2, true);
		Avion a2 = new NaveEspaciales(3, 40.2, 12.4, 3, false);
		Avion a3 = new NaveEspaciales(4, 13.2, 70.3, 2, true);

		Avion a4 = new CazasMilitares(5, 20.3, 40.1, 3);
		Avion a5 = new CazasMilitares(6, 12.4, 20.1, 5);
		Avion a6 = new CazasMilitares(7, 23.1, 30.6, 3);

		Avion[] listaAviones = { a1, a2, a3, a4, a5, a6 };

		Aeropuerto ae1 = new Aeropuerto("Aeropuerto Tortuga", listaAviones);

		double precioLongitud, precioTopeLitro, topeLitros, porcetanjeMotores, precioPorMisil, precioPorAterrizaje = 0,
				porcentajeExtras = 0;
		int topeMotores, id;

		System.out.println("Bienvenido a Aeropuerto Tortuga");
		System.out.println("Antes de comenzar configure los siguientes valores:");
		System.out.println("Indique a cuanto se cobra la longitud del avión:");
		precioLongitud = Leer.datoDouble();
		System.out.println("Indique a cuanto se cobra por tener más litros extras");
		precioTopeLitro = Leer.datoDouble();
		System.out.println("¿Cuál es la cantidad máxima de litros?");
		topeLitros = Leer.datoDouble();
		System.out.println("¿Qué porcentaje se cobra de extra por motores?");
		porcetanjeMotores = Leer.datoDouble();
		System.out.println("¿A cuanto sale el precio por misil?");
		precioPorMisil = Leer.datoDouble();
		System.out.println("Por último, ¿cuál es el tope de motores permitidos para cobrar el exra?");
		topeMotores = Leer.datoInt();
		System.out.println("Gracias por su paciencia");

		do {

			System.out.println("Eliga una opción: ");
			System.out.println("1. Calcular el precio del aterrizaje indicando el avión");
			System.out.println("2. Calcular el total recaudado");
			System.out.println("3. Mostrar aviones");
			System.out.println("0. Para salir");

			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.println("Indique el ID: ");
				id = Leer.datoInt();

				System.out.printf("El precio es: %.2f €\n",
						ae1.calcularAterrizajeElegido(id, precioLongitud, precioTopeLitro, topeLitros,
								porcetanjeMotores, topeMotores, precioPorMisil, precioPorAterrizaje, porcentajeExtras));

				break;

			case 2:

				System.out.printf("El total recaudado es: %.2f €\n",
						ae1.calcularTotalRecaudado(precioLongitud, precioTopeLitro, topeLitros, porcetanjeMotores,
								topeMotores, precioPorMisil, precioPorAterrizaje, porcentajeExtras));

				break;
			case 3:

				ae1.mostrarAviones();

				break;

			case 0:
				System.out.println("Gracias por usar el programa. ¡Hasta pronto!");

			default:
				System.out.println("Opción incorrecta");
				break;
			}

		} while (opcion != 0);

	}

}
