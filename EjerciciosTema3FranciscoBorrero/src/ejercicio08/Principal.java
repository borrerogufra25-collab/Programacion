package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int opcion, ingreso = 0, retirar = 0;
		double dolar = 1.08, saldo;
		String titular;
		Cuenta c1; // Se puede instanciar sin meter datos

		System.out.println("Introduzca el nombre del titular: ");
		titular = Leer.dato();
		System.out.println("Introduzca el saldo inicial: ");
		saldo = Leer.datoDouble();
		c1 = new Cuenta(saldo, titular); // ESTO ES UN OBJETO. ESTE ORDEN ES IGUAL QUE EL CONSTRUCTOR DE ANTES

		/*
		 * Caso 1º es preguntar cunto dinero mete. Tiene que poner el ingrreso por
		 * teclado y luego c1.ingresar(ingreso);
		 */

	}

}
