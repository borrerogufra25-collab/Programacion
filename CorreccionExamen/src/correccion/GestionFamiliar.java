package correccion;

import java.util.Arrays;

public class GestionFamiliar {

	private Hijo[] listaHijos;
	private double presupuesto;
	private int numHijos;

	public GestionFamiliar(Hijo[] listaHijos, double presupuesto, int numHijos) {
		super();
		this.listaHijos = listaHijos;
		this.presupuesto = presupuesto;
		this.numHijos = numHijos;
	}

	public Hijo[] getListaHijos() {
		return listaHijos;
	}

	public void setListaHijos(Hijo[] listaHijos) {
		this.listaHijos = listaHijos;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	public int getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	@Override
	public String toString() {
		return "GestionFamiliar [listaHijos=" + Arrays.toString(listaHijos) + ", presupuesto=" + presupuesto
				+ ", numHijos=" + numHijos + "]";
	}
}