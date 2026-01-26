package ejemplo03Map;

import java.util.HashMap;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {

		Map<Integer, String> lista = new HashMap<Integer, String>();

		// Agregamos

		lista.put(1, "Luismi");
		lista.put(2, "Rafa");
		lista.put(3, "Miguel");
		System.out.println(lista);

		// Repetimos clave y lo sustituye

		lista.put(1, "Ángel");
		System.out.println(lista);

		// Se puede repetir valor pero no clave

		lista.put(4, "Miguel");
		System.out.println(lista);

		// Sacando elementos

		System.out.println(lista.get(3));
		System.out.println(lista);

		// Tamaño

		System.out.println("Tamaño: " + lista.size());

		// Borrando

		lista.remove(3);
		System.out.println(lista);
		System.out.println("Nuevo tamaño: " + lista.size());

		lista.put(3, "Sandokan");
		System.out.println(lista);

		// Trabajando con claves y values

		System.out.println(lista.keySet());
		System.out.println(lista.values());

	}

}
