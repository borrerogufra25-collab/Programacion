package ejemploArrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		// Debería leerlo por teclado pero para ir rápido
		String nombre = "Carrefour";
		int tam, seguir, contadorProd = 0;
		double precio;
		Tienda t;
		Producto[] lista;
		Producto p1, p3;

		p1 = new Producto("Cuerda", 1.40);
		p3 = new Producto("Katana", 2.60);

		System.out.println("Diga el tamaño de la lista");
		tam = Leer.datoInt();

		lista = new Producto[tam];

		// Instanciamos la tienda

		t = new Tienda(nombre, lista);

		t.agregar(p1, contadorProd);
		contadorProd++;
		t.agregar(p3, contadorProd);

		System.out.println(t);

		// Rellenar pidiendo datos con bucle

		contadorProd = 0;

		do {
			System.out.print("Introduce el nombre del producto: ");
			nombre = Leer.dato();
			System.out.print("Introduce el precio del producto: ");
			precio = Leer.datoDouble();
			t.agregar(new Producto(nombre, precio), contadorProd);
			contadorProd++;
			System.out.println("Si desea terminar pulse 0, cualquier número para seguir");
			seguir = Leer.datoInt();

		} while (seguir != 0 && contadorProd < lista.length);

		System.out.println(t);

	}

}
