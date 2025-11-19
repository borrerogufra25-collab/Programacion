package ejercicio10;

public class Ticket {
	private double precioBase;
	private int numBilletes;
	private int saltos;

	public Ticket(double precioBase, int numBilletes, int saltos) {
		this.precioBase = precioBase;
		this.numBilletes = numBilletes;
		this.saltos = saltos;
	}

	public double calcularPrecio() {

		return (precioBase * numBilletes) * saltos;
	}

	public double generarBillete() {
		double total = 0.0;
		total = precioBase + (saltos * numBilletes);
		return total;
	}

	public String imprimirBillete() {

		return "Billete válido para " + numBilletes + " persona/s, " + saltos + " saltos. Precio: " + calcularPrecio()
				+ " €";
	}
}
