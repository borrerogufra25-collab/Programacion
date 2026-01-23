package ejercicio02;

import java.util.List;

public class Club {

	private String nombreClub;
	private List<Socio> listaSocios;
	private int aforoPersonas;

	public Club(String nombreClub, List<Socio> listaSocios, int aforoPersonas) {
		super();
		this.nombreClub = nombreClub;
		this.listaSocios = listaSocios;
		this.aforoPersonas = aforoPersonas;
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

	@Override
	public String toString() {
		return "Club [nombreClub=" + nombreClub + ", listaSocios=" + listaSocios + ", aforoPersonas=" + aforoPersonas
				+ "]";
	}

	// CRUD

	public void agregarSocio(Socio socio) {

		listaSocios.add(socio);
	}

	public Socio buscarById(int id) {

		for (int i = 0; i < listaSocios.size(); i++) {

			if (id == listaSocios.get(i).getID()) {

				return listaSocios.get(i);
			}
		}
		return null;
	}

}
