package ejercicio01;

import java.util.*;

public class Secretaria {

	List<Alumno> listaAlumnos = new ArrayList<Alumno>();

	public List<Alumno> obtenerTodos() {

		return listaAlumnos.stream()
				.toList();
	}

	public void addAlumno(Alumno a1) {
		listaAlumnos.add(a1);
	}

	public void imprimirTodos() {
		listaAlumnos.stream()
				.forEach(System.out::println);
	}

	public void imprimirPorLetra(String letra) {
		listaAlumnos.stream()
				.filter(a -> a.getNombre()
						.startsWith(letra))
				.forEach(System.out::println);
	}

	public long contarAlumnos() {
		return listaAlumnos.stream()
				.count();
	}

	public List<Alumno> obtenerAlumnoNota(String cursoMetodo,
			double notaMetodo) {

		return listaAlumnos.stream()
				.filter(a -> a.getCurso()
						.equalsIgnoreCase(cursoMetodo))
				.filter(a -> a.getNotaMedia() > notaMetodo)
				.toList();
	}

	public void imprimirTresPrimeros() {
		listaAlumnos.stream()
				.limit(3)
				.forEach(System.out::println);
	}

	public Alumno obtenerAlumnoMenor() {
		return listaAlumnos.stream()
				.min(Comparator.comparingInt(Alumno::getEdad))
				.orElse(null);

	}

	public Alumno obtenerPrimero() {
		return listaAlumnos.stream()
				.findFirst()
				.orElse(null);
	}

	public List<Alumno> obtenerAlumnosMuchasLetras(int numLetras) {
		return listaAlumnos.stream()
				.filter(a -> a.getNombre()
						.length() > numLetras)
				.toList();
	}

	public List<Alumno> filtrarAlumnoLetraTam(String letra, int tam) {
		return listaAlumnos.stream()
				.filter(a -> a.getNombre()
						.startsWith(letra))
				.filter(a -> a.getNombre()
						.length() <= tam)
				.toList();
	}

}
