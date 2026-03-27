package ejercicio;

public class Coche implements Comparable<Coche> {

	private String matricula;
	private double precioBase;
	private boolean conEspeciales;

	public Coche(String matricula, double precioBase, boolean conEspeciales) {
		super();
		this.matricula = matricula;
		this.precioBase = precioBase;
		this.conEspeciales = conEspeciales;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isConEspeciales() {
		return conEspeciales;
	}

	public void setConEspeciales(boolean conEspeciales) {
		this.conEspeciales = conEspeciales;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", precioBase=" + precioBase + ", conEspeciales=" + conEspeciales
				+ "]";
	}

	@Override
	public int compareTo(Coche o) {
		return this.matricula.compareTo(o.matricula);
	}

	public double calcularPrecioFinal(double cantidadExtra) {

		if (conEspeciales = true) {
			return precioBase + cantidadExtra;
		} else {
			return precioBase;
		}
	}
}
