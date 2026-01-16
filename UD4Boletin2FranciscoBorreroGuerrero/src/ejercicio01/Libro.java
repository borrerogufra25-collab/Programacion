package ejercicio01;

public class Libro extends Publicacion {

	private String genero;

	public Libro(String nombre, int anio, boolean prestado, String genero) {
		super(nombre, anio, prestado);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Libros [genero=" + genero + "]";
	}

	@Override
	public int contarPrestados(Publicacion[] lista) {
		// TODO Auto-generated method stub
		return super.contarPrestados(lista);
	}

	@Override
	public int contarAnteriores(Publicacion[] lista, int anioReferencia) {
		// TODO Auto-generated method stub
		return super.contarAnteriores(lista, anioReferencia);
	}

}
