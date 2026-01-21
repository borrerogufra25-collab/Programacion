package ejercicio;

public class NaveEspaciales extends Avion {

	private int numMotores;
	private boolean origen; // True de fuera, false de la Tierra

	public NaveEspaciales(int iD, double longitud, double litrosCombustible, int numMotores, boolean origen) {
		super(iD, longitud, litrosCombustible);
		this.numMotores = numMotores;
		this.origen = origen;
	}

	public int getNumMotores() {
		return numMotores;
	}

	public void setNumMotores(int numMotores) {
		this.numMotores = numMotores;
	}

	public boolean isOrigen() {
		return origen;
	}

	public void setOrigen(boolean origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return super.toString() + "NaveEspaciales [numMotores=" + numMotores + ", origen=" + origen + "]";
	}

	@Override
	public double calcularAterrizaje(double precioLongitud, double precioTopeLitro, double topeLitros,
			double porcetanjeMotores, int topeMotores, double precioPorMisil) {
		double cien = 100;

		if (numMotores > topeMotores) {
			return super.calcularAterrizaje(precioLongitud, precioTopeLitro, topeLitros, porcetanjeMotores, topeMotores,
					precioPorMisil)
					+ (super.calcularAterrizaje(precioLongitud, precioTopeLitro, topeLitros, porcetanjeMotores,
							topeMotores, precioPorMisil) * porcetanjeMotores / cien);
		} else {
			return super.calcularAterrizaje(precioLongitud, precioTopeLitro, topeLitros, porcetanjeMotores, topeMotores,
					precioPorMisil);
		}

	}

	@Override
	public double calcularExtra(double precioPorAterrizaje, double porcentajeExtras) {

		return super.calcularExtra(precioPorAterrizaje, porcentajeExtras);
	}

	public void avisarExtraterrestres() {
		if (origen) {
			System.out.println("Nave extraterrestre, llamen a los men in black");
		} else {
			System.out.println("Nave terrícola");
		}
	}

}
