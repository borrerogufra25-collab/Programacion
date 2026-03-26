package ejercicioExamen;

import java.util.*;

public class Palabra implements Comparator {

	private int id;
	private String nombreIngles;
	private String significado;

	public Palabra(int id, String nombreIngles, String significado) {
		super();
		this.id = id;
		this.nombreIngles = nombreIngles;
		this.significado = significado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreIngles() {
		return nombreIngles;
	}

	public void setNombreIngles(String nombreIngles) {
		this.nombreIngles = nombreIngles;
	}

	public String getSignificado() {
		return significado;
	}

	public void setSignificado(String significado) {
		this.significado = significado;
	}

	@Override
	public String toString() {
		return "Palabra [id=" + id + ", nombreIngles=" + nombreIngles + ", significado=" + significado + "]";
	}

	@Override
	public int compare(Object o1, Object o2) {

		return this.nombreIngles.compareTo(getNombreIngles());
	}

}
