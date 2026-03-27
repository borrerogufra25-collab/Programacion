package ejercicio;

import java.util.Comparator;

public class Comparar implements Comparator<Coche> {

	public int compareDiferente(Coche o1, Coche o2, double cantidadExtra) {

		if (o1.calcularPrecioFinal(cantidadExtra) < o2.calcularPrecioFinal(cantidadExtra)) {
			return -1;
		}
		if (o1.calcularPrecioFinal(cantidadExtra) > o2.calcularPrecioFinal(cantidadExtra)) {
			return 1;
		}
		return 0;
	}

	@Override
	public int compare(Coche o1, Coche o2) {

		return 0;
	}

}
