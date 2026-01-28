package ejemplo04Ordenar;

import java.util.Comparator;

public class OrdenaPorNombre implements Comparator<Corredor> {

	@Override
	public int compare(Corredor c1, Corredor c2) {

		String nombreC1 = c1.getNombre();
		String nombreC2 = c2.getNombre();

		/*
		 * El método retorna el int que devuelve la comparación del primero con el
		 * segundo el método toLowerCase nos devuelve la cadena en minúsculas. El método
		 * compareTo es para comparar cadenas de manera natural, es decir,
		 * lexicográficamente
		 */

		return -(nombreC1.toLowerCase().compareTo(nombreC2.toLowerCase()));

		// Poniendo - delante cambia el orden

	}

}
