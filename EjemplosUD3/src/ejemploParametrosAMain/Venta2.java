package ejemploParametrosAMain;

public class Venta2 {

	private double totalVenta;
	private String nombreVendedor;

	public Venta2(double totalVenta, String nombreVendedor) {
		super();
		this.totalVenta = totalVenta;
		this.nombreVendedor = nombreVendedor;
	}

	public double getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}

	@Override
	public String toString() {
		return "Venta2 [totalVenta=" + totalVenta + ", nombreVendedor=" + nombreVendedor + "]";
	}

	public double calcularMediaImpuestosV2(double[] listaImpuestosV2) {
		double suma = 0.0;

		for (int i = 0; i < listaImpuestosV2.length; i++) {
			suma = suma + listaImpuestosV2[i];
		}

		return suma / listaImpuestosV2.length;

	}

}
