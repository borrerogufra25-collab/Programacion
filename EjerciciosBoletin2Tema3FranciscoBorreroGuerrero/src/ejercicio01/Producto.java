package ejercicio01;

public class Producto {

	private String nombre;
	private String categoria;
	private double precioFabrica;
	private boolean fragil;
	private int cantidad;

	public Producto(String nombre, String categoria, double precioFabrica, boolean fragil, int cantidad) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precioFabrica = precioFabrica;
		this.fragil = fragil;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", categoria=" + categoria + ", precioFabrica=" + precioFabrica
				+ ", fragil=" + fragil + ", cantidad=" + cantidad + "]";
	}

	public double calcularPrecioCoste(double porcentajeTransporte) {

		int cien = 100;

		return precioFabrica + (precioFabrica * porcentajeTransporte / cien);

	}

}
