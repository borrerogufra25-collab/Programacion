package aEjemploIntroducción;

public class Principal {

	public static void main(String[] args) {

		String mensaje = "Hola";

		FormaNormal fm = new FormaNormal();
		FormaLambda fl = new FormaLambda();

		// Imprimimos el resultado con la función de FormaNormal

		System.out.println("Forma lambda normal: " + fm.contarTamaño(mensaje));

		System.out.println();

		// Imprimimos el resultado con la función de FormaLambda

		System.out.println("Forma lambda autogenerada: " + fl.apply(mensaje));

		System.out.println();

		// Seguimos usando apply aunque en el metodo no aparezca, es la forma de pasar
		// la variable
		System.out.println("Forma lambda reducida: " + fl.contarTamaño.apply(mensaje));

		System.out.println();

		System.out.println("Forma lambda compacta en una línea: " + fl.contarTamañoCompacto.apply(mensaje));

		System.out.println();

		System.out.println("Forma lambda con :: : " + fl.contar.apply(mensaje));

	}

}
