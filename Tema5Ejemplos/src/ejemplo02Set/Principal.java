package ejemplo02Set;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {

		// SET

		Set<String> conjunto1 = new HashSet<String>();
		Set<Integer> conjunto2 = new HashSet<Integer>();

		conjunto1.add("Luismi");
		conjunto1.add("Rafa");
		conjunto1.add("luismi");
		conjunto1.add("Rafa");

		System.out.println(conjunto1);

		// Guardamos objetos

		Set<Alumno> listado = new HashSet<Alumno>();
		Alumno a1 = new Alumno("Rafa", "1111111S", 6.7);

		listado.add(a1); // Se puede instanciar fuera y luego pasarlo
		listado.add(new Alumno("Ángel", "123456789A", 7.6)); // O instanciarlo directamente
		listado.add(new Alumno("Luismi", "122345678S", 3.7));
		listado.add(new Alumno("Ángel", "123456789A", 7.6)); // Son distintos objetos

		System.out.println(listado);

	}

}
