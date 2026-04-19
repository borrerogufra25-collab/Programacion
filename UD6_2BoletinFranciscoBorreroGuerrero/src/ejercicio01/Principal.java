package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		Secretaria sec = new Secretaria();
		int opcion;

		Alumno a1 = new Alumno(1, 19, "Alejandro", "Ruiz", "1DAM", 8.5);
		Alumno a2 = new Alumno(2, 20, "Beatriz", "López", "1DAM", 9.2);
		Alumno a3 = new Alumno(3, 21, "Carlos", "Martín", "2DAM", 7.8);
		Alumno a4 = new Alumno(4, 18, "Ana", "García", "1DAM", 9.8);
		Alumno a5 = new Alumno(5, 22, "David", "Santos", "2DAM", 6.9);
		Alumno a6 = new Alumno(6, 19, "Alberto", "Pérez", "1DAM", 5.5);
		Alumno a7 = new Alumno(7, 20, "Lucía", "Moreno", "2DAM", 8.9);
		Alumno a8 = new Alumno(8, 18, "Adriana", "Torres", "1DAM", 7.4);
		Alumno a9 = new Alumno(9, 23, "Sergio", "Hidalgo", "2DAM", 9.1);
		Alumno a10 = new Alumno(10, 17, "Alicia", "Navarro", "1DAM", 9.7);

		sec.addAlumno(a1);
		sec.addAlumno(a2);
		sec.addAlumno(a3);
		sec.addAlumno(a4);
		sec.addAlumno(a5);
		sec.addAlumno(a6);
		sec.addAlumno(a7);
		sec.addAlumno(a8);
		sec.addAlumno(a9);
		sec.addAlumno(a10);

		do {
			System.out.println("\n--- MENÚ DE SECRETARÍA ---");
			System.out.println("1. Mostrar todos los alumnos");
			System.out.println("2. Imprimir alumnos por letra inicial");
			System.out.println("3. Contar alumnos");
			System.out.println("4. Mostrar alumnos por curso y nota mínima");
			System.out.println("5. Imprimir los 3 primeros alumnos");
			System.out.println("6. Obtener alumno menor de edad");
			System.out.println("7. Obtener primer alumno");
			System.out.println("8. Obtener alumnos con nombre > X letras");
			System.out.println(
					"9. Obtener alumnos que empiezan por letra y nombre <= tamaño");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");

			opcion = Leer.datoInt();

			switch (opcion) {

				case 1 :
					System.out.println("\n--- TODOS LOS ALUMNOS ---");
					sec.imprimirTodos();
					break;

				case 2 :
					System.out.print("Introduce la letra: ");
					String letra = Leer.dato();
					sec.imprimirPorLetra(letra);
					break;

				case 3 :
					System.out.println(
							"Total de alumnos: " + sec.contarAlumnos());
					break;

				case 4 :
					System.out.print("Introduce el curso (ej: 1DAM): ");
					String curso = Leer.dato();
					System.out.print("Introduce la nota mínima: ");
					double nota = Leer.datoDouble();
					System.out.println(sec.obtenerAlumnoNota(curso, nota));
					break;

				case 5 :
					System.out.println("\n--- PRIMEROS 3 ALUMNOS ---");
					sec.imprimirTresPrimeros();
					break;

				case 6 :
					System.out.println("\n--- ALUMNO MENOR DE EDAD ---");
					System.out.println(sec.obtenerAlumnoMenor());
					break;

				case 7 :
					System.out.println("\n--- PRIMER ALUMNO ---");
					System.out.println(sec.obtenerPrimero());
					break;

				case 8 :
					System.out.print("Introduce número mínimo de letras: ");
					int tam = Leer.datoInt();
					System.out.println(sec.obtenerAlumnosMuchasLetras(tam));
					break;

				case 9 :
					System.out.print("Introduce la letra inicial: ");
					String letra2 = Leer.dato();
					System.out.print("Introduce el tamaño máximo del nombre: ");
					int maxTam = Leer.datoInt();
					System.out
							.println(sec.filtrarAlumnoLetraTam(letra2, maxTam));
					break;

				case 0 :
					System.out.println("Saliendo del programa...");
					break;

				default :
					System.out.println("Opción no válida.");
			}

		} while (opcion != 0);
	}
}