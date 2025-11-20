package ejercicio10;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {

		// Creamos la máquina con número identificador, contraseña y precio inicial

		Maquina maquina = new Maquina(1, 1234, 2.0);
		Ticket t;
		Ticket ticketTemp;
		int opcion, numBilletes, saltos, contrasenia, opcionesOperario;
		;
		double dinero, precio;

		do {
			System.out.println("\n--- MENÚ MÁQUINA DE TICKETS ---");
			System.out.println("1. Comprar billete(s)");
			System.out.println("2. Opciones de operario");
			System.out.println("0. Salir");
			System.out.print("Elige opción: ");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.print("Número de billetes: ");
				numBilletes = Leer.datoInt();
				System.out.print("Número de saltos: ");
				saltos = Leer.datoInt();

				// Creamos un ticket provisional para calcular el precio
				ticketTemp = new Ticket(maquina.getPrecioBase(), numBilletes, saltos);
				precio = ticketTemp.calcularPrecio();
				System.out.println("El precio del billete es: " + precio + " €");

				// Ahora pedimos el dinero
				System.out.print("Dinero entregado: ");
				dinero = Leer.datoDouble();

				// Compramos el billete con el dinero entregado
				t = maquina.comprarBillete(numBilletes, saltos, dinero);
				if (t != null) {
					System.out.println(t.imprimirBillete());
				}
				break;
			case 2:
				System.out.print("Introduce contraseña: ");
				contrasenia = Leer.datoInt();

				if (maquina.comprobarContrasenia(contrasenia)) {

					do {
						System.out.println("\n--- MENÚ OPERARIO ---");
						System.out.println("1. Ver saldo total");
						System.out.println("2. Cambiar precio billete");
						System.out.println("0. Volver");
						System.out.print("Elige opción: ");
						opcionesOperario = Leer.datoInt();

						switch (opcionesOperario) {
						case 1:
							System.out.println("Saldo total: " + maquina.getSaldoTotal() + " €");
							break;

						case 2:
							System.out.print("Nuevo precio base: ");
							double nuevoPrecio = Leer.datoDouble();
							maquina.CambiarPrecio(nuevoPrecio);
							System.out.println("Precio actualizado a " + nuevoPrecio + " €");
							break;
						}
					} while (opcionesOperario != 0);
				} else {
					System.out.println("Contraseña incorrecta.");
				}
				break;

			case 0:
				System.out.println("¡Hasta pronto!");

				break;

			default:
				System.out.println("Opción incorrecta.");

				break;

			}
		} while (opcion != 0);

		System.out.println("Programa finalizado.");

	}
}
