package ejercicio;

public class CazasMilitares extends Avion {

	private int numMisiles;

	public CazasMilitares(int iD, double longitud, double litrosCombustible, int numMisiles) {
		super(iD, longitud, litrosCombustible);
		this.numMisiles = numMisiles;
	}

	public int getNumMisiles() {
		return numMisiles;
	}

	public void setNumMisiles(int numMisiles) {
		this.numMisiles = numMisiles;
	}

	@Override
	public String toString() {
		return super.toString() + "CazasMilitares [numMisiles=" + numMisiles + "]";
	}

	@Override
	public double calcularAterrizaje(double precioLongitud, double precioTopeLitro, double topeLitros,
			double porcetanjeMotores, int topeMotores, double precioPorMisil) {

		return super.calcularAterrizaje(precioLongitud, precioTopeLitro, topeLitros, porcetanjeMotores, topeMotores,
				precioPorMisil) + (numMisiles * precioPorMisil);
	}

	@Override
	public double calcularExtra(double precioPorAterrizaje, double porcentajeExtras) {

		return super.calcularExtra(precioPorAterrizaje, porcentajeExtras);
	}

}
