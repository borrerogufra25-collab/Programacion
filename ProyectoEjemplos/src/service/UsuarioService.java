package service;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * # Servicio de Usuarios
 */
public class UsuarioService {

	private final List<Usuario> usuarios = new ArrayList<>();

	public void agregar(Usuario usuario) {
		usuarios.add(usuario);
	}

	public List<Usuario> listar() {
		return new ArrayList<>(usuarios);
	}

	public Optional<Usuario> buscarPorId(int id) {
		return usuarios.stream().filter(u -> u.getId() == id).findFirst();
	}

	public boolean eliminar(int id) {
		return usuarios.removeIf(u -> u.getId() == id);
	}
}
