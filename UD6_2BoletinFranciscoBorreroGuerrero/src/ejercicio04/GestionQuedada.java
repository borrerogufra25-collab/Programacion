package ejercicio04;

import java.time.LocalDate;
import java.util.*;

public class GestionQuedada {

	private List<Quedada> listaQuedadas;

	public GestionQuedada(List<Quedada> listaQuedadas) {
		super();
		this.listaQuedadas = listaQuedadas;
	}

	public List<Quedada> getListaQuedadas() {
		return listaQuedadas;
	}

	public void setListaQuedadas(List<Quedada> listaQuedadas) {
		this.listaQuedadas = listaQuedadas;
	}

	@Override
	public String toString() {
		return "GestionQuedada [listaQuedadas=" + listaQuedadas + "]";
	}

	public void agregar(Quedada q) {
		listaQuedadas.add(q);
	}

	public Quedada buscarID(int id) {
		return listaQuedadas.stream()
				.filter(q -> q.getId() == id)
				.findFirst()
				.orElse(null);
	}

	public List<Quedada> buscarPorFecha(LocalDate fecha) {
		return listaQuedadas.stream()
				.filter(q -> q.getDia()
						.isEqual(fecha))
				.toList();
	}

	// Media de los que usan transporte
	// El número de quedadas donde el presupuesto final es mayor

	public double mediaUsoTransporte() {
		return listaQuedadas.stream()
				.filter(q -> q.isHayTransporte() == true)
				.count() / listaQuedadas.size() * 100;
	}

}
