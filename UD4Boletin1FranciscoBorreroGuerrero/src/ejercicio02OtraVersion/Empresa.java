package ejercicio02OtraVersion;

public class Empresa {

	private String nombre;
	private int CIF;

	public Empresa(String nombre, int cIF) {
		super();
		this.nombre = nombre;
		CIF = cIF;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCIF() {
		return CIF;
	}

	public void setCIF(int cIF) {
		CIF = cIF;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", CIF=" + CIF + "]";
	}

}
