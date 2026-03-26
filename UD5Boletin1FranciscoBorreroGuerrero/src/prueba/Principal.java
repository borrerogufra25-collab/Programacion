package prueba;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		int opcion;
		CRUD crud = new CRUD();

		List<Double> notas1 = Arrays.asList(3.2, 5.2, 8.6);
		List<Double> notas2 = Arrays.asList(3.2, 5.2, 8.6);
		List<Double> notas3 = Arrays.asList(3.2, 5.2, 8.6);

		Alumno a1 = new Alumno("Fran", 27, 01, notas1);
		Alumno a2 = new Alumno("Pepito", 23, 03, notas2);

		crud.add(a1);

		do {

			switch (opcion) {
			case 1:

				break;

			default:
				break;
			}

		} while (opcion != 0);

	}

}
