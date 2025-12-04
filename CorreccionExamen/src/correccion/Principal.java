package correccion;

public class Principal {

	public static void main(String[] args) {

		String nombre;
		int tam = 100, id, edad, horasEstudio;
		double cantidad, porcentaje, presupuesto = 150;

		// v1. Creacion de objetos a cascaporra

		Hijo h1 = new Hijo("Pepe", 1, 23, 6);
		Hijo h2 = new Hijo("Juan", 2, 16, 5);

		// Crear un array primero se crea y se da tamaño. Se puede preguntar por teclado
		// si se quiere o a cascaporra

		Hijo[] listaHijos = new Hijo[tam];

		// Formas de rellenar la lista

		// 1. Mala
		listaHijos[0] = h1;

		// 2. Solo de prueba. Mal también
		Hijo[] listaPrueba = { h1, h2 };
		System.out.println(listaPrueba[0]);
		System.out.println(listaPrueba[1]);

		// 3. Crear un objeto del tipo GestionFamiliar
		GestionFamiliar gf1 = new GestionFamiliar(listaPrueba, presupuesto, 2);
	}

}
