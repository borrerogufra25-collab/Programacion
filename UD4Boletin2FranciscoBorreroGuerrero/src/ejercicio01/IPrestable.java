package ejercicio01;

public interface IPrestable {

	public int contarPrestados(Publicacion[] lista);

	public int contarAnteriores(Publicacion[] lista, int anio);

}
