package ejercicio03;

import java.util.*;

public class CRUD {
	private Set<Alumno> listaAlumno = new HashSet<Alumno>();

	// CREATE

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

		for (Alumno alumno : listaAlumno) {
			if (alumno.getId() == id) {
				alumno.setNombre(NuevoNombre);
				return true;
			}
		}
		return false;
	}

	// DELETE

	public boolean eliminarAlumno(int id) {
		for (Alumno alumno : listaAlumno) {
			if (alumno.getId() == id) {
				listaAlumno.remove(alumno);
				return true;
			}
		}
		return false;
	}

	// DELETE CON ITERATOR

	public boolean eliminarAlumnoIterator(int id) {
		Iterator<Alumno> it = listaAlumno.iterator();
		while (it.hasNext()) {
			Alumno alumno = (Alumno) it.next();
			if (alumno.getId() == id) {
				it.remove();
				return true;
			}
		}
		return false;
	}

}
