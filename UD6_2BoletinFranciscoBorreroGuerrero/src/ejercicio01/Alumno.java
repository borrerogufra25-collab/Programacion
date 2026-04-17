package ejercicio01;

public class Alumno {

	private int dni, edad;
	private String nombre, apellidos, curso;
	private double notaMedia;

	public Alumno(int dni, int edad, String nombre, String apellidos, String curso, double notaMedia) {
		super();
		this.dni = dni;
		this.edad = edad;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		this.notaMedia = notaMedia;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", edad=" + edad + ", nombre=" + nombre + ", apellidos=" + apellidos + ", curso="
				+ curso + ", notaMedia=" + notaMedia + "]";
	}

}
