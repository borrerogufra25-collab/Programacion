package ejercicio01;

public class Principal {

	public static void main(String[] args) {

		Libro l1 = new Libro("El pepe", 1997, true, "Fantasía");
		Libro l2 = new Libro("Título chulo", 2014, false, "Aventura");
		Revista r1 = new Revista("El corazón", 1999, true, "Mierda");
		Revista r2 = new Revista("Marca", 1990, false, "Deporte");

		Publicacion[] lista = { l1, l2, r1, r2 };

		Publicacion p = new Publicacion();

		System.out.println("El total de prestados es: " + lista[0].contarPrestados(lista));
		System.out.println("El total de prestados es: " + lista[1].contarPrestados(lista));
		System.out.println(p.contarPrestados(lista));
		System.out.println(p.contarAnteriores(lista, 1993));

	}

}
