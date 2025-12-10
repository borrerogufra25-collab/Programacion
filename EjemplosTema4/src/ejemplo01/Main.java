package ejemplo01;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona("Pepe", "Gómez", "36753456T", 29);
		
		System.out.println("Datos: "+p1);
		
		Alumno  a1= new Alumno("Juanito", "Pérez", "47382918P", 25, args, 6.87);
		
		System.out.println("Datos 2: "+a1);
		

	}

}
