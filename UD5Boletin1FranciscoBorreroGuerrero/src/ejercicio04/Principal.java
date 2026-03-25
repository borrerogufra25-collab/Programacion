/*Realizar, usando la clase HashMap, una agenda de teléfonos (un Contacto como clave y el número de
teléfono como valor). Crear aquellos métodos que se utilizan normalmente en una agenda, como
agregar, borrar, mostrar, buscar por algún criterio (por ejemplo, por nombre), modificar algún dato,
etc. Y un main para probar todo.*/

package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion, telefono;
		String nombre, apellido;
		Integer telEncontrado = null;

		AgendaTelefono agenda = new AgendaTelefono();

		agenda.agregarContacto(new Contacto("Juan", "Pérez", 15), 600123123);
		agenda.agregarContacto(new Contacto("Ana", "López", 18), 611222333);
		agenda.agregarContacto(new Contacto("Carlos", "Ruiz", 19), 622333444);
		agenda.agregarContacto(new Contacto("Lucía", "Martín", 20), 633444555);
		agenda.agregarContacto(new Contacto("Juan", "García", 29), 644555666);

		do {
			System.out.println("\n***** AGENDA TELEFÓNICA *****");
			System.out.println("1. Agregar contacto");
			System.out.println("2. Borrar contacto");
			System.out.println("3. Mostrar agenda");
			System.out.println("4. Buscar por nombre");
			System.out.println("5. Modificar teléfono");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");

			opcion = Leer.datoInt();

			switch (opcion) {

			case 1:
				System.out.print("Nombre: ");
				nombre = Leer.dato();
				System.out.print("Apellido: ");
				apellido = Leer.dato();
				System.out.print("Número de teléfono: ");
				telefono = Leer.datoInt();

				agenda.agregarContacto(new Contacto(nombre, apellido, telefono), telefono);
				System.out.println("Contacto agregado.");
				break;

			case 2:
				System.out.print("Nombre del contacto a borrar: ");
				nombre = Leer.dato();
				System.out.print("Apellido: ");
				apellido = Leer.dato();

				agenda.borrarContacto(new Contacto(nombre, apellido, telEncontrado));
				System.out.println("Contacto borrado");
				break;

			case 3:
				agenda.mostrarAgenda();
				break;

			case 4:
				System.out.print("Nombre a buscar: ");
				nombre = Leer.dato();
				telEncontrado = agenda.buscarPorNombre(nombre);

				if (telEncontrado != null)
					System.out.println("Teléfono encontrado: " + telEncontrado);
				else
					System.out.println("No se encontró ningún contacto con ese nombre.");
				break;

			case 5:
				System.out.print("Nombre: ");
				nombre = Leer.dato();
				System.out.print("Apellido: ");
				apellido = Leer.dato();
				System.out.print("Nuevo teléfono: ");
				telefono = Leer.datoInt();

				agenda.modificarTelefono(new Contacto(nombre, apellido, telEncontrado), telefono);
				break;

			case 0:
				System.out.println("¡Hasta pronto!");
				break;

			default:
				System.out.println("Opción no válida.");
			}

		} while (opcion != 0);

		System.out.println(agenda.calcularMedia());

	}

}
