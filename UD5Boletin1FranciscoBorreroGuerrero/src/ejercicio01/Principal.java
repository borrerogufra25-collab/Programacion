package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import utilidades.Leer;

/*Realizar un programa que permita gestionar notas de texto (como las de un móvil, no son calificaciones
de clase). Usaremos la clase ArrayList y el listado debe guardar objetos tipo Nota (tú decides los
atributos que debe tener una nota). Se podrán mostrar de manera individual (sin necesidad de buscar,
solo diciendo cuál de la lista mostrada), dar información del número de notas guardadas, agregar una
nueva nota, un método que borre una de las notas guardadas comprobando antes que la lista no está
vacía. Se borrará por número (la nota 1, la 2...), por lo que habrá que mostrarle al usuario la lista con
todas las notas (en un método) y su número correspondiente, el usuario introducirá el número de la
que quiera borrar (esto no es lo ideal puesto que así habría que mostrar todas las notas ¿y si hay miles
de ellas?).
 */

public class Principal {

	public static void main(String[] args) {

		int opcion, indice;
		String titulo;

		Nota n1 = new Nota("Receta Carrillada", 1);
		Nota n2 = new Nota("Series por ver", 2);
		Nota n3 = new Nota("Contraseñas", 3);
		Nota n4;

		List<Nota> listaNotas = new ArrayList<Nota>();

		listaNotas.add(n1);
		listaNotas.add(n2);
		listaNotas.add(n3);

		GestionNotas gn = new GestionNotas(listaNotas);

		System.out.println("Bienvenido a tus notas\n\n");

		do {
			System.out.println("*** Menú ***");
			System.out.println("1. Mostrar una nota en específico");
			System.out.println("2. Decir cuantas notas hay");
			System.out.println("3. Agregar una nota");
			System.out.println("4. Borrar una nota");
			System.out.println("5. Mostrar lista");
			System.out.println("0. Salir");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:

				System.out.println("¿Cuál quieres mostrar?");
				indice = Leer.datoInt();
				if (gn.findById(indice) == null) {
					System.out.println("Nota no encontrada");
				}
				System.out.println(gn.findById(indice));
				;
				break;

			case 2:

				System.out.println("Hay un total de " + gn.contarNotas() + " notas");
				break;

			case 3:
				System.out.println("Ponle titulo: ");
				titulo = Leer.dato();
				System.out.println("¿Qué ID?");
				indice = Leer.datoInt();

				n4 = new Nota(titulo, indice);

				gn.agregarNota(n4);
				break;

			case 4:
				gn.mostrarTodaLista();
				System.out.println("¿Cuál quieres borrar?");
				indice = Leer.datoInt();
				gn.borrarNota(indice);

				break;

			case 5:

				gn.mostrarTodaLista();
				break;

			case 0:
				System.out.println("¡Hasta Pronto!");
				break;

			default:
				System.out.println("Opción incorrecta");
				break;
			}

		} while (opcion != 0);

	}

}
