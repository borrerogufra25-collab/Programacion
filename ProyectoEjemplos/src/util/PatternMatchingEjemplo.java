package util;

import model.Material;
import model.Libro;
import model.Revista;

/**
 * # Pattern Matching para instanceof
 */
public class PatternMatchingEjemplo {

	public static void describirMaterial(Material m) {
		if (m instanceof Libro l) {
			System.out.println("Es un libro: " + l.getTitulo() + " de " + l.getAutor());
		} else if (m instanceof Revista r) {
			System.out.println("Es una revista: " + r.getTitulo() + " nº " + r.getNumero());
		} else {
			System.out.println("Material desconocido");
		}
	}
}
