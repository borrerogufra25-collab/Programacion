package ejercicio01;

public class Revista extends Publicacion {

	private String tipo;

	public Revista(String nombre, int anio, boolean prestado, String tipo) {
		super(nombre, anio, prestado);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Revistas [tipo=" + tipo + "]";
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
