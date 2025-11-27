package ejercicio02;

import java.util.Arrays;

public class Hotel {

	private Habitacion[] listaHabitacion;
	private double extras;

	public Hotel(Habitacion[] listaHabitacion, double extras) {
		super();
		this.listaHabitacion = listaHabitacion;
		this.extras = extras;
	}

	public Habitacion[] getListaHabitacion() {
		return listaHabitacion;
	}

	public void setListaHabitacion(Habitacion[] listaHabitacion) {
		this.listaHabitacion = listaHabitacion;
	}

	public double getExtras() {
		return extras;
	}

	public void setExtras(double extras) {
		this.extras = extras;
	}

	@Override
	public String toString() {
		return "Hotel [listaHabitacion=" + Arrays.toString(listaHabitacion) + ", extras=" + extras + "]";
	}

	// CURD

	// Añadir
	public void agregarHabitacion(Habitacion h, int contador) {
		listaHabitacion[contador] = h;
	}

	// Ver si esta ocupada
	public boolean verOcupada(int indice) {
		boolean ocupada = false;
		int i = 0;
		while (i < listaHabitacion.length && !ocupada) {
			if (listaHabitacion[i].getNumero() == indice) {
				ocupada = true;
			} else {
				i++;
			}
		}
		return ocupada;
	}

}
