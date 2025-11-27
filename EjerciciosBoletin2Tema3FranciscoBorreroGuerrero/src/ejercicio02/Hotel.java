package ejercicio02;

import java.util.Arrays;

public class Hotel {

	private Habitacion[] listaHabitaciones;
	private boolean servicioBar;
	private boolean servicioExcursion;
	private boolean servicioVip;
	private double recaudacionTotal;

	public Hotel(Habitacion[] habitaciones, boolean servicioBar, boolean servicioExcursion, boolean servicioVip,
			double recaudacionTotal) {
		this.listaHabitaciones = habitaciones;
		this.servicioBar = servicioBar;
		this.servicioExcursion = servicioExcursion;
		this.servicioVip = servicioVip;
		this.recaudacionTotal = recaudacionTotal;
	}

	// --- Getters y Setters ---
	public Habitacion[] getHabitaciones() {
		return listaHabitaciones;
	}

	public void setHabitaciones(Habitacion[] habitaciones) {
		this.listaHabitaciones = habitaciones;
	}

	public boolean isServicioBar() {
		return servicioBar;
	}

	public void setServicioBar(boolean servicioBar) {
		this.servicioBar = servicioBar;
	}

	public boolean isServicioExcursion() {
		return servicioExcursion;
	}

	public void setServicioExcursion(boolean servicioExcursion) {
		this.servicioExcursion = servicioExcursion;
	}

	public boolean isServicioVip() {
		return servicioVip;
	}

	public void setServicioVip(boolean servicioVip) {
		this.servicioVip = servicioVip;
	}

	public double getRecaudacionTotal() {
		return recaudacionTotal;
	}

	public void setRecaudacionTotal(double recaudacionTotal) {
		this.recaudacionTotal = recaudacionTotal;
	}

	@Override
	public String toString() {
		return "Hotel [habitaciones=" + Arrays.toString(listaHabitaciones) + ", servicioBar=" + servicioBar
				+ ", servicioExcursion=" + servicioExcursion + ", servicioVip=" + servicioVip + ", recaudacionTotal="
				+ recaudacionTotal + "]";
	}

	// --- Métodos de gestión ---
	public void agregarHabitacion(Habitacion h, int indice) {
		if (indice >= 0 && indice < listaHabitaciones.length) {
			listaHabitaciones[indice] = h;
		} else {
			System.out.println("Índice fuera de rango.");
		}
	}

	public boolean verOcupada(int indice) {
		if (indice >= 0 && indice < listaHabitaciones.length) {
			return listaHabitaciones[indice].isOcupada();
		}
		return false;
	}

	// Calcular precio final según días y servicios
	public double calcularPrecio(Habitacion h, int dias) {
		double precio = h.getPrecioBase() * dias;
		if (servicioBar)
			precio += 20 * dias;
		if (servicioExcursion)
			precio += 50;
		if (servicioVip)
			precio += 100;
		return precio;
	}

	// Imprimir factura y acumular recaudación
	public void imprimirFactura(Habitacion h, int dias) {
		double total = calcularPrecio(h, dias);
		System.out.println("Factura del cliente: " + h.getClienteAsignado());
		System.out.println("Habitación Nº: " + h.getNumeroHabitacion() + " (" + h.getTipo() + ")");
		System.out.println("Días: " + dias);
		System.out.println("Servicios extra: " + (servicioBar ? "Bar " : "") + (servicioExcursion ? "Excursiones " : "")
				+ (servicioVip ? "Zona VIP " : ""));
		System.out.println("TOTAL: " + total + " €");

		// Actualizar recaudación
		recaudacionTotal += total;
	}
}
