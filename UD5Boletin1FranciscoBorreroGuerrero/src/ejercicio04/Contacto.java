package ejercicio04;

import java.util.*;

public class Contacto {

	private String nombre;
	private String apellido;

	public Contacto(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Contacto))
			return false;
		Contacto contacto = (Contacto) o;
		return Objects.equals(nombre, contacto.nombre) && Objects.equals(apellido, contacto.apellido);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, apellido);
	}

}
