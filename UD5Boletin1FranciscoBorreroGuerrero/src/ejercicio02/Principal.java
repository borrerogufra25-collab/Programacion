package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int id;

		Socio s1 = new Socio("Ángel", "Naranjo", "Pérez", "12345678A", 1, 34, 52.23, true, 4);
		Socio s2 = new Socio("Pepito", "Roldán", "Guerrero", "23456789A", 2, 59, 45.72, true, 20);
		Socio s3 = new Socio("Adrián", "Sánchez", "Méndez", "34567890A", 4, 19, 67.2, true, 1);

		List<Socio> listaSocios = new ArrayList<Socio>();

		listaSocios.add(s1);
		listaSocios.add(s2);

		Club c1 = new Club("Juan Carlos 3000", listaSocios, 500);

		System.out.println(listaSocios);

		// Agregar

		c1.agregarSocio(s3);
		System.out.println(listaSocios);

		// Buscar

		System.out.println("Buscar socio. Pasa ID: ");
		id = Leer.datoInt();
		System.out.println(c1.buscarById(id));
		System.out.println("Su índice es: " + c1.buscarByIdDevolviendoIndice(id));

		// Actualizar

	}

}
