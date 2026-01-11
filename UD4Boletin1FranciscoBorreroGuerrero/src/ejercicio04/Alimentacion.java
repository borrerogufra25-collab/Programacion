package ejercicio04;

public class Alimentacion extends Producto {

	private double descuentoCadu;
	private int caducidad;

	public Alimentacion(double precioUni, String nombre, int iD, double descuentoCadu, int caducidad) {
		super(precioUni, nombre, iD);
		this.descuentoCadu = descuentoCadu;
		this.caducidad = caducidad;
	}

	public double getDescuentoCadu() {
		return descuentoCadu;
	}

	public void setDescuentoCadu(double descuentoCadu) {
		this.descuentoCadu = descuentoCadu;
	}

	public int getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}

	@Override
	public String toString() {
		return super.toString() + "Alimentacion [descuentoCadu=" + descuentoCadu + ", caducidad=" + caducidad + "]";
	}

	// **************************Métodos**************************

	public boolean vaACaducar() {
		return caducidad < 2;
	}

	@Override
	public double getPrecioUni() {
		// TODO Auto-generated method stub
		if (vaACaducar()) {
			return super.getPrecioUni() - (super.getPrecioUni() * (descuentoCadu / 100));
		}
		return super.getPrecioUni();
	}

}
