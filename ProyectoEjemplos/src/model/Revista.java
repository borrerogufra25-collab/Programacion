package model;

/**
 * # Revista
 *
 * Ejemplo de otra subclase de Material.
 */
public final class Revista extends Material {

	private int id;
	private String titulo;
	private int numero;

	public Revista(int id, String titulo, int numero) {
		this.id = id;
		this.titulo = titulo;
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Revista{id=" + id + ", titulo='" + titulo + "', numero=" + numero + "}";
	}
}
