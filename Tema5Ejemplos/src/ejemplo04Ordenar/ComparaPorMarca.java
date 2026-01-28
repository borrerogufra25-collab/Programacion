package ejemplo04Ordenar;

import java.util.Comparator;

public class ComparaPorMarca implements Comparator<Corredor> {

	// Comparamos 2 objetos tipo Corredor

	public int compare(Corredor c1, Corredor c2) {

		// Creamos las 2 variables tipo double (marca es double)
		// Que vamos a compara, no haría falta

		double marcac1 = c1.getMarca();
		double marcac2 = c2.getMarca();

		/*
		 * Si el 1º es menor que el 2º devuelve -1, si es mayor 1 y si son iguales 0,
		 * consulta el API
		 */

		if (marcac1 < marcac2) {
			return -1;
		} else {
			if (marcac1 > marcac2) {
				return 1;
			}
			return 0;
		}

	}

}
