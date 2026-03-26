package service;

import model.Libro;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * # Servicio de Libros
 *
 * Gestiona las operaciones CRUD de libros.
 */
public class LibroService {

	private final List<Libro> libros = new ArrayList<>();

	public void agregar(Libro libro) {
		libros.add(libro);
	}

	public List<Libro> listar() {
		return new ArrayList<>(libros);
	}

	public Optional<Libro> buscarPorId(int id) {
		return libros.stream().filter(l -> l.getId() == id).findFirst();
	}

	public boolean eliminar(int id) {
		return libros.removeIf(l -> l.getId() == id);
	}

	public void marcarNoDisponible(int id) {
		buscarPorId(id).ifPresent(l -> l.setDisponible(false));
	}

	public void marcarDisponible(int id) {
		buscarPorId(id).ifPresent(l -> l.setDisponible(true));
	}
}
