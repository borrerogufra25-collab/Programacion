package ejercicio03;

public class Motocicleta extends Vehiculos {

	private double cilindrada;

	public Motocicleta(int categoria, double cilindrada) {
		super(categoria);
		this.cilindrada = cilindrada;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + "]";
	}

}
