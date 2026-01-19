package ejercicioTipoExamen;

public class Habitacion {

	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int diasOcupacion, numOcupantes;
	private int numHabitacion;

	public Habitacion(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int numOcupantes,
			int numHabitacion) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.diasOcupacion = diasOcupacion;
		this.numOcupantes = numOcupantes;
		this.numHabitacion = numHabitacion;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getDiasOcupacion() {
		return diasOcupacion;
	}

	public void setDiasOcupacion(int diasOcupacion) {
		this.diasOcupacion = diasOcupacion;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}

	public int getNumHabitacion() {
		return numHabitacion;
	}

	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente=" + nombreCliente
				+ ", diasOcupacion=" + diasOcupacion + ", numOcupantes=" + numOcupantes + ", numHabitacion="
				+ numHabitacion + "]";
	}

	public double calcularPagar(double descuentoSuit) {

		return precioBase * diasOcupacion;
	}

}
