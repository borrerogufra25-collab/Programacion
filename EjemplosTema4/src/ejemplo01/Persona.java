package ejemplo01;

public class Persona {

	// Se hereda todo menos los contructores

	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;

	public Persona(String nombre, String apellidos, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", edad=" + edad + "]";
	}

}
