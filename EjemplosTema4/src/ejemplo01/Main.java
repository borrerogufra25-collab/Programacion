package ejemplo01;

import utilidades.Leer;

public class Main {

	public static void main(String[] args) {

		int cantidad = 0;

		// Instancias de Hijas

		Alumno a1 = new Alumno("Juanito", "Pérez", "47382918P", 25, args, 6.87);
		System.out.println("Datos 1: " + a1);

		Profesor pro1 = new Profesor("Ángel", "Naranjo", "34578975H", 35, 3000.50);
		System.out.println("Datos 2: " + pro1);

		// Instancias de la madre

		Persona p1 = new Persona("Pepe", "Gómez", "36753456T", 29);
		System.out.println("Datos 3: " + p1);

		// Llamar a un método con objeto madre

		System.out.println("Diga años a sumar:");
		cantidad = Leer.datoInt();
		System.out.println("Ahora tienes en Persona: " + p1.sumarEdad(cantidad) + " años");

		// Llamada al mismo método con objetos de una hija

		System.out.println("Ahora tienes en Alumno: " + a1.sumarEdad(cantidad) + " años");

		// Para reescribir un método solo se cambia lo de dentro de las llaves (Mirar
		// Alumno)

		System.out.println("Ahora tienes en Alumno en otra versión que restaba: " + a1.sumarEdad(cantidad) + " años");

	}

}
