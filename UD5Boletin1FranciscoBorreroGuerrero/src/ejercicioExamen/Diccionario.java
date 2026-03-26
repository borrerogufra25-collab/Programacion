package ejercicioExamen;

import java.util.*;

public class Diccionario {

	private List<Palabra> listaPalabras;

	public Diccionario(List<Palabra> listaPalabras) {
		super();
		this.listaPalabras = listaPalabras;
	}

	public List<Palabra> getListaPalabras() {
		return listaPalabras;
	}

	public void setListaPalabras(List<Palabra> listaPalabras) {
		this.listaPalabras = listaPalabras;
	}

	@Override
	public String toString() {
		return "Diccionario [listaPalabras=" + listaPalabras + "]";
	}

	// Buscar

	public Palabra findById(String nombre) {

		for (Palabra palabra : listaPalabras) {
			if (palabra.getNombreIngles().equals(nombre)) {
				return palabra;
			}
		}
		return null;
	}

	// Read

	public void leer() {
		Iterator<Palabra> it = listaPalabras.iterator();
		while (it.hasNext()) {
			Palabra palabra = (Palabra) it.next();
			if (palabra != null) {
				System.out.println(palabra);
			}
		}
	}
}