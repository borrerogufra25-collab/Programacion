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

		String nombre,curso;
		double[] notas;
		int suspensos;
		int tam;
		double notaMedia;
		GestionNotas g;
		Alumno a;

		System.out.println("Este programa gestiona un alumno\n");
		System.out.println("Introduzca el nombre del alumno:");
		nombre=Leer.dato();
		System.out.println("Introduzca el curso del alumno:");
		curso = Leer.dato();
		System.out.println("¿Cuántas notas quieres introducir?");
		
		
		
		
		
	}

}
