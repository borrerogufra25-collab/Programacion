package ejercicio01;

import java.util.Arrays;

public class Tienda {

	private String nombre;
	private Producto[] productos;
	private int contador = 0; // Para controlar cuántos productos hay

	public Tienda(String nombre, Producto[] productos) {
		this.nombre = nombre;
		this.productos = productos;
	}

	public Tienda(String nombre, int numProductos) {
		this.nombre = nombre;
		this.productos = new Producto[numProductos];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", productos=" + Arrays.toString(productos) + "]";
	}

	// Añadir producto

	public void agregarProducto(Producto p) {
		if (contador < productos.length) {
			productos[contador] = p;
			contador++;
		} else {
			System.out.println("No hay espacio para más productos.");
		}
	}

	// Listar productos

	public void listarProductos() {
		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				System.out.println(i + ": " + productos[i]);
			}
		}
	}

	// Comprobar si un producto es frágil

	public boolean esFragil(int indice) {
		if (indice >= 0 && indice < productos.length && productos[indice] != null) {
			return productos[indice].isFragil();
		}
		return false;
	}

	// Calcular cantidad invertida (precio coste)

	public double calcularInversion(double porcentajeTransporte) {
		double suma = 0;

		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				suma += productos[i].calcularPrecioCoste(porcentajeTransporte);
			}
		}
		return suma;
	}

	// Calcular PVP

	public double calcularPVP(double porcentajeTransporte, double porcentajeVenta) {
		double suma = 0;
		double coste;
		int cien = 100;

		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				coste = productos[i].calcularPrecioCoste(porcentajeTransporte);
				suma += coste + (coste * porcentajeVenta / cien);
			}
		}
		return suma;
	}

	// Calcular ganancias

	public double calcularGanancias(double porcentajeTransporte, double porcentajeVenta) {
		double totalPVP = calcularPVP(porcentajeTransporte, porcentajeVenta);
		double totalFabrica = 0;

		for (int i = 0; i < productos.length; i++) {
			if (productos[i] != null) {
				totalFabrica += productos[i].getPrecioFabrica();
			}
		}
		return totalPVP - totalFabrica;
	}
}
