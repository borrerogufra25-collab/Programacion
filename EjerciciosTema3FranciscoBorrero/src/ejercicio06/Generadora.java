package ejercicio06;

import java.util.Random;

public class Generadora {

	public int generarAleatorio(int desde, int hasta) {
		Random rnd = new Random(System.nanoTime());
		return rnd.nextInt(hasta - desde + 1) + desde;
	}

	public void generarQuiniera(int r1) {
		if (r1 == 0) {
			System.out.println("El resultado es 1, gana el local");

		} else if (r1 == 1) {
			System.out.println("El resultado es X, hay empate");

		} else {
			System.out.println("El resultado es 2");
		}

	}

	public void mostrarPar(int r1, int numero) {
		if (r1 % 2 == 0 && numero == 1) {
			System.out.println("Felicidades ha salido " + r1);
		} else if (r1 % 2 != 0 && numero == 1) {
			System.out.println("Has perdio, el número es " + r1);
		}if (numero) {
			
		} else {

		}

	}
	
	public int generarChino() {
		
	}

}
