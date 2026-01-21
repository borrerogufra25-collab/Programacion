package ejercicio;

public class Avion implements IExtras {

	private int ID;
	private double longitud;
	private double litrosCombustible;

	public Avion(int iD, double longitud, double litrosCombustible) {
		super();
		ID = iD;
		this.longitud = longitud;
		this.litrosCombustible = litrosCombustible;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getLitrosCombustible() {
		return litrosCombustible;
	}

	public void setLitrosCombustible(double litrosCombustible) {
		this.litrosCombustible = litrosCombustible;
	}

	@Override
	public String toString() {
		return "Avion [ID=" + ID + ", longitud=" + longitud + ", litrosCombustible=" + litrosCombustible + "]";
	}

	public double calcularAterrizaje(double precioLongitud, double precioTopeLitro, double topeLitros,
			double porcetanjeMotores, int topeMotores, double precioPorMisil) {

		if (litrosCombustible > topeLitros) {
			return (precioLongitud * longitud) + precioTopeLitro;
		} else {
			return precioLongitud * longitud;
		}
	}

	@Override
	public double calcularExtra(double precioPorAterrizaje, double porcentajeExtras) {
		double cien = 100;

		return precioPorAterrizaje + (precioPorAterrizaje * porcentajeExtras / cien);
	}

}
