package ejercicio04Correccion;

public class Electronica extends Producto {

	private double impuestoLujo;

	public Electronica(double precioUni, String nombre, int iD, double impuestoLujo) {
		super(precioUni, nombre, iD);
		this.impuestoLujo = impuestoLujo;
	}

	public double getImpuestoLujo() {
		return impuestoLujo;
	}

	public void setImpuestoLujo(double impuestoLujo) {
		this.impuestoLujo = impuestoLujo;
	}

	@Override
	public String toString() {
		return "Electronica [impuestoLujo=" + impuestoLujo + "]";
	}

	@Override
	public double calcularPVP(double impuestoCaducidad, int tope) {
		double cien = 100;

		return getPrecioUni() + getPrecioUni() * impuestoLujo / cien;
	}

}