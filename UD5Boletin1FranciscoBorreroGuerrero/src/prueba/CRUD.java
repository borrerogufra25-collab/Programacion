package prueba;

import java.util.*;

public class CRUD {

	private Set<Alumno> listaAlumnos = new HashSet<Alumno>();

	// Create

	public boolean add(Alumno a) {
		return listaAlumnos.add(a);

	}

	// read

	public Alumno findById(int id) {

		for (Alumno alumno : listaAlumnos) {
			if (alumno.getId() == id) {
				return alumno;
			}
		}
		return null;
	}

	// Todos

	public Set<Alumno> sacartodos() {
		return Collections.unmodifiableSet(listaAlumnos);
	}

	// Update

	public boolean actualizar(int id, int nuevaEdad) {
		Alumno a = findById(id);

		if (a != null) {
			a.setEdad(nuevaEdad);
			return true;
		}
		return false;
	}

	// Delete

	public boolean borrar(int id) {
		Alumno a = findById(id);

		if (a != null) {
			listaAlumnos.remove(a);
			return true;
		}
		return false;
	}

	// DElete iterator

	public boolean borrarIterator(int id) {
		Iterator<Alumno> it = listaAlumnos.iterator();
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
