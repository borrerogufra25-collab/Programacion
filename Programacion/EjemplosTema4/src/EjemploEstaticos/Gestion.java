package EjemploEstaticos;

public class Gestion {

	private static double caja;

	public Gestion() {
		super();
		caja = 0.0;
	}

	public void mostrarCaja() {
		System.out.printf("\nTotal en la caja: %.2f ", caja);
	}

	public double calcularLineaVenta(double ganancia, int cantidad, Producto p) {
		double total = 0.0;
		total = p.calcularPrecio(ganancia) * cantidad;
		caja += total;
		// caja = caja + total; Esto es lo mismo
		return total;
	}

}
