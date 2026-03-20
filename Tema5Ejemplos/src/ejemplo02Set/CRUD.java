package ejemplo02Set;

import java.util.*;

public class CRUD {

	private Set<Alumno> alumnoSet = new HashSet<>(); // El segundo <> se dice que infiere en la clase y hace referencia
														// a
														// Alumno

	// CREATE

	public boolean agregarAlumno(Alumno a) {
		return alumnoSet.add(a);
	}

	// READ

	public Set<Alumno> obtenerTodos() {
		return Collections.unmodifiableSet(alumnoSet);
	}

	// READ by ID

	public Alumno findById(String dni) {
		for (Alumno alumno2 : alumnoSet) {
			if (alumno2.getDNI() == dni) {
				return alumno2;
			}
		}
		return null;
	}

	// DELETE

	public boolean eliminarAlumno(String dni) {
		Iterator<Alumno> it = alumnoSet.iterator(); // Iterator para recorrer colecciones, es una interfaz
		while (it.hasNext()) {
			Alumno a = (Alumno) it.next();
			if (a.getDNI() == dni) {
				it.remove();
				return true;
			}
		}
		return false;
	}

	// ORDENAR por nota media ascendente

	public List<Alumno> ordenarPorNotaMedia() {
		List<Alumno> lista = new ArrayList<Alumno>();

	}

	// nota media

	public double notaMediaTodos() {
		double suma = 0;

		if (alumnoSet.isEmpty()) {
			return 0.0;
		}
		for (Alumno alumno : alumnoSet) {
			suma += alumno.getNotaMedia();
		}

		return suma / alumnoSet.size();

	}

}
