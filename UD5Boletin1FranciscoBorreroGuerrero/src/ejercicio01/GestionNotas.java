package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class GestionNotas {

	private List<Nota> listaNotas = new ArrayList<Nota>();

	public GestionNotas(List<Nota> listaNotas) {
		super();
		this.listaNotas = listaNotas;
	}

	public List<Nota> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Nota> listaNotas) {
		this.listaNotas = listaNotas;
	}

	@Override
	public String toString() {
		return "GestionNotas [listaNotas=" + listaNotas + "]";
	}

	public void mostrarElementoLista(int posicion) {

		if (listaNotas.contains(listaNotas)) {
			listaNotas.get(posicion);
		} else {
			System.out.println("No encontrado");
		}
	}

	public int contarNotas() {

		return listaNotas.size();
	}

	public void agregarNota(Nota nota) {

		listaNotas.add(nota);
	}

	public void mostrarTodaLista() {
		System.out.println(listaNotas.toArray());
	}

	public void borrarNota(int numNota) {

		if (listaNotas.get(numNota) != null) {
			listaNotas.remove(numNota);

		}

	}

}
