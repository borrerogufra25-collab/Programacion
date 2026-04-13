package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		Gestor g = new Gestor();
		int opcion;
		int id, numero, edad;
		double cantidad;
		String texto, nombreObjeto;

		do {
			System.out.println("\n===== MENÚ DE PRUEBAS =====");
			System.out.println("1. Generar número único");
			System.out.println("2. Asignar ID a objeto");
			System.out.println("3. Comprobar si un número es par");
			System.out.println("4. Hacer Bizum");
			System.out.println("5. Validar cadena");
			System.out.println("6. Validar edad");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");

			opcion = Leer.datoInt();

			switch (opcion) {

			case 1:
				try {
					int num = g.generarNumeroUnico();
					System.out.println("Número generado correctamente: " + num);
				} catch (NumeroRepetidoException e) {
					System.out.println("ERROR: " + e.getMessage());
				}
				break;

			case 2:
				try {
					System.out.print("Introduce ID: ");
					id = Leer.datoInt();

					System.out.print("Introduce nombre del objeto: ");
					nombreObjeto = Leer.dato();

					g.asignarId(id, nombreObjeto);
					System.out.println("ID asignado correctamente.");
				} catch (IdDuplicadoException e) {
					System.out.println("ERROR: " + e.getMessage());
				}
				break;

			case 3:
				try {
					System.out.print("Introduce un número: ");
					numero = Leer.datoInt();

					g.comprobarPar(numero);
					System.out.println("El número es par.");
				} catch (NumeroImparException e) {
					System.out.println("ERROR: " + e.getMessage());
				}
				break;

			case 4:
				try {
					System.out.print("Cantidad a enviar por Bizum: ");
					cantidad = Leer.datoDouble();

					g.hacerBizum(cantidad);
					System.out.println("Bizum realizado correctamente.");
				} catch (SaldoInsuficienteException e) {
					System.out.println("ERROR: " + e.getMessage());
				}
				break;

			case 5:
				try {
					System.out.print("Introduce una cadena: ");
					texto = Leer.dato();

					g.validarCadena(texto);
					System.out.println("Cadena válida.");
				} catch (CadenaVaciaException e) {
					System.out.println("ERROR: " + e.getMessage());
				}
				break;

			case 6:
				try {
					System.out.print("Introduce edad: ");
					edad = Leer.datoInt();

					g.validarEdad(edad);
					System.out.println("Edad válida.");
				} catch (EdadNoValidaException e) {
					System.out.println("ERROR: " + e.getMessage());
				}
				break;

			default:
				System.out.println("Opción no válida.");
			}

		} while (opcion != 0);
	}
}
