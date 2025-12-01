package ejercicio01;

import utilidades.Leer;

public class Cabecera {

	// Atributos

	private String nombreAsignatura;
	private String aula;
	private String fecha;

	// Vamos a crear los contructores con 3 tipos

	// Con todos los parámetros

	public Cabecera(String nombreAsignatura, String aula, String fecha) {

		this.nombreAsignatura = nombreAsignatura;
		this.aula = aula;
		this.fecha = fecha;
	}

	// Ahora uno vacio

	public Cabecera() {

	}

	// Con 2 parámetros

	public Cabecera(String nombreAsignatura, String aula) {

		this.nombreAsignatura = nombreAsignatura;
		this.aula = aula;
	}

	// Método
	// Como tengo los valores como atriburos no los tengo que pasar como parámetros
	// a este método

	public void imprimirCabecera() {
		System.out.println("**Nombre asignatura: " + nombreAsignatura);
		System.out.println("**Nombre del aula: " + aula);
		System.out.println("**Fecha: " + fecha);
	}

	// Getters and setters

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsig(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	// Como tengo los valores como atriburos no los tengo que pasar como parámetros
	// a este método

	public void imprimirCabeceraV2(String nombreProfe) {
		System.out.println("**Nombre asignatura: " + nombreAsignatura);
		System.out.println("**Nombre del aula: " + aula);
		System.out.println("**Fecha: " + fecha);
		System.out.println("** El profesor es: " + nombreProfe);
	}

	@Override
	public String toString() {
		return "Cabecera [nombreAsignatura=" + nombreAsignatura + ", aula=" + aula + ", fecha=" + fecha + "]";
	}
	
	

}
