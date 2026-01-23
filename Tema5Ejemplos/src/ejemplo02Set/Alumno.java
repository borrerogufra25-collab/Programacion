package ejemplo02Set;

public class Alumno {

	private String nombre;
	private String DNI;
	private double notaMedia;

	public Alumno(String nombre, String dNI, double notaMedia) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Nombre=" + nombre + ", DNI=" + DNI + ", notaMedia=" + notaMedia;
	}

}
