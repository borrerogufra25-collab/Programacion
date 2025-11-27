package ejercicio02;

public class Habitacion {

	private int numeroHabitacion;
	private String tipo; // sencilla, doble o triple
	private double precioBase;
	private String clienteAsignado;
	private boolean limpia;
	private boolean ocupada;

	public Habitacion(int numeroHabitacion, String tipo, double precioBase, String clienteAsignado, boolean limpia,
			boolean ocupada) {
		super();
		this.numeroHabitacion = numeroHabitacion;
		this.tipo = tipo;
		this.precioBase = precioBase;
		this.clienteAsignado = clienteAsignado;
		this.limpia = limpia;
		this.ocupada = ocupada;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getClienteAsignado() {
		return clienteAsignado;
	}

	public void setClienteAsignado(String clienteAsignado) {
		this.clienteAsignado = clienteAsignado;
	}

	public boolean isLimpia() {
		return limpia;
	}

	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	@Override
	public String toString() {
		return "Habitacion [numeroHabitacion=" + numeroHabitacion + ", tipo=" + tipo + ", precioBase=" + precioBase
				+ ", clienteAsignado=" + clienteAsignado + ", limpia=" + limpia + ", ocupada=" + ocupada + "]";
	}

}