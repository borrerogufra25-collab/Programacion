package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class GestionNotas {

	// 1º private List<Nota> listaNotas; Si se hace asi no está instanciado y luego
	// dará problemas
	// 2º no instanciarla aqui pero si crear el constructor con contenido. No peta

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

	public int contarNotas() {

		return listaNotas.size();
	}

	public void agregarNota(Nota nota) {

		listaNotas.add(nota);
	}

	public void mostrarTodaLista() {
		for (Nota nota : listaNotas) {
			System.out.println(nota);
		}
	}

	public void borrarNota(int id) {
		Nota n = findById(id);

		if (n != null) {
			listaNotas.remove(n);
		}

	}

	public void modificar(int id, String nuevoTitulo) {
		Nota n = findById(id);

		if (n != null) {
			n.setTitulo(nuevoTitulo);
		}

	}

	public Nota findById(int id) {

		for (Nota nota : listaNotas) {
			if (id == nota.getId()) {
				return nota;
			}
		}
		return null;
	}

}
