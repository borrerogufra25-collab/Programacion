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
		return "GestionFamiliar [listaHijos=" + Arrays.toString(listaHijos) + ", presupuesto=" + presupuesto
				+ ", numHijos=";
	}

	// Nunca añadir con ñ
	public void agregarHijo(Hijo hijo, int posicion) {
		// Esto no es valido: int posicion = 0; porque siempre lo guardaría en el 0
		listaHijos[posicion] = hijo;
	}

	// Versión 1

	public Hijo findById(int id) {

		int i = 0;
		boolean encontrado = false;

		while (i < listaHijos.length && !encontrado) {

			if (listaHijos[i].getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return listaHijos[i];
		} else {
			return null;
		}
	}

	// Versión 2 más corto

	public Hijo findByIdV2(int id) {
		for (int i = 0; i < listaHijos.length; i++) {
			if (listaHijos[i].getId() == id) {
				return listaHijos[i];
			}
		}
		return null;
	}

	public double calcularTotalMayores(int topeEdad, double cantidad, double porcentaje) {

		double suma = 0.0;

		for (int i = 0; i < listaHijos.length; i++) {

			if (listaHijos[i].getEdad() > topeEdad) {
				suma = suma + listaHijos[i].calcularPaga(cantidad, porcentaje);
			}
		}
		return suma;
	}

	// Modificar

	public void modificar(int id, int nuevaHoras) {

		Hijo hijoBuscado = findByIdV2(id);

		if (hijoBuscado != null) {
			hijoBuscado.setHorasEstudio(nuevaHoras);
		}
	}

	// Comprobar paga, que mostrará un mensaje por pantalla diciendo “tengo para
	// chuches” solo si la paga del hijo es mayor a 10 € o “ni para pipas” si no es
	// así.

	public void comprobar(int id, double topePaga, double cantHora, double porce) {

		Hijo hijoBuscado = findByIdV2(id);

		if (hijoBuscado != null) {
			if (hijoBuscado.calcularPaga(cantHora, porce) > topePaga) {
				System.out.println("Tengo para chuches");

			} else {
				System.out.println("Ni pa pipas");
			}
		} else {
			System.out.println("No encontrado");
		}
	}
}