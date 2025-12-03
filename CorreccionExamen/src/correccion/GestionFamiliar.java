package correccion;

import java.util.Arrays;

public class GestionFamiliar {

	private Hijo[] listaHijos;
	private double presupuesto;

	public GestionFamiliar(Hijo[] listaHijos, double presupuesto) {
		super();
		this.listaHijos = listaHijos;
		this.presupuesto = presupuesto;
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

	@Override
	public String toString() {
		return "GestionFamiliar [listaHijos=" + Arrays.toString(listaHijos) + ", presupuesto=" + presupuesto + "]";
	}

}
