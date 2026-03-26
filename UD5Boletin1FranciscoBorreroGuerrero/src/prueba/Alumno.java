package prueba;

import java.util.*;

public class Alumno implements Comparable<Alumno> {

	private String nombre;
	private int edad;
	private int id;
	private List<Double> listaNotas;

	public Alumno(String nombre, int edad, int id, List<Double> listaNotas) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
		this.listaNotas = new ArrayList<Double>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Double> getListaNotas() {
		return listaNotas;
	}

	public void setListaNotas(List<Double> listaNotas) {
		this.listaNotas = listaNotas;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", listaNotas=" + listaNotas + "]";
	}

	@Override
	public int compareTo(Alumno o) {

		if (this.edad > o.edad) {
			return 1;
		} else {
			if (this.edad < o.edad) {
				return -1;
			}
		}
		return 0;
	}

}
