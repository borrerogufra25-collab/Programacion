package ejemploPolimorfismo;

public class Main {

	public static void main(String[] args) {

		// Prueba con objetos "sueltos"

		// Figura f1=new Figura (); No se puede crear porque Figura es abstracta

		Cuadrado cu1 = new Cuadrado("Primer cuadrado", "Rojo", 1.0);
		Circulo ci1 = new Circulo("Primer C�rculo", "Azul", 1.0);

		// Se pueden crear hijas de una madre abstracta

		System.out.println(cu1);
		System.out.println(ci1);
		System.out.println("*********�rea y per�metro**********");
		System.out.println("�rea del primer cuadrado: " + cu1.calcularArea());
		System.out.printf("Per�metro del primer c�rculo: %.2f", ci1.calcularArea());

		// Prueba con polimorfismo

		// Es de tipo figura pero se COMPORTA como un cuadrado/circulo
		// (Usando los m�todos s�lo de la madre)

		System.out.println("\n\n\n***********************************************");
		Figura f1 = new Cuadrado("Segundo cuadrado", "verde", 2.0);
		Figura f2 = new Circulo("Segundo c�rculo", "Amarillo", 2.0);

		System.out.println(f1);
		System.out.println(f2);
		System.out.println("*********�reas**********");
		System.out.println("Usan el m�todo de cada clase concreta porque est� sobrescrito");
		System.out.println("�rea del segundo cuadrado: " + f1.calcularArea());
		System.out.printf("Per�metro del segundo c�rculo: %.2f", f2.calcularArea());

		System.out.println(
				"\nPero ahora no pueden usar los m�todos que solo est�n en cuadrado y c�rculo porque son figuras\n\n");

		// System.out.println(f1.mostrarLados ()); Error de compilaci�n
		// System.out.println(f2.contarRadianes ()); Error de compilaci�n

		System.out.println("*******************************************************");
		System.out.println("*******Vamos ahora con el array de objetos**********\n\n");

		// Pruebas con arrays de objetos

		Figura lista[] = new Figura[4];

		// Cargamos el array con objetos cuadrado y c�rculo indistintamente
		// No podemos hacerlo con figuras porque la clase Figura es abstracta, si no lo
		// fuera s� se podr�a hacer
		// Se mete a cascaporra pero se deber�a pedir los datos

		lista[0] = new Cuadrado("Un m�sero cuadrado", "negro", 2.0);
		lista[1] = new Circulo("Un m�sero c�rculo", "blanco", 2.0);
		lista[2] = new Circulo("Un c�rculo gris�ceo", "gris", 2.0);
		lista[3] = new Cuadrado("Un cuadrado desnudo", "transparente", 2.0);

		// Una prueba simple de lo que hay en el array es llamar al toString.
		// Dependiendo de //lo que haya guardado en el
		// array se llamar� a uno u otro toString

		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);

		}

		// Llamamos a los m�todos de la clase OperacionesFiguras para calcular las �reas
		// individualmente y la suma de todas las �reas
		// Creamos un objeto de la clase, aunque deber�a estar creado arriba, se pone
		// aqu� para no liar

		OperacionesFiguras of = new OperacionesFiguras();

		for (int i = 0; i < lista.length; i++) {

			System.out.printf("El �rea del " + (i + 1) + " es: %.2f \n", of.calcularElAreaDeUnaFigura(lista[i]));
		}

		System.out.printf("La suma de todas las �reas es: %.2f", of.sumarAreas(lista));

		System.out.printf("El per�metro de ", lista[3], " es: %.2f \n", of.calcularElPerimetroDeUnaFigura(lista[3]));

		// Prueba con array de objetos

		Figura lista[] = new Figura[4];

		// Cargamos el array con objetos cuadrado y círculo indistintamente
		// No podemos hacerlo con figuras porque la clase Figura es abstracta, si no lo
		// fuera sí se podría hacer

		lista[0] = new Cuadrado("Un mísero cuadrado", "negro", 2.0);
		lista[1] = new Circulo("Un mísero círculo", "blanco", 2.0);
		lista[2] = new Circulo("Un círculo grisáceo", "gris", 2.0);
		lista[3] = new Cuadrado("Un cuadrado desnudo", "transparente", 2.0);

		// Una prueba simple de lo que hay en el array es llamar al toString.
		// Dependiendo de lo que haya guardado en el
		// array se llamará a uno u otro toString

		for (int i = 0; i < lista.length; i++) {

			System.out.println(lista[i]);

			// Llamamos a los métodos de la clase OperacionesFiguras para calcular las áreas
			// individualmente y la suma de todas las áreas
			// Creamos un objeto de la clase, aunque debería estar creado arriba, se pone
			// aquí para no liar

			OperacionesFiguras of = new OperacionesFiguras();
			for (int i = 0; i < lista.length; i++) {
				System.out.printf("El área del " + (i + 1) + " es: %.2f \n", of.calcularElAreaDeUnaFigura(lista[i]));
			}
			System.out.printf("La suma de todas las áreas es: %.2f", of.sumarAreas(lista));

			// Dejo para vosotros el probar con el método calcularPerímetro
		}
		
		OperacionesFigura op = new OperacionesFiguras();
		
	}

}
