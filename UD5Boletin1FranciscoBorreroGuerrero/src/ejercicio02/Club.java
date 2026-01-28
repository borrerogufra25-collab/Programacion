package ejercicio02;

import java.util.List;

public class Club {

	private String nombreClub;
	private List<Socio> listaSocios;
	private int aforoPersonas;
	private double precioCambio;

	public Club(String nombreClub, List<Socio> listaSocios, int aforoPersonas, double precioCambio) {
		super();
		this.nombreClub = nombreClub;
		this.listaSocios = listaSocios;
		this.aforoPersonas = aforoPersonas;
		this.precioCambio = precioCambio;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}

	public List<Socio> getListaSocios() {
		return listaSocios;
	}

	public void setListaSocios(List<Socio> listaSocios) {
		this.listaSocios = listaSocios;
	}

	public int getAforoPersonas() {
		return aforoPersonas;
	}

	public void setAforoPersonas(int aforoPersonas) {
		this.aforoPersonas = aforoPersonas;
	}

	public double getPrecioCambio() {
		return precioCambio;
	}

	public void setPrecioCambio(double precioCambio) {
		this.precioCambio = precioCambio;
	}

	@Override
	public String toString() {
		return "Club [nombreClub=" + nombreClub + ", listaSocios=" + listaSocios + ", aforoPersonas=" + aforoPersonas
				+ ", precioCambio=" + precioCambio + "]";
	}

	// CRUD

	// Agregar
	// Siempre se pasa el objeto a pasar completo
	// Los agregar devuelven 2 cosas: nada o un boolean

	public void agregarSocio(Socio socio) {

		listaSocios.add(socio);
	}

	public boolean agregarSocio2Boleean(Socio socio) {

		return listaSocios.add(socio);
	}

	// Buscar
	// Se puede por int o el objeto en si

	public Socio buscarById(int id) {

		for (int i = 0; i < listaSocios.size(); i++) {

			if (id == listaSocios.get(i).getID()) {

				return listaSocios.get(i);
			}
		}
		return null;
	}

	public int buscarByIdDevolviendoIndice(int id) {

		for (int i = 0; i < listaSocios.size(); i++) {

			if (id == listaSocios.get(i).getID()) {

				return i;
			}
		}
		return -1;
	}

	// El buscar mejorado
	// Imprimir usando for each
	// Derecha: nombre de la colección a recorrer
	// Izquierda: La colección del tipo de la lista

	public void imprimirLista() {

		for (Socio socio : listaSocios) {
			System.out.println(socio);
		}
	}

	// Actualizar bien hecho

	public void modificarSocio(int indice, double nuevaCuota) {
		int index = buscarByIdDevolviendoIndice(indice);

		if (index >= 0) {
			listaSocios.get(index).setCuota(nuevaCuota);
		}
	}

	// Borrar

	public void borrar(int id) {
		Socio socio = buscarById(id);

		if (socio != null) {
			listaSocios.remove(id);
		}

	}

	// Método NO CRUD

	public double calcularMediaTotal(double cantidad) {
		double total = 0;

		for (Socio socio : listaSocios) {
			total = total + socio.calcularCuotaFinal(cantidad);
		}
		return total / listaSocios.size();
	}

}
