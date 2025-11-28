package ejercicio;

public class Hijo {

	private String nombre;
	private int id, edad, horasEstudio;

	public Hijo(String nombre, int id, int edad, int horasEstudio) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.horasEstudio = horasEstudio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getHorasEstudio() {
		return horasEstudio;
	}

	public void setHorasEstudio(int horasEstudio) {
		this.horasEstudio = horasEstudio;
	}

	@Override
	public String toString() {
		return "Hijo [nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", horasEstudio=" + horasEstudio + "]";
	}

	// Métodos

	public double calcularPaga(double cantidad, double porceBote) {

		return horasEstudio * cantidad - porceBote;

	}
}
