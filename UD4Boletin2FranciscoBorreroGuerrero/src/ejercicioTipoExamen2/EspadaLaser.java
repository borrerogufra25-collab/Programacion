package ejercicioTipoExamen2;

public class EspadaLaser extends Producto {

	private String tipoEspada;

	public EspadaLaser(double precioBase, int cantidadUnidades, String nombre, String tipoEspada) {
		super(precioBase, cantidadUnidades, nombre);
		this.tipoEspada = tipoEspada;
	}

	public String getTipoEspada() {
		return tipoEspada;
	}

	public void setTipoEspada(String tipoEspada) {
		this.tipoEspada = tipoEspada;
	}

	@Override
	public String toString() {
		return super.toString() + "EspadaLaser [tipoEspada=" + tipoEspada + "]";
	}

	@Override
	public double calcularPVP(double porcentaje) {
		double cien = 100;
		double cantidadExtra = 34.72;

		if (tipoEspada.equals("Doble")) {
			return super.calcularPVP(porcentaje) + (super.calcularPVP(porcentaje) * porcentaje / cien) + cantidadExtra;
		} else {
			return super.calcularPVP(porcentaje) + (super.calcularPVP(porcentaje) * porcentaje / cien);
		}

	}

}
