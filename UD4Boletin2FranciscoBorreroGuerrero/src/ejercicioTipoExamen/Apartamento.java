package ejercicioTipoExamen;

public class Apartamento extends Habitacion {

	private double extraLimpieza;

	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int numOcupantes,
			int numHabitacion, double extraLimpieza) {
		super(precioBase, ocupada, nombreCliente, diasOcupacion, numOcupantes, numHabitacion);
		this.extraLimpieza = extraLimpieza;
	}

	public double getExtraLimpieza() {
		return extraLimpieza;
	}

	public void setExtraLimpieza(double extraLimpieza) {
		this.extraLimpieza = extraLimpieza;
	}

	@Override
	public String toString() {
		return super.toString() + "Apartamento [extraLimpieza=" + extraLimpieza + "]";
	}

	@Override
	public double calcularPagar(double descuentoSuit) {

		return super.calcularPagar(descuentoSuit) + extraLimpieza;
	}

}
