package correccion;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		String nombre;
		int tam = 100, id, edad, horasEstudio, contador = 0;
		double cantidad, porcentaje, presupuesto = 150;
		Hijo h1, h2;
		Hijo h;
		Hijo[] listaHijos;

		// v1. Creacion de objetos a cascaporra

		h1 = new Hijo("Pepe", 1, 23, 6);
		h2 = new Hijo("Juan", 2, 16, 5);

		// Crear un array primero se crea y se da tamaño. Se puede preguntar por teclado
		// si se quiere o a cascaporra

		listaHijos = new Hijo[tam];

		// Formas de rellenar la lista

		// 1. Mala
		listaHijos[0] = h1;

		// 2. Solo de prueba. Mal también
		// Cuando es introducir de esta forma hay que poner el tipo de variable asi:
		Hijo[] listaPrueba = { h1, h2 };
		System.out.println(listaPrueba[0]);
		System.out.println(listaPrueba[1]);

		// Crear un objeto del tipo GestionFamiliar
		GestionFamiliar gf1 = new GestionFamiliar(listaPrueba, presupuesto);
		GestionFamiliar gf = new GestionFamiliar(listaHijos, presupuesto);

		// 3. Con agregar

		gf1.agregarHijo(h1, contador);
		contador++;

		System.out.println("Diga el nombre:");
		nombre = Leer.dato();
		System.out.println("Diga el ID:");
		id = Leer.datoInt();
		System.out.println("Diga la edad:");
		edad = Leer.datoInt();
		System.out.println("Diga las horas estudiadas:");
		horasEstudio = Leer.datoInt();

		h = new Hijo(nombre, id, edad, horasEstudio);
		gf.agregarHijo(h, contador);
		// Otra forma sería esta: gf.agregarHijo(new Hijo(nombre, id, edad,
		// horasEstudio), contador);
		contador++;
		System.out.println(h);

		// Case 2 buscar por id
		System.out.println("Diga el id a buscar");
		id = Leer.datoInt();

		System.out.println(gf.findByIdV2(id));
		System.out.println(gf.findById(id));

	}

}
