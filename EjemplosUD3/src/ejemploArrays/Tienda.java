package ejemploArrays;

import java.util.Arrays;

public class Tienda {

	private String nombre;
	private Producto listaProd[];

	public Tienda(String nombre, Producto[] listaProd) {
		super();
		this.nombre = nombre;
		this.listaProd = listaProd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto[] getListaProd() {
		return listaProd;
	}

	public void setListaProd(Producto[] listaProd) {
		this.listaProd = listaProd;
	}

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", listaProd=" + Arrays.toString(listaProd) + "]";
	}

	// Esto se llaman metodos CRUD (Create, Read, Update, Delete)

	public void agregar(Producto p, int contador) {
		listaProd[contador] = p;
	}

	public int buscarById(int id) {
		boolean encontrado = false;
		int i = 0;

		while (i < listaProd.length && !encontrado) {
			if (listaProd[i].getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
			if (encontrado) {
				return i;
			} else {
				return -1;
			}
		}

	}

	public Producto buscarByIdV2(int id) {

		boolean encontrado = false;
		int i = 0;

		while (i < listaProd.length && !encontrado) {
			if (listaProd[i].getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
			if (encontrado) {
				return listaProd[i]; // Devolvemos el producto buscado
			} else {
				return null;
			}
		}
	}

	// Buscar la lista completa

	public Producto[] findAll() {
		return listaProd;
	}

	// Mostrar todos los productos de la lista

	public void imprimirTodosLosProductos() {
		for (int i = 0; i < listaProd.length; i++) {
			System.out.println((i + 1) + ". " + listaProd[i]);
		}
	}

	// Modificar precio

	public void modificarPrecio(int id, double precioNuevo) {

		int indice = buscarById(id);
		if (indice >= 0) {
			listaProd[indice].setPrecio(precioNuevo);
		}

	}

	// Borrar

	public void delete(int id) {
		int indice = buscarById(id); // Devuelve el índice del array
		if (indice >= 0) {
			listaProd[indice].setActivo(false);

		}
	}

}
