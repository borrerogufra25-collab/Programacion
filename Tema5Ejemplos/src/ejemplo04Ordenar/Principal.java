package ejemplo04Ordenar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<Corredor> corredores = new ArrayList<Corredor>();

		corredores.add(new Corredor(4, 1.43, "Jesse Owens"));
		corredores.add(new Corredor(8, 1.11, "Ángel Naranjo"));
		corredores.add(new Corredor(3, 2.23, "Abel Antón"));
		corredores.add(new Corredor(1, 1.12, "Luis Miguel López"));
		corredores.add(new Corredor(6, 1.14, "Miguel Campos"));
		corredores.add(new Corredor(5, 1.13, "Rafa Villar"));
		corredores.add(new Corredor(7, 2.11, "Emil Zatopek"));
		corredores.add(new Corredor(2, 2.35, "Carl Lewis"));

		System.out.println("\tCORREDORES\n");
		for (Corredor corredor : corredores) {
			System.out.println(corredor);
		}

		Collections.sort(corredores);

		System.out.println("\n\tCORREDORES ORDENADOS POR DORSAL\n");

		for (Corredor corredor : corredores) {
			System.out.println(corredor);
		}

		System.out.println("\n\tCORREDORES ORDENADOS POR MARCA\n");

		Collections.sort(corredores, new ComparaPorMarca());

		for (Corredor corredor : corredores) {
			System.out.println(corredor);
		}

		System.out.println("\n\tCORREDORES ORDENADOS POR NOMBRE\n");

		Collections.sort(corredores, new OrdenaPorNombre());

		for (Corredor corredor : corredores) {
			System.out.println(corredor);
		}

	}

}
