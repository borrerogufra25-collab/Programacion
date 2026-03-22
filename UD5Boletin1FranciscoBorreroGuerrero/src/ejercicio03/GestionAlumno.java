// como sacar nota media del curso, dar el número de suspensos en total, media
// de suspensos, etc.

package ejercicio03;

import java.util.*;

public class GestionAlumno {

	private CRUD metodosCRUD = new CRUD();

	public double sacarNotaMedia(int id) {
		Alumno alumno = metodosCRUD.findById(id);
		double suma = 0;

		if (alumno == null) {
			return -1;
		}

		List<Double> listaNotas = alumno.getListaNotas();

		for (Double nota : listaNotas) {
			suma += nota;
		}
		return suma / listaNotas.size();
	}

	public int sacarNumSuspensos(int id) {
		Alumno alumno = metodosCRUD.findById(id);
		int contador = 0;

		if (alumno == null) {
			return -1;
		}

		List<Double> notas = alumno.getListaNotas();

		for (Double nota : notas) {
			if (nota < 5) {
				contador++;
			}
		}
		return contador;
	}

	public double sacarMediaSuspensos(int id) {
		Alumno alumno = metodosCRUD.findById(id);
		double suma = 0;
		int contador = 0;

		if (alumno == null) {
			return -1;
		}

		List<Double> notas = alumno.getListaNotas();

		for (Double nota : notas) {
			if (nota < 5) {
				suma += nota;
				contador++;
			}
		}

		if (contador == 0) {
			return 0;
		}
		return suma / contador;

	}

}
