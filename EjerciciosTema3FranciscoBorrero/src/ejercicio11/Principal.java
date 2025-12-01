package ejercicio11;

import utilidades.Leer;

/*
 * Crear un programa para poner las notas de un alumno (clase Alumno con atributos). 
 * Los atributos de un alumno son su nombre, curso, un array de notas, número de suspensos 
 * y nota media. En una clase GestionNotas, el programa debe poder poner notas a un solo 
 * alumno, mostrar todas sus notas por pantalla, modificar una nota, calcular la media y 
 * dar su número de suspensos. Probar todo en la clase Principal.  
 */

public class Principal {

	public static void main(String[] args) {

		String nombre, curso;
		double[] notas;
		int opcion, opcionNotas, suspensos = 0, tam;
		double notaMedia = 0;
		GestionNotas g;
		Alumno a;

		System.out.println("Este programa gestiona un alumno\n");
		System.out.println("Introduzca el nombre del alumno:");
		nombre = Leer.dato();
		System.out.println("Introduzca el curso del alumno:");
		curso = Leer.dato();
		System.out.println("¿Cuántas notas quieres introducir?");
		tam = Leer.datoInt();
		notas = new double[tam];

		a = new Alumno(nombre, curso, notas, suspensos, notaMedia);
		g = new GestionNotas(a);

		System.out.println("Introduzca la/s " + tam + " nota/s:");

		for (int i = 0; i < notas.length; i++) {
			System.out.println(i + 1 + "º nota: ");
			notas[i] = Leer.datoDouble();
		}

		do {
			System.out.println("\nOpciones con: " + nombre + " de " + curso);
			System.out.println("1. Mostrar notas");
			System.out.println("2. Modificar nota");
			System.out.println("3. Calcular nota media");
			System.out.println("4. Mostrar número de suspensos");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				g.mostrarNotas();
				break;

			case 2:

				do {
					System.out.println("¿Qué nota quiere modificar?\n");
					g.mostrarNotas();
					opcionNotas = Leer.datoInt();
					System.out.println("Introduzca la nueva nota: ");
					notas[opcionNotas - 1] = Leer.datoDouble();
					System.out.println("Notas actualizadas: ");
					g.mostrarNotas();
					System.out.println("¿Desea cambiar otra nota?\n1. Si\n0. No");
					opcionNotas = Leer.datoInt();

				} while (opcionNotas != 0);

				break;

			case 3:
				System.out.printf("La nota media es: %.2f", g.calcularMedia());
				break;

			case 4:
				System.out.println("El alumno tiene " + g.montrarSuspensos() + " suspensos");
				break;

			case 0:
				System.out.println("Gracias por usar el programa.");
				break;

			default:

				System.out.println("Opción incorrecta.");

				break;
			}

		} while (opcion != 0);

	}
}
