package bSupplier;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		GenerarRandom gr = new GenerarRandom();
		
		System.out.println(gr.numeroAleatorio.get());
		System.out.println(gr.numeroAleatorio.get());
		System.out.println(gr.numeroAleatorio.get());
		
		System.out.println();
		
		System.out.println();System.out.println();System.out.println();
		GenerarAlumno ga = new GenerarAlumno();
		
		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		int i = 0;
		while ( i < 5) {
			
			listaAlumnos.add(ga.genAlum.get());
			i++;
		}
		
		System.out.println(listaAlumnos);
	}

}
