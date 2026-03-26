package model;

/**
 * # Libro
 *
 * Representa un libro de la biblioteca.
 */
public final class Libro extends Material {

	private int id;
	private String titulo;
	private String autor;
	private boolean disponible = true;

	public Libro(int id, String titulo, String autor) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.disponible = true;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Libro{id=" + id + ", titulo='" + titulo + "', autor='" + autor + "', disponible=" + disponible + "}";
	}
}
