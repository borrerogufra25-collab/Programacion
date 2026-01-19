package ejercicioTipoExamen;

import java.util.Arrays;

public class GestionHabitaciones {

	private Habitacion[] listaHabitaciones;

	public GestionHabitaciones(Habitacion[] listaHabitaciones) {
		super();
		this.listaHabitaciones = listaHabitaciones;
	}

	public Habitacion[] getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(Habitacion[] listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	@Override
	public String toString() {
		return "GestionHabitaciones [listaHabitaciones=" + Arrays.toString(listaHabitaciones) + "]";
	}

	public double calcularPrecioLista(int opcionUsuario, double descuentoSuite) {

		for (int i = 0; i < listaHabitaciones.length; i++) {

			if (opcionUsuario == listaHabitaciones[i].getNumHabitacion()) {

				return listaHabitaciones[i].calcularPagar(descuentoSuite);
			}
		}
		return 0.0;
	}

	public double calcularTotalOcupadas(double descuentoSuite) {
		double total = 0;

		for (int i = 0; i < listaHabitaciones.length; i++) {
			if (listaHabitaciones[i].isOcupada()) {
				total = total + calcularPrecioLista(0, descuentoSuite);
			}
		}
		return total;
	}

}
