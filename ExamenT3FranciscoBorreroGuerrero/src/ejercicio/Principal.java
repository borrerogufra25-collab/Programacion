package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion, id = 1, edad, horasEstudio, contador = 1;
		double presupuestoTotal = 1000.0, cantidad, porceBote;

		String nombre;
		Hijo[] listaHijos = new Hijo[10];
		Hijo h;
		Hijo hPrueba = new Hijo("Pepe", 0, 14, 3);
		GestionFamiliar gF = new GestionFamiliar(listaHijos, presupuestoTotal);

		do {

			System.out.println("** MENU PAPI PROGRAMADOR\n");
			System.out.println("1. Añadir hijo");
			System.out.println("2. Buscar hijo (Por ID)");
			System.out.println("3. Buscar menores de 14 años");
			System.out.println("4. Mostrar gastos para los mayores de 14 años");
			System.out.println("5. Modificar horas de estudio de un hijo (Por ID)");
			System.out.println("6. Mostrar hijos");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.println("Diga el nombre:");
				nombre = Leer.dato();
				System.out.println("Diga el ID:");
				id = Leer.datoInt();
				System.out.println("Diga la edad:");
				edad = Leer.datoInt();
				System.out.println("Diga cuántas horas ha estudiado:");
				horasEstudio = Leer.datoInt();
				h = new Hijo(nombre, id, edad, horasEstudio);
				gF.agregarHijo(h, contador);
				contador++;

				break;

			case 2:
				System.out.println("Introduzca el ID de su hijo:");
				id = Leer.datoInt();
				gF.buscarHijo(id);
				System.out.println(gF.buscarHijo(id));

				break;

			case 3:

				gF.buscarMenores();
				System.out.println(gF.buscarMenores());

				break;
			case 4:

				System.out.println("Indique de cuánto es la paga");
				cantidad = Leer.datoDouble();
				System.out.println("Indique de cuanto es el porcentaje para el bote");
				porceBote = Leer.datoDouble();

			//	gF.pagarMayores(h.calcularPaga(cantidad, porceBote / 100));

				break;
			case 5:

				break;
			case 6:

				break;
			case 0:
				System.out.println("¡¡Gracias por usar el programa!!");
				break;

			default:
				System.out.println("Opción incorrecta");
				break;
			}

		} while (opcion != 0);

	}

}
