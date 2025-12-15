package EjemploEstaticos;

public class Producto {

	private String nombre;
	private double precioBase;
	private static int contador;

	public Producto(String nombre, double precioBase) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
		contador++;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", contador=" + contador + "]";
	}

	public double calcularPrecio(double ganancia) {

		return precioBase + precioBase * ganancia / 100.0;
	}

}
