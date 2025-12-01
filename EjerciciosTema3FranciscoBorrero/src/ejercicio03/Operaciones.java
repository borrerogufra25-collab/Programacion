package ejercicio03;

public class Operaciones {

	public void esPositivoONegativo(double numero) {
		if (numero > 0) {
			System.out.println(numero + " es positivo.");
		} else if (numero < 0) {
			System.out.println(numero + " es negativo.");
		} else {
			System.out.println("El número es cero (neutro).");
		}

	}

	public void esParOImpar(double numero) {
		if (numero % 2 == 0) {
			System.out.println(numero + " es par.");
		} else {
			System.out.println(numero + " es impar.");
		}
	}

}
