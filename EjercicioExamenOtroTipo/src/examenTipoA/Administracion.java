package examenTipoA;

import java.util.Arrays;

public class Administracion {

	private Profesor[] listaProfesor;
	private double presupuestoTotal;

	public Administracion(Profesor[] listaProfesor, double presupuestoTotal) {
		super();
		this.listaProfesor = listaProfesor;
		this.presupuestoTotal = presupuestoTotal;
	}

	public Profesor[] getListaProfesor() {
		return listaProfesor;
	}

	public void setListaProfesor(Profesor[] listaProfesor) {
		this.listaProfesor = listaProfesor;
	}

	public double getPresupuestoTotal() {
		return presupuestoTotal;
	}

	public void setPresupuestoTotal(double presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}

	@Override
	public String toString() {
		return "Administracion [listaProfesor=" + Arrays.toString(listaProfesor) + ", presupuestoTotal="
				+ presupuestoTotal + "]";
	}

	public void agregarProfesor(Profesor p, int contador) {
		listaProfesor[contador] = p;
	}

	public void buscarProfesorID(int id) {

		for (int i = 0; i < listaProfesor.length; i++) {
			if (condition) {
				
			}
		}
	}

}
