package ejercicio07;

import java.util.Random;


//2 pt lanzar
//4 pt comprobar
//2 pt mostrar
//1 pt llamar
//1 pt 

//5

public class Moneda {

	Random num = new Random(System.nanoTime());

	// Atributos

	private int cara;
	private int cruz;
	private int aleatorio;

	

	public int Lanzar() {

		for (int i = 0; i < 5; i++) {
			aleatorio = num.nextInt(2);
		}
		return aleatorio;
	}

	public void Resultado() {

		if (aleatorio == 0) {

			System.out.println("El resultado es: CARA");

		} else {

			System.out.println("El resultado es: CRUZ");

		}

	}
}
