package service;

import model.Libro;
import model.Prestamo;
import model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * # Servicio de Préstamos
 */
public class PrestamoService {

	private final List<Prestamo> prestamos = new ArrayList<>();

	public Optional<Prestamo> crearPrestamo(Libro libro, Usuario usuario) {
		if (!libro.isDisponible()) {
			return Optional.empty();
		}
		Prestamo p = new Prestamo(libro, usuario);
		prestamos.add(p);
		libro.setDisponible(false);
		return Optional.of(p);
	}

	public List<Prestamo> listar() {
		return new ArrayList<>(prestamos);
	}
}
