package trabajoJavadoc;

/**
 * Clase que representa una calculadora con operaciones básicas y avanzadas.
 * 
 * Ejemplo de uso: Calculadora cacl = new Calculadora(); int resultado =
 * calc.sumar(3, 2);
 * 
 * @author Fran
 * @version 1.0
 * @since 1.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/"> Documentación
 *      oficial de Java</a>
 * 
 */

public class Calculadora {

	/**
	 * Suma dos números enteros
	 * 
	 * @param a Primer operando
	 * @param b Segundo operando
	 * @return Resultado de la suma
	 */

	public int sumar(int a, int b) {
		return a + b;
	}

	/**
	 * 
	 * Divide dos números enteros
	 * 
	 * @param dividendo Número a dividir
	 * @param divisor   Número que divide
	 * @return Cociente de la división
	 * @throws ArithmeticException si el divisor es cero
	 */

	public int dividir(int dividendo, int divisor) {
		if (divisor == 0) {
			throw new ArithmeticException("No se puede dividir entre cero");
		}
		return dividendo / divisor;
	}
}
