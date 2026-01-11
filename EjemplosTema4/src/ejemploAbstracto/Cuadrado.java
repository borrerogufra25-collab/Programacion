package ejemploAbstracto;

public class Cuadrado extends Figura2D {

	private double lado;

	public Cuadrado(double x, double y, double lado) {
		super(x, y);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return super.toString() + " Cuadrado [lado=" + lado + "]";
	}

	@Override
	public double calcularArea() {

		return lado * lado;
	}

}
