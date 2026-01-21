package ejemplo01Listas;

public class Producto {

	private String nombre;
	private double precio;
	private boolean refrigerado;

	public Producto(String nombre, double precio, boolean refrigerado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.refrigerado = refrigerado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", refrigerado=" + refrigerado + "]";
	}

}
