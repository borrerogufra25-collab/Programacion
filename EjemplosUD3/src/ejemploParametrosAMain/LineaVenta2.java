package ejemploParametrosAMain;

public class LineaVenta2 {

	// No es atributo aunque deberías ser el Producto

	private int cantidad;
	private double subTotal;

	public LineaVenta2(int cantidad, double subTotal) {
		super();
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}

	public LineaVenta2(int cantidad) {
		super();
		this.cantidad = cantidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "LineaVenta2 [cantidad=" + cantidad + ", subTotal=" + subTotal + "]";
	}

	// Calcular el subtotal
	//Hay que pasarselo antes

	public double calcularSubtotalV2(double por, Producto p) {

		subTotal = cantidad * p.calcularPVP(por);
		return subTotal;

	}

}
