package ejercicio03;

import java.util.*;

public class CRUD {
	private Set<Alumno> listaAlumno = new HashSet<Alumno>();

	// CREATE
	// No se pasan atributos sueltos

	public boolean agregarAlumno(Alumno a) {
		return listaAlumno.add(a);
	}

	// READ by ID

	public Alumno findById(int id) {
		for (Alumno alumno : listaAlumno) {
			if (alumno.getId() == id) {
				return alumno;
			}
		}
		return null;
	}
	


	// READ ALL

	public Set<Alumno> sacarTodos() {
		return Collections.unmodifiableSet(listaAlumno);
	}

	// UPDATE

	public boolean actualizarAlumno(int id, String NuevoNombre) {

		Alumno a = findById(id);

		if (a != null) {
			a.setNombre(NuevoNombre);
			return true;
		}
		return false;

		/*
		 * for (Alumno alumno : listaAlumno) { if (alumno.getId() == id) {
		 * alumno.setNombre(NuevoNombre); return true; } } return false;
		 */
	}

	// DELETE

	public boolean eliminarAlumno(int id) {

		Alumno a = findById(id);

		if (a != null) {
			listaAlumno.remove(a); // No es bueno repetir código de buscar :)
			return true;
		}
		return false;
	}

	// DELETE CON ITERATOR

	public boolean eliminarAlumnoIterator(int id) {
		Iterator<Alumno> it = listaAlumno.iterator();
		while (it.hasNext()) {
			Alumno alumno = it.next();
			if (alumno.getId() == id) {
				it.remove();
				return true;
			}
		}
		return false;
	}
}
