package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion;
		Moneda m1 = new Moneda();
		

		System.out.println("Jugemos al cara o cruz: ");
		System.out.println(m1.Lanzar());
		

		do {
			System.out.println("Eliga una:");
			System.out.println("1. Cruz");
			System.out.println("2. Cara");
			System.out.println("0. Salir");

			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:

				break;
			case 2:

				break;
			case 0:

				break;

			default:
				System.out.println("Opción incorrecta");
				break;
			}

		} while (opcion != 0);

	}

}
