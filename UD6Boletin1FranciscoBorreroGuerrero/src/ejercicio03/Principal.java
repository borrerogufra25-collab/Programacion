/* Escribe una clase denominada CEcuacion2Grado. Introduce los coeficientes
 * de la ecuación: a, b y c. Diseña un bloque try que trate las siguientes
 * excepciones definidas por el programador:
 * a) Si a y b son iguales a 0 aparece un mensaje indicando que la ecuación es degenerada.
 * b) Si el discriminante es menor que 0 aparece un mensaje indicando que las raíces son complejas.
 * Recuerda que el discriminante es b al cuadrado menos 4*a*c.
 * Si a == 0 y b!= 0 la ecuación tiene una única raíz igual a – c/b 
 * Utiliza los métodos sqrt y abs (valor absoluto) de la clase final Math.
 */

package ejercicio03;

public class Principal {

	public static void main(String[] args) {

		double[] soluciones;
		CEcuacion2Grado eq = new CEcuacion2Grado(1, -3, 2);

		try {
			soluciones = eq.resolver();

			if (soluciones.length == 1) {
				System.out.println("Ecuación lineal. Única raíz: x = " + soluciones[0]);
			} else {
				System.out.println("Raíz x1 = " + soluciones[0]);
				System.out.println("Raíz x2 = " + soluciones[1]);
			}

		} catch (EcuacionDegeneradaException | RaicesComplejasException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
