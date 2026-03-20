package ejemplo02Set;

public class Alumno implements Comparable<Alumno> {

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

	@Override
	public int compareTo(Alumno alumno) {
		//Código para ordenar de forma natural
	
		if (this.nombre > get.nombre) {
			
		}

	}

}
if (this.dorsal > c.dorsal) {
	return 1;
} else {
	if (this.dorsal < c.dorsal) {
		return -1;
	}
	return 0;
