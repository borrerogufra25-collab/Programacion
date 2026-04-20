package ejercicio04;

import java.time.*;
import java.util.*;

public class Quedada {

	private int id;
	private LocalDate dia;
	private LocalTime hora;
	private String sitio;
	private double presupuestoTotal;
	private double presupuestoIndividual;
	private boolean hayTransporte;
	private List<String> grupoAmigos;

	public Quedada(int id, LocalDate dia, LocalTime hora, String sitio,
			double presupuestoTotal, double presupuestoIndividual,
			boolean hayTransporte, List<String> grupoAmigos) {
		super();
		this.id = id;
		this.dia = dia;
		this.hora = hora;
		this.sitio = sitio;
		this.presupuestoTotal = 0;
		this.presupuestoIndividual = presupuestoIndividual;
		this.hayTransporte = hayTransporte;
		this.grupoAmigos = new ArrayList<String>();
	}

	public LocalDate getDia() {
		return dia;
	}

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public String getSitio() {
		return sitio;
	}

	public void setSitio(String sitio) {
		this.sitio = sitio;
	}

	public double getPresupuestoTotal() {
		return presupuestoTotal;
	}

	public void setPresupuestoTotal(double presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}

	public boolean isHayTransporte() {
		return hayTransporte;
	}

	public void setHayTransporte(boolean hayTransporte) {
		this.hayTransporte = hayTransporte;
	}

	public List<String> getGrupoAmigos() {
		return grupoAmigos;
	}

	public void setGrupoAmigos(List<String> grupoAmigos) {
		this.grupoAmigos = grupoAmigos;
	}

	public double getPresupuestoIndividual() {
		return presupuestoIndividual;
	}

	public void setPresupuestoIndividual(double presupuestoIndividual) {
		this.presupuestoIndividual = presupuestoIndividual;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Quedada:\nDia= " + dia + "\nHora= " + hora + "\nSitio= " + sitio
				+ "\nPresupuesto Total= " + presupuestoTotal + " €"
				+ "\n¿Hay Transporte? " + hayTransporte + "\nGrupo de amigos= "
				+ grupoAmigos;
	}

	public double totalPresupuesto() {
		return grupoAmigos.size() * presupuestoIndividual;
	}

}