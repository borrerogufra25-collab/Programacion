package ejercicioTipoExamen;

public class Principal {

	public static void main(String[] args) {

		Habitacion h1 = new Suite(235.95, true, "Maradona", 3, 2, 07, 40.32, 30);
		Habitacion h2 = new Suite(235.95, false, "No ocupada", 0, 0, 05, 60.20, 0);
		Habitacion h3 = new Apartamento(235.95, true, "Manolito CaraChunga", 3, 2, 3, 29.56);
		Habitacion h4 = new Apartamento(235.95, false, "No ocupada", 0, 0, 7, 29.56);

		Habitacion[] listahabitaciones = { h1, h2, h3, h4 };

		GestionHabitaciones gh = new GestionHabitaciones(listahabitaciones);

		System.out.printf("El precio es: %.2f €\n", gh.calcularPrecioLista(07, 25));

		System.out.println("El precio total recaudado es: " + gh.calcularTotalOcupadas(25));

		gh.buscarPorNumero(7);

	}

}
