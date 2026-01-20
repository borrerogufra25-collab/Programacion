package ejercicio02;

public class Producto implements IImpuesto{

	private String nombre;
	private double precioBase;
	public Producto(String nombre, double precioBase) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + "]";
	}
	
	
	
}
