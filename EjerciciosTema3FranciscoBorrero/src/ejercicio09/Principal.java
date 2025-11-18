package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion, elegido;
		Sorteo s = new Sorteo();

		do {
			System.out.println("\n***** Bienvenido/a *****\n");
			System.out.println("1. Comprar décimo elegido");
			System.out.println("2. Comprar décimo aleatorio");
			System.out.println("3. Hacer sorteo");
			System.out.println("4. Comprobar décimo");
			System.out.println("0. Salir");
			System.out.print("\nElija una opción: ");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.print("Introduzca su número (entre 1 y 99999): ");
				elegido = Leer.datoInt();
				s.generarComprado(elegido);
				break;

			case 2:
				s.comprarAleatorio();
				s.mostrarNumeroComprado();
				break;

			case 3:
				s.realizarSorteo();
				break;

			case 4:
				s.comprobarPremio();
				break;

			case 0:
				System.out.println("Gracias por participar. ¡Hasta pronto!");
				break;

			default:
				System.out.println("Opción incorrecta. Intente de nuevo.");
				break;
			}

		} while (opcion != 0);
	}
}
