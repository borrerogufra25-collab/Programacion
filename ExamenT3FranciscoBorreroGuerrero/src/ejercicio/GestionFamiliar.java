package ejercicio;

import java.util.Arrays;

public class GestionFamiliar {

	private Hijo[] listaHijos;
	private double presupuestoTotal;

	public GestionFamiliar(Hijo[] listaHijos, double presupuestoTotal) {
		super();
		this.listaHijos = listaHijos;
		this.presupuestoTotal = presupuestoTotal;
	}

	public Hijo[] getListaHijos() {
		return listaHijos;
	}

	public void setListaHijos(Hijo[] listaHijos) {
		this.listaHijos = listaHijos;
	}

	public double getPresupuestoTotal() {
		return presupuestoTotal;
	}

	public void setPresupuestoTotal(double presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}

	@Override
	public String toString() {
		return "GestionFamiliar [listaHijos=" + Arrays.toString(listaHijos) + ", presupuestoTotal=" + presupuestoTotal
				+ "]";
	}

	public void agregarHijo(Hijo hijo, int contador) {

		listaHijos[contador] = hijo;

	}

	public Hijo buscarHijo(int id) {

		int i = 0;
		boolean encontrado = true;

		while (i < listaHijos.length && !encontrado) {
			if (encontrado) {
				return listaHijos[i];

			} else {

				i++;
			}

		}
		return null;
	}

	public Hijo buscarMenores() {

		for (int i = 0; i < listaHijos.length; i++) {
			Hijo hijo = listaHijos[i];

			if (hijo.getEdad() > 14) {
				return listaHijos[i];
			}

		}
		return null;

	}

	public double pagarMayores(double paga) {
		double total = 0.0;

		for (int i = 0; i < listaHijos.length; i++) {
			Hijo hijo = listaHijos[i];
			if (hijo.getEdad() > 14) {
				total = total + paga;
			}
		}
		return total;
	}

	public void cambiarHoras(int id, int nuevaHora) {

		int i = 0;
		boolean encontrado = true;

		while (i < listaHijos.length && !encontrado) {
			if (encontrado) {

				listaHijos[id].setHorasEstudio(nuevaHora);

			}

		}

	}

	public void mostarHijos() {
		for (int i = 0; i < listaHijos.length; i++) {
			Hijo hijo = listaHijos[i];
			if (listaHijos[i] != null) {

				System.out.println(listaHijos[i]);

			}
		}
	}

}
