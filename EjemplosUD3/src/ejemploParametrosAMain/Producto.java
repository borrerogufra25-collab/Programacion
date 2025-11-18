package ejemploParametrosAMain;

public class Producto {

	private String nombre;
	private boolean refrigerado;
	private double precioBase;

	public Producto(String nombre, boolean refrigerado, double precioBase) {
		super();
		this.nombre = nombre;
		this.refrigerado = refrigerado;
		this.precioBase = precioBase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String toString() {
		return "Producto [nombre=" + nombre + ", refrigerado=" + refrigerado + ", precioBase=" + precioBase + "]";
	}

	// Suna al precio base un porcentaje si es refrigerado

	public double calcularPVP(double porcentaje) {
		double total = 0.0, den = 100.0;

		if (refrigerado) {
			total = precioBase + (precioBase * porcentaje / den);
		} else {
			total = precioBase;
		}
		return total;
	}

}
