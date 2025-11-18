package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		Cabecera c1, c2, c3, c4, c5;
		String nombreAsignatura, aula, fecha;

		// Creamos los objetos usando los distintos constructores

		// 1. A cascaporra

		c1 = new Cabecera("Programación", "1 DAM", "6/11/2025");

		// Solo con dos parámetros

		c2 = new Cabecera("Base de datos", "1 DAM");

		// Vacío

		c3 = new Cabecera();
		
		/*

		// 2. Leyendo datos por teclado
		// SE DECLARAN ARRIBA AL PRINCIPIO Y SE INSTANCIAN DESPUÉS DE LEER LOS DATOS
		// Leemos los datos

		System.out.println("Diga nombre asignatura");
		nombreAsignatura = Leer.dato();
		System.out.println("Diga nombre aula");
		aula = Leer.dato();
		System.out.println("Diga la fecha");
		fecha = Leer.dato();

		c4 = new Cabecera(nombreAsignatura, aula, fecha);

		// Solo con dos parámetros

		System.out.println("Diga nombre asignatura");
		nombreAsignatura = Leer.dato();
		System.out.println("Diga nombre aula");

		c5 = new Cabecera(nombreAsignatura, aula);

		// Llamar a los métodos

		c1.imprimirCabecera();
		c1.imprimirCabeceraV2("Ángel Naranjo");
		c2.imprimirCabecera();
		c3.imprimirCabecera();

		// Uso del get

		c1.getNombreAsignatura(); // No se ve en pantalla, pero te lo puedes ahorrar
		System.out.println("Nombre: " + c1.getNombreAsignatura());

		// Uso del set

		c1.setNombreAsig("Lenguaje de marcas");

		// Mostramos para ver el cambio

		System.out.println("Nombre set: " + c1.getNombreAsignatura());
		
		*/
		
		System.out.println(c1);

	}

}
