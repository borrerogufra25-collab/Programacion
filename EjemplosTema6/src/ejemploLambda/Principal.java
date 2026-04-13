package ejemploLambda;

import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		@FunctionalInterface
		interface Calculadora {
			int sumar(int a, int b);
		}

		Calculadora sumarV1 = (a, b) -> {
			return (a + b);
		};

		// Versión más simple
		Calculadora sumarV2 = (a, b) -> a + b;

		System.out.println(sumarV1.sumar(2, 3));
		System.out.println(sumarV2.sumar(2, 3));

	}

}
