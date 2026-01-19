package ejercicio01;

/*Escribe una aplicación en la que se implementen los dos métodossiguientes que deben estar en una interface:
a) cuentaPrestados(): recibe por parámetro un array de objetos, y devuelve cuántos de ellos están
prestados.
b) publicacionesAnterioresA(): recibe por parámetro un array de Publicaciones y un año, y devuelve
cuántas publicaciones tienen fecha anterior al año recibido por parámetro.
c) En el método main(), crear un array de Publicaciones, con 2 libros y 2 revistas, prestar uno de los
libros, mostrar por pantalla los datos almacenados en el array y mostrar por pantalla cuántas hay
prestadas y cuantas hay anteriores a un año dado por teclado por el usuario.*/

public class Principal {

	public static void main(String[] args) {

		Publicacion l1 = new Libro("El pepe", 1997, true, "Fantasía");
		Publicacion l2 = new Libro("Título chulo", 2014, false, "Aventura");
		Publicacion r1 = new Revista("El corazón", 1999, true, "Mierda");
		Publicacion r2 = new Revista("Marca", 1990, false, "Deporte");

		Publicacion[] lista = { l1, l2, r1, r2 };

		Publicacion p = new Publicacion();

		System.out.println("El total de prestados es: " + lista[0].contarPrestados(lista));
		System.out.println("El total de prestados es: " + lista[1].contarPrestados(lista));
		System.out.println(p.contarPrestados(lista));
		System.out.println(p.contarAnteriores(lista, 1993));

	}

}
