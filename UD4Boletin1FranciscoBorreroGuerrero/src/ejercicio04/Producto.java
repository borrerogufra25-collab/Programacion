package ejercicio04;

public class Producto {

	private double precioUni;
	private String nombre;
	private int iD;

	public Producto(double precioUni, String nombre, int iD) {
		super();
		this.precioUni = precioUni;
		this.nombre = nombre;
		this.iD = iD;
	}

	public double getPrecioUni() {
		return precioUni;
	}

	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	@Override
	public String toString() {
		return "Producto [precioUni=" + precioUni + ", nombre=" + nombre + ", iD=" + iD + "]";
	}

}
