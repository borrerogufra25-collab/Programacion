package ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

	public static void main(String[] args) {
		List<Prestamo> prestamos = new ArrayList<>();

		prestamos.add(new Prestamo("Elena", "El Hobbit", 7));
		prestamos.add(new Prestamo("Mario", "1984", 12));
		prestamos.add(new Prestamo("Sofía", "La isla del tesoro", 5));
		prestamos.add(new Prestamo("Hugo", "Don Quijote", 15));
		prestamos.add(new Prestamo("Claudia", "Momo", 9));
		prestamos.add(new Prestamo("Álvaro", "Rebelión en la granja", 3));

		mostrarPrestamos(prestamos);

		double mediaDias = calcularMediaDiasPrestamo(prestamos);
		System.out.println("Media de días de préstamo: " + mediaDias);

		Prestamo prestamoMasLargo = buscarPrestamoMasLargo(prestamos);
		System.out.println("Préstamo más largo:");
		System.out.println(prestamoMasLargo);

		int prestamosLargos = contarPrestamosSuperioresA(prestamos, 10);
		System.out
				.println("Préstamos superiores a 10 días: " + prestamosLargos);

		List<Prestamo> prestamosNormales = obtenerPrestamosEntreDias(prestamos,
				5, 10);

		System.out.println();
		System.out.println("Préstamos entre 5 y 10 días:");
		mostrarPrestamos(prestamosNormales);
	}

	public static void mostrarPrestamos(List<Prestamo> prestamos) {
		for (Prestamo prestamo : prestamos) {
			System.out.println(prestamo);
		}
	}

	public static double calcularMediaDiasPrestamo(List<Prestamo> prestamos) {
		int suma = 0;

		for (Prestamo prestamo : prestamos) {
			suma += prestamo.getDiasPrestamo();
		}

		return (double) suma / prestamos.size();
	}

	public static Prestamo buscarPrestamoMasLargo(List<Prestamo> prestamos) {
		Prestamo prestamoMasLargo = prestamos.get(0);

		for (int i = 1; i < prestamos.size(); i++) {
			Prestamo prestamoActual = prestamos.get(i);

			if (prestamoActual.getDiasPrestamo() > prestamoMasLargo
					.getDiasPrestamo()) {
				prestamoMasLargo = prestamoActual;
			}
		}

		return prestamoMasLargo;
	}

	public static int contarPrestamosSuperioresA(List<Prestamo> prestamos,
			int limiteDias) {
		int contador = 0;

		for (Prestamo prestamo : prestamos) {
			if (prestamo.getDiasPrestamo() > limiteDias) {
				contador++;
			}
		}

		return contador;
	}

	public static List<Prestamo> obtenerPrestamosEntreDias(
			List<Prestamo> prestamos, int minimoDias, int maximoDias) {

		List<Prestamo> resultado = new ArrayList<>();

		for (Prestamo prestamo : prestamos) {
			int dias = prestamo.getDiasPrestamo();

			if (dias >= minimoDias && dias < maximoDias) {
				resultado.add(prestamo);
			}
		}

		return resultado;
	}
}

class Prestamo {

	private String usuario;
	private String libro;
	private int diasPrestamo;

	public Prestamo(String usuario, String libro, int diasPrestamo) {
		this.usuario = usuario;
		this.libro = libro;
		this.diasPrestamo = diasPrestamo;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getLibro() {
		return libro;
	}

	public int getDiasPrestamo() {
		return diasPrestamo;
	}

	@Override
	public String toString() {
		return usuario + " tiene prestado \"" + libro + "\" durante "
				+ diasPrestamo + " días";
	}
}