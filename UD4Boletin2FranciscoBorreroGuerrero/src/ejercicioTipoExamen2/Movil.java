package ejercicioTipoExamen2;

public class Movil extends Producto {

	private String modelo;

	public Movil(double precioBase, int cantidadUnidades, String nombre, String modelo) {
		super(precioBase, cantidadUnidades, nombre);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return super.toString() + "Movil [modelo=" + modelo + "]";
	}

	@Override
	public double calcularPVP(double porcentaje) {
		double cien = 100;

		return super.calcularPVP(porcentaje) + (super.calcularPVP(porcentaje) * porcentaje / cien);
	}

}
