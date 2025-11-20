package ejercicio11;

import utilidades.Leer;

public class GestionNotas {

	private Alumno alumno;

	public GestionNotas(Alumno alumno) {
		super();
		this.alumno = alumno;
	}

	public void IntroducirNotas() {

		for (int i = 0; i < alumno.setNotas().length; i++) {
			System.out.println(i + 1 + "º Nota: ");
			alumno.setNotas()[i] = Leer.datoDouble();
		}

	}

	public void MostrarNotas() {

	}

}
