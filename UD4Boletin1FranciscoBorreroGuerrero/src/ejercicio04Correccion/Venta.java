package ejercicio04Correccion;

import java.util.Arrays;

public class Venta {

	private LineaVenta[] listaVentas;

	public Venta(LineaVenta[] listaVentas) {
		super();
		this.listaVentas = listaVentas;
	}

	public LineaVenta[] getListaVentas() {
		return listaVentas;
	}

	public void setListaVentas(LineaVenta[] listaVentas) {
		this.listaVentas = listaVentas;
	}

	@Override
	public String toString() {
		return "Venta [listaVentas=" + Arrays.toString(listaVentas) + "]";
	}

	public double calcularUna(LineaVenta lv, double descuento, int tope) {

		return lv.calcularSubtotal(descuento, tope);
	}

	public double calcularTotal(double descuento, int tope) {

		double total = 0;

		for (int i = 0; i < listaVentas.length; i++) {

			total += calcularUna(listaVentas[i], descuento, tope);
			// total += listaVentas[i].calcularSubtotal(descuento, tope); El de arriba es
			// mejor

		}
		return total;
	}

}
