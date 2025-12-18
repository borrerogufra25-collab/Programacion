package ejercicio03;

public class Coche extends Vehiculos {

	private double potencia;

	public Coche(int categoria, double potencia) {
		super(categoria);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return super.toString() + "Coche [potencia=" + potencia + "]";
	}

	public double calcularImpuesto(double porcentaje) {
		double den = 100.0;
		return super.calcularImpuesto(porcentaje) + (potencia * porcentaje / den);

	}

}
