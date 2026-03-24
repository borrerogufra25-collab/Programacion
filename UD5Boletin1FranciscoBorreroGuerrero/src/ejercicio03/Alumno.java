package ejercicio03;

import java.util.*;

public class Alumno implements Comparable<Alumno> {

	private String nombre;
	private int id;
	private String dni;
	private List<Double> listaNotas = new ArrayList<Double>();

	public Alumno(String nombre, int id, String dni, List<Double> listaNotas) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.dni = dni;
		this.listaNotas = listaNotas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public List<Double> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Double> listaNotas) {
		this.listaNotas = listaNotas;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", id=" + id + ", dni=" + dni + ", listaNotas=" + listaNotas + "]";
	}

	@Override
	public int compareTo(Alumno alumno) {
		return this.nombre.compareTo(alumno.getNombre());
	}
}
