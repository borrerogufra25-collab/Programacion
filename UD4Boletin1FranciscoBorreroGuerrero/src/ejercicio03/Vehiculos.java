package ejercicio03;

public class Vehiculos {

	private int categoria; // 1.Cero 2.ECO 3.B 4.C

	public Vehiculos(int categoria) {
		super();
		this.categoria = categoria;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Vehiculos [categoria=" + categoria + "]";
	}

	public double calcularImpuesto() {

		double impuesto = 0.0;

		switch (categoria) {
		case 1:
			impuesto = 23.76;
			break;

		case 2:
			impuesto = 50.45;
			break;

		case 3:
			impuesto = 70.23;
			break;

		case 4:
			impuesto = 84.92;
			break;

		default:
			break;
		}
		return impuesto;

	}

}