package ejercicio04;

import java.util.Arrays;

public class Venta {

	private LineaVenta[] lV;

	public Venta(LineaVenta[] lV) {
		super();
		this.lV = lV;
	}

	public LineaVenta[] getlV() {
		return lV;
	}

	public void setlV(LineaVenta[] lV) {
		this.lV = lV;
	}

	@Override
	public String toString() {
		return "Venta [lV=" + Arrays.toString(lV) + "]";
	}

	// **************************Métodos**************************

	public double calcularTotal() {
		double total = 0;

		for (int i = 0; i < lV.length; i++) {

			total += lV[i].calcularSubtotal();

		}
		return total;
	}

	public void imprimirTicket() {
		Producto p;
		double subtotal;

		System.out.println("\n***** TICKET DE COMPRA *****");

		for (int i = 0; i < lV.length; i++) {
			if (lV[i] != null) {
				p = lV[i].getP();
				subtotal = lV[i].calcularSubtotal();

				System.out.printf("%s x%d  -->  %.2f€\n", p.getNombre(), lV[i].getCantidad(), subtotal);
			}
		}

		System.out.println("----------------------------");
		System.out.printf("TOTAL: %.2f€\n\n", calcularTotal());
	}

}
