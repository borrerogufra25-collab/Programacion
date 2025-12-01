package examenTipoA;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		String nombreApellido;
		int opcion;
		int id;
		int antiguedad;
		int horasTrabajadas;
		double presupuestoTotal;
		Profesor[] p;
		Administracion ad;
		Profesor[] p2 = { ("Pepe García", 3, 5, 8 )};
		Administracion ad2 = new Administracion(p2, 10000);

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
