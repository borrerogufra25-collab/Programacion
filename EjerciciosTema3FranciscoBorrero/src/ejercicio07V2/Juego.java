package ejercicio07V2;

import java.util.Random;

public class Juego {

	// Atributo

	private int eleccion;
	private int resultado;

	
	// Metodo

	public void Lanzar() {

		Random r = new Random(System.nanoTime());

		for (int i = 0; i < 5; i++) {
			this.resultado = r.nextInt(10);
		}

	}

	public void Mostrar() {
		System.out.println("El aleatorio es: " + resultado);
	}
}
