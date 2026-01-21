package ejercicio;

import java.util.Arrays;

public class Aeropuerto {

	private String nombre;
	private Avion[] listaAviones;

	public Aeropuerto(String nombre, Avion[] listaAviones) {
		super();
		this.nombre = nombre;
		this.listaAviones = listaAviones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Avion[] getListaAviones() {
		return listaAviones;
	}

	public void setListaAviones(Avion[] listaAviones) {
		this.listaAviones = listaAviones;
	}

	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", listaAviones=" + Arrays.toString(listaAviones) + "]";
	}

	public double calcularAterrizajeElegido(int id, double precioLongitud, double precioTopeLitro, double topeLitros,
			double porcetanjeMotores, int topeMotores, double precioPorMisil, double precioPorAterrizaje,
			double porcentajeExtras) {
		double total = 0.0;

		for (int i = 0; i < listaAviones.length; i++) {
			if (listaAviones[i].getID() == id && listaAviones[i] != null) {
				total = listaAviones[i].calcularAterrizaje(precioLongitud, precioTopeLitro, topeLitros,
						porcetanjeMotores, topeMotores, precioPorMisil)
						+ listaAviones[i].calcularExtra(precioPorAterrizaje, porcentajeExtras);
			}
		}
		return total;
	}

	public double calcularTotalRecaudado(double precioLongitud, double precioTopeLitro, double topeLitros,
			double porcetanjeMotores, int topeMotores, double precioPorMisil, double precioPorAterrizaje,
			double porcentajeExtras) {
		double total = 0.0;

		for (int i = 0; i < listaAviones.length; i++) {
			if (listaAviones[i] != null) {
				total = total
						+ listaAviones[i].calcularAterrizaje(precioLongitud, precioTopeLitro, topeLitros,
								porcetanjeMotores, topeMotores, precioPorMisil)
						+ listaAviones[i].calcularExtra(precioPorAterrizaje, porcentajeExtras);
			}
		}
		return total;

	}

	public void mostrarAviones() {

		for (int i = 0; i < listaAviones.length; i++) {

			System.out.println(listaAviones[i]);
		}
	}

}
