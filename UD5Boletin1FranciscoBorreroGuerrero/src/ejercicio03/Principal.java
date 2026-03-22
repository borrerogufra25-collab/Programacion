/*Realizar un programa que guarde Alumnos de una clase. Se deben poder mostrar, modificar y borrar
los que se quiera de forma individual, es decir, el usuario debe decir qui�n quiere mostrar, modificar
o borrar. Se puede crear otra clase con funcionalidades como sacar nota media del curso, dar el n�mero
de suspensos en total, media de suspensos, etc. Usa la interfaz Set implementada por HashSet.*/

package ejercicio03;

import java.util.*;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion, id, suspensos;
		String nombre, dni;
		double nota, media;
		List<Double> listaNotas = new ArrayList<Double>();
		Alumno alumno;

		CRUD metodosCRUD = new CRUD();
		GestionAlumno gA = new GestionAlumno();

		List<Double> notas1 = Arrays.asList(7.5, 8.0, 6.0);
		List<Double> notas2 = Arrays.asList(4.0, 3.5, 5.0);
		List<Double> notas3 = Arrays.asList(9.0, 8.5, 9.5);

		Alumno a1 = new Alumno("Francisco Borrero", 1, "54834721A", notas1);
		Alumno a2 = new Alumno("Ángel Mandarino", 2, "958375901B", notas2);
		Alumno a3 = new Alumno("Miguel Algo", 3, "01852539A", notas3);

		metodosCRUD.agregarAlumno(a1);
		metodosCRUD.agregarAlumno(a2);
		metodosCRUD.agregarAlumno(a3);

		do {
			System.out.println("\n****** MENÚ ALUMNOS ******");
			System.out.println("1. Agregar alumno");
			System.out.println("2. Mostrar alumno por ID");
			System.out.println("3. Mostrar todos los alumnos");
			System.out.println("4. Modificar nombre de un alumno");
			System.out.println("5. Borrar alumno");
			System.out.println("6. Nota media de un alumno");
			System.out.println("7. Número de suspensos de un alumno");
			System.out.println("8. Media de suspensos de un alumno");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");
			opcion = Leer.datoInt();

			switch (opcion) {

			case 1:
				System.out.print("Nombre: ");
				nombre = Leer.dato();
				System.out.print("ID: ");
				id = Leer.datoInt();
				System.out.print("DNI: ");
				dni = Leer.dato();

				System.out.println("Introduce notas (negativo para terminar):");
				do {
					nota = Leer.datoDouble();
					if (nota >= 0)
						listaNotas.add(nota);
				} while (nota >= 0);

				alumno = new Alumno(nombre, id, dni, listaNotas);
				metodosCRUD.agregarAlumno(alumno);
				System.out.println("Alumno agregado.");
				break;

			case 2:
				System.out.println("Introduce ID: ");
				id = Leer.datoInt();
				System.out.println(alumno = metodosCRUD.findById(id));
				break;

			case 3:
				System.out.println("\n***** Lista de alumnos *****");
				for (Alumno alumno1 : metodosCRUD.sacarTodos()) {
					System.out.println(alumno1);
				}
				break;

			case 4:
				System.out.print("ID del alumno a modificar: ");
				id = Leer.datoInt();
				System.out.print("Nuevo nombre: ");
				nombre = Leer.dato();

				if (metodosCRUD.actualizarAlumno(id, nombre))
					System.out.println("Alumno actualizado.");
				else
					System.out.println("No existe ese alumno.");
				break;

			case 5:
				System.out.print("ID del alumno a borrar: ");
				id = Leer.datoInt();
				if (metodosCRUD.eliminarAlumno(id))
					System.out.println("Alumno eliminado.");
				else
					System.out.println("No existe ese alumno.");
				break;

			case 6:
				System.out.print("ID del alumno: ");
				id = Leer.datoInt();
				media = gA.sacarNotaMedia(id);
				System.out.printf("\nNota media: %.2f", media);
				break;

			case 7:
				System.out.print("ID del alumno: ");
				id = Leer.datoInt();
				suspensos = gA.sacarNumSuspensos(id);
				System.out.println("Número de suspensos: " + suspensos);
				break;

			case 8:
				System.out.print("ID del alumno: ");
				id = Leer.datoInt();
				media = gA.sacarMediaSuspensos(id);
				System.out.println("Media de suspensos: " + media);
				break;

			case 0:
				System.out.println("¡Hasta pronto!");
				break;

			default:
				System.out.println("Opción no válida.");
				break;
			}

		} while (opcion != 0);

	}

}
