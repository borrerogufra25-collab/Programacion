package examenTipoA;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		String nombreApellido;
		int opcion;
		int contador = 1;
		int id;
		int antiguedad;
		int horasTrabajadas;
		double presupuestoTotal = 100000;
		Profesor p = new Profesor[100];
		Profesor pPrueba = new Profesor("Pepe García", 3, 5, 8);
		Administracion ad;
		Profesor[] p2 = { new Profesor("Pepe García", 3, 5, 8) };
		ad = new Administracion(p2, 10000);

		do {
			System.out.println("*** MENU DE ADMINISTRACIÓN ***");
			System.out.println("1. Agregar un profesor");
			System.out.println("2. Buscar profesor por ID");
			System.out.println("3. Buscar profesores por antigüedad");
			System.out.println("4. Calcular la suma de todas las nóminas");
			System.out.println("5. Comprobar sueldo profesor");
			System.out.println("6. Modificar el número de horas de un profesor");
			System.out.println("7. Calcular cuánto queda del presupuesto después de pagar todos los sueldos");
			System.out.println("8. Mostrar los datos de los profesores");
			System.out.println("9. Calcular porcentaje del total se ha gastado en un profesor");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.println("Indique el nombre y apellido del profesor");
				nombreApellido = Leer.dato();
				System.out.println("Indique su identificador");
				id = Leer.datoInt();
				System.out.println("Indique sus años de antigüedad");
				antiguedad = Leer.datoInt();
				System.out.println("Indique sus horas trabajadas");
				horasTrabajadas = Leer.datoInt();

				p = new Profesor(nombreApellido, id, antiguedad, horasTrabajadas);
				ad.agregarProfesor(p, contador);

				contador++;

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;

			default:
				System.out.println("Opción incorrecta");
				break;
			}

		} while (opcion != 0);

	}

}
