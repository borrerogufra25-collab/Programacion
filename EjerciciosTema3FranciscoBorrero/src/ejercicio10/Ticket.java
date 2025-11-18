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

	public String imprimirBillete() {

		return "Billete válido para " + numBilletes + " persona/s, " + saltos + " saltos. Precio: " + calcularPrecio()
				+ " €";
	}
}
