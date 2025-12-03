package correccion;

public class Principal {

	public static void main(String[] args) {

		String nombre;
		int tam = 100;
		int id;
		int edad;
		int horasEstudio;
		double cantidad;
		double porcentaje;
		double presupuesto=10000;

		// Creacion de objetos a cascaporra

		Hijo h1 = new Hijo("Pepe", 1, 13, 8);
		Hijo h2 = new Hijo("Juan", 2, 15, 6);

		// Creación arrays de hijos

		Hijo[] listaHijos = new Hijo[tam]; // Se puede preguntar por teclado si se quiere

		// Crear objeto de gestión

		GestionFamiliar gf = new GestionFamiliar(listaHijos, presupuesto);

	}

}
