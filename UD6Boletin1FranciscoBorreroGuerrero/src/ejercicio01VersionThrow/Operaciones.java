package ejercicio01VersionThrow;

public class Operaciones {

	public int dividir(int num, int den) {

		if (den == 0) {
			throw new ArithmeticException("Denominador igual a cero");
		}
		return num / den;
	}

}
