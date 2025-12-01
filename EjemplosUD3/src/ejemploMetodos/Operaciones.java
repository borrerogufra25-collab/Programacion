package ejemploMetodos;

public class Operaciones {

	public int sumarDosEnteros(int num1, int num2) {

		int resultado;

		resultado = num1 + num2;

		return resultado;

	}

	public int restarDosEnteros(int num1, int num2) {

		int resultado;

		resultado = num1 - num2;

		return resultado;

	}

	public int multiplicarDosEnteros(int num1, int num2) {

		int resultado;

		resultado = num1 * num2;

		return resultado;
	}

	public int dividirDosEnteros(int num1, int num2) {

		if (num2 != 0) {
			return num1 / num2;

		} else {
			return 0;
		}

	}

}
