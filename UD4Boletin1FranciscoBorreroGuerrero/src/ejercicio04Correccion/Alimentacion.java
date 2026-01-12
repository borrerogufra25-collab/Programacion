package ejercicio04Correccion;

public class Alimentacion extends Producto {

	private int caducidad;

	public Alimentacion(double precioUni, String nombre, int iD, int caducidad) {
		super(precioUni, nombre, iD);
		this.caducidad = caducidad;
	}

	public int getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}

	@Override
	public String toString() {
		return "Alimentacion [caducidad=" + caducidad + "]";
	}

	@Override
	public double calcularPVP(double impuestoCaducidad, int tope) {
		double cien = 100;

		if (caducidad <= tope) {
			return getPrecioUni() - getPrecioUni() * impuestoCaducidad / cien;
		}

		return getPrecioUni();
	}

	public void avisar(int tope) {
		if (caducidad <= tope) {
			System.out.println("Le queda poco para caducar.");

		}
	}

}
