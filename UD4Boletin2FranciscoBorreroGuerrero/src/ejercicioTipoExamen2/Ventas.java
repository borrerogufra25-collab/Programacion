package ejercicioTipoExamen2;

import java.util.Arrays;

public class Ventas {

	private Producto[] listaProductos;

	public Ventas(Producto[] listaProductos) {
		super();
		this.listaProductos = listaProductos;
	}

	public Producto[] getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(Producto[] listaProductos) {
		this.listaProductos = listaProductos;
	}

	@Override
	public String toString() {
		return "Ventas [listaProductos=" + Arrays.toString(listaProductos) + "]";
	}

	public int contarCuantosQueda() {
		int contador = 0;

		for (int i = 0; i < listaProductos.length; i++) {
			if (listaProductos[i] != null) {
				contador += listaProductos[i].getCantidadUnidades();
			}
		}
		return contador;
	}

	public double calcularTotal(double porcentaje) {
		double total = 0;

		for (int i = 0; i < listaProductos.length; i++) {

			if (listaProductos[i] != null) {

				total = total + listaProductos[i].calcularPVP(porcentaje);
			}
		}
		return total;
	}

	public double devolverCambio(double aPagar, double entregado) {

		return entregado - aPagar;
	}

	public void mostrarListado() {

		for (int i = 0; i < listaProductos.length; i++) {
			if (listaProductos[i] != null) {
				System.out.println(listaProductos[i]);
			}
		}
	}

	// Mostrar listado de productos completo mostrando los avisos cuando sea
	// necesario.

}
