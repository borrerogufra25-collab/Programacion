package ejercicio04;

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
		return super.toString() + "Electronica [impuestoLujo=" + impuestoLujo + "]";
	}

	// **************************Métodos**************************

	@Override
	public double getPrecioUni() {
		// TODO Auto-generated method stub
		return super.getPrecioUni() + (super.getPrecioUni() * (impuestoLujo / 100));
	}

}
