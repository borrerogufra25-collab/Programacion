package ejercicioTipoExamen;

public class Suite extends Habitacion {

	private double metrosCuadrados;
	private double dineroServicio;

	public Suite(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int numOcupantes,
			int numHabitacion, double metrosCuadrados, double dineroServicio) {
		super(precioBase, ocupada, nombreCliente, diasOcupacion, numOcupantes, numHabitacion);
		this.metrosCuadrados = metrosCuadrados;
		this.dineroServicio = dineroServicio;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public double getDineroServicio() {
		return dineroServicio;
	}

	public void setDineroServicio(double dineroServicio) {
		this.dineroServicio = dineroServicio;
	}

	@Override
	public String toString() {
		return "Suite [metrosCuadrados=" + metrosCuadrados + ", dineroServicio=" + dineroServicio + "]";
	}

	@Override
	public double calcularPagar(double descuentoSuit) {

		double cien = 100;

		return (super.calcularPagar(descuentoSuit) + dineroServicio)
				- (super.calcularPagar(descuentoSuit) * descuentoSuit / cien);
	}

}
