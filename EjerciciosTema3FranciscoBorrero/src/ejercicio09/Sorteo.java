package ejercicio09;

import java.util.Random;

public class Sorteo {

	private int numeroComprado;
	private int numeroGanador;

	public Sorteo() {

	}

	public Sorteo(int numeroComprado, int numeroGanador) {

		this.numeroComprado = numeroComprado;
		this.numeroGanador = numeroGanador;
	}

	public int comprarAleatorio() {
		Random r = new Random(System.nanoTime());
		numeroComprado = r.nextInt(99999) + 1;
		return numeroComprado;
	}

	public void generarComprado(int numero) {
		if (numero >= 1 && numero <= 99999) {
			numeroComprado = numero;
			System.out.println("Su número es: " + String.format("%05d", numeroComprado));
		} else {
			System.out.println("Número incorrecto. Debe ser un número de 5 cifras.");
		}
	}

	public void comprobarPremio() {
		if (numeroGanador == 0) {
			System.out.println("Primero debe realizar el sorteo.");
		} else if (numeroComprado == 0) {
			System.out.println("Primero debe comprar un décimo.");
		} else if (numeroComprado == numeroGanador) {
			System.out.println("¡Felicidades! Su número ha sido premiado.");
		} else {
			System.out.println("Lo sentimos, su número no ha sido premiado.");
		}
	}

	public void mostrarNumeroComprado() {
		System.out.println("Su número es: " + String.format("%05d", numeroComprado));

	}

	public void realizarSorteo() {
		Random r = new Random(System.nanoTime());
		numeroGanador = r.nextInt(99999) + 1;
		mostrarNumeroGanador();
	}

	public void mostrarNumeroGanador() {
		System.out.println("El décimo ganador es: " + String.format("%05d", numeroGanador));
	}

	public void setNumero(int numeroComprado) {
		this.numeroComprado = numeroComprado;
	}
	
}
