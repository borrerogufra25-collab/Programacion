package ejemplo01Listas;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		List<String> listaNombres = new ArrayList<String>();

		// Agregar un elemento

		listaNombres.add("Luck");
		listaNombres.add("Obiwan");
		listaNombres.add(0, "Anakin");

		System.out.println(listaNombres);

		listaNombres.remove(1);

		System.out.println(listaNombres);

		List<Producto> listaProductos = new ArrayList<Producto>();

		Producto p1 = new Producto("Lechuga", 1.50, true);

		listaProductos.add(p1);

		System.out.println(listaProductos);

		listaProductos.size();

	}

}
