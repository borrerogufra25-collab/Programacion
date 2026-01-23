package ejercicio01;

public class Nota {

	private String titulo;
	private int id;

	public Nota(String titulo, int id) {
		super();
		this.titulo = titulo;
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Nota [titulo=" + titulo + ", id=" + id + "]";
	}

}
