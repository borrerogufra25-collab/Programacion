package ejercicio01;

import java.util.*;

public class Secretaría {

	List<Alumno> listaAlumnos = new ArrayList<Alumno>();

	public List<Alumno> obtenerTodos() {
		
		return listaAlumnos.stream()
				.filter(Alumno)
				;
		
			

	}

}
