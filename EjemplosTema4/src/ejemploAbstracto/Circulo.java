package ejemploAbstracto;

public class Circulo extends Figura2D { // El método abstracto te obliga hasta que una de las clases pueda tenerlo, si
										// no pasaria al siguiente

	private double radio;

	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return super.toString() + " Circulo [radio=" + radio + "]";
	}

	public double calcularArea() { // <-- Aquí terminaría
		double exp = 2.0;
		return Math.PI * Math.pow(radio, exp);
	}

}
