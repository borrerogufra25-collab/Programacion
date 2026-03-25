package ejercicio04;

import java.util.*;

public class AgendaTelefono {

	private HashMap<Contacto, Integer> agenda;

	public AgendaTelefono() {
		agenda = new HashMap<>();
	}

	public void agregarContacto(Contacto c, int telefono) {
		agenda.put(c, telefono);
	}

	public void borrarContacto(Contacto c) {
		agenda.remove(c);
	}

	public void mostrarAgenda() {
		if (agenda.isEmpty()) {
			System.out.println("La agenda está vacía.");
			return;
		}
		for (Map.Entry<Contacto, Integer> entry : agenda.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}

	public Integer buscarPorNombre(String nombre) {
		for (Map.Entry<Contacto, Integer> entry : agenda.entrySet()) {
			if (entry.getKey().getNombre().equals(nombre)) {
				return entry.getValue();
			}
		}
		return null;
	}

	public void modificarTelefono(Contacto c, int nuevoTelefono) {
		if (agenda.containsKey(c)) {
			agenda.put(c, nuevoTelefono);
		} else {
			System.out.println("El contacto no existe en la agenda.");
		}
	}

	public double calcularMedia() {
		double suma = 0;
		for (Map.Entry<Contacto, Integer> entry : agenda.entrySet()) {

			Contacto key = entry.getKey();

			suma += key.getEdad();
		}
		return suma / agenda.size();

	}

}
