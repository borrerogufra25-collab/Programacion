package ejercicio02;

public class Circulo {

	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public Circulo() {

	}

	public double calcularArea() {

		double dos = 2;

		return Math.PI * Math.pow(radio, dos);

	}

}
