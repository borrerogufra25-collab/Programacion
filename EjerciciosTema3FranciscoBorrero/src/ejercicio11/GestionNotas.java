package ejercicio11;

import utilidades.Leer;

public class GestionNotas {

	private Alumno alumno;

	public GestionNotas(Alumno alumno) {
		super();
		this.alumno = alumno;
	}

	public void mostrarNotas() {

		for (int i = 0; i < alumno.getNotas().length; i++) {

			System.out.println(i + 1 + " º nota: " + alumno.getNotas()[i]);

		}

	}

	public double calcularMedia() {
		double suma = 0.0;

		for (int i = 0; i < alumno.getNotas().length; i++) {

			suma = suma + alumno.getNotas()[i];

		}
		return suma / alumno.getNotas().length;
	}

	public int montrarSuspensos() {
		int suspensos = 0;
		for (int i = 0; i < alumno.getNotas().length; i++) {

			if (alumno.getNotas()[i] < 5) {
				suspensos++;
			}
		}
		return suspensos;

	}

}
