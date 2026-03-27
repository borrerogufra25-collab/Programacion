package ejercicio;

import java.util.*;

public class Barco {

	private int id;
	private String nombreBarco;
	private int capacidad;
	private List<Coche> listaCoches = new ArrayList<Coche>();

	public Barco() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreBarco() {
		return nombreBarco;
	}

	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<Coche> getListaCoches() {
		return listaCoches;
	}

	public void setListaCoches(List<Coche> listaCoches) {
		this.listaCoches = listaCoches;
	}

	@Override
	public String toString() {
		return "Barco [id=" + id + ", nombreBarco=" + nombreBarco + ", capacidad=" + capacidad + ", listaCoches="
				+ listaCoches + "]";
	}

	public boolean agregarCoche(Coche coche) {

		return listaCoches.add(coche);
	}

	public Coche buscarCoche(String matricula) {

		for (Coche coche : listaCoches) {
			if (coche.getMatricula().equals(matricula)) {
				return coche;
			}
		}
		return null;
	}

	public boolean modificarPrecio(String matricula, double nuevoPrecioBa) {

		Coche co = buscarCoche(matricula);

		if (co != null) {
			co.setPrecioBase(nuevoPrecioBa);
			return true;
		}
		return false;
	}

	public void imprimirTodos() {

		Iterator<Coche> iterator = listaCoches.iterator();

		while (iterator.hasNext()) {
			Coche coche = (Coche) iterator.next();
			System.out.println(coche);
		}
	}

	public Coche buscarCocheTransporte(double cantidadExtra, double menoresCantidad) {

		for (Coche coche : listaCoches) {

			if (coche.calcularPrecioFinal(cantidadExtra) < menoresCantidad) {
				return coche;
			}
		}
		return null;
	}

	public double calcularTotalEspec(double cantidadExtra) {

		double sum = 0;

		for (Coche coche : listaCoches) {
			if (coche.isConEspeciales()) {
				sum += coche.calcularPrecioFinal(cantidadExtra);
			}
		}
		return sum;
	}

}
