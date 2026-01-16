package ejercicio01;

public class Publicacion implements IPrestable {

	private String nombre;
	private int anio;
	private boolean prestado;

	public Publicacion() {
	}

	public Publicacion(String nombre, int anio, boolean prestado) {
		super();
		this.nombre = nombre;
		this.anio = anio;
		this.prestado = prestado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Publicaciones [nombre=" + nombre + ", anio=" + anio + ", prestado=" + prestado + "]";
	}

	@Override
	public int contarPrestados(Publicacion[] lista) {
		int contador = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i].prestado) {
				contador++;
			}
		}
		return contador;
	}

	@Override
	public int contarAnteriores(Publicacion[] lista, int anioReferencia) {
		int contador = 0;

		for (int i = 0; i < lista.length; i++) {
			if (anioReferencia >= lista[i].anio) {
				contador++;
			}
		}

		return contador;
	}

}
