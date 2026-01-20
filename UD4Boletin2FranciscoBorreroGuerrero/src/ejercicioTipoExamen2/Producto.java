package ejercicioTipoExamen2;

public abstract class Producto {

	private double precioBase;
	private int cantidadUnidades;
	private String nombre;

	public Producto(double precioBase, int cantidadUnidades, String nombre) {
		super();
		this.precioBase = precioBase;
		this.cantidadUnidades = cantidadUnidades;
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getCantidadUnidades() {
		return cantidadUnidades;
	}

	public void setCantidadUnidades(int cantidadUnidades) {
		this.cantidadUnidades = cantidadUnidades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", cantidadUnidades=" + cantidadUnidades + ", nombre=" + nombre
				+ "]";
	}

	public double calcularPVP(double porcentaje) {

		return precioBase * cantidadUnidades;
	}

}
