package correccion;

public class Hijo {

	// No se le dan valores a los atributos aquí, para eso está el contructor

	private String nombre;
	private int id, edad, horasEstudio;

	// Aquí tampoco

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

	/*
	 * El 100 y SOLO este 100 para los porcentajes se puede meter directamente. Este
	 * método hay que pasarle 2 parámetros y lo devuelve directamente. Se podría
	 * hacer creando atributos y demás pero la mejor forma es esta.
	 * 
	 * Otra forma sería hacer 2 métodos diferentes: uno que multiplique y otro que
	 * solo sea para hacer porcentajes.
	 */

	public double calcularPaga(double cantidad, double porcentaje) {

		return (horasEstudio * cantidad) - (horasEstudio * porcentaje / 100);

	}

}
