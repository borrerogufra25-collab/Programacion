package ejercicio04;

public class Cilindro {

	// Fómula volumen V = pi* r^2 *h

	// Atributos

	private double radio;
	private double altura;

	// Constructor

	public Cilindro(double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}

	public double formulaVolumen() {

		double dos = 2.0;

		return Math.PI * Math.pow(radio, dos) * altura;

	}

}
