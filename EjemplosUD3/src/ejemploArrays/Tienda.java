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

	public Producto buscarPorId(int id) {
		
		
		boolean encontrado;
		
		while (condition) {
			if (id==listaProd[i].getId())
		}
		
		
		return p;

	}

}
