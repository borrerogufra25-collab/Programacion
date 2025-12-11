package ejemplo01;

import java.util.Arrays;

public class Alumno extends Persona {

	private String[] asignaturas;
	private double media;

	public Alumno(String nombre, String apellidos, String dni, int edad, String[] asignaturas, double media) {
		super(nombre, apellidos, dni, edad);
		this.asignaturas = asignaturas;
		this.media = media;
	}

	@Override
	public String toString() {
		return super.toString() + "Alumno [asignaturas=" + Arrays.toString(asignaturas) + ", media=" + media + "]";
	}

	// Para reescribir un método solo se cambia lo de dentro de las llaves

	public int sumarEdad(int cant) {
		return super.sumarEdad(cant) - 2;
	}

}
