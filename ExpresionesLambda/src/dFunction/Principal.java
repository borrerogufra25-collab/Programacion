package dFunction;

public class Principal {

	public static void main(String[] args) {
		
		Texto txt = new Texto();
		
		String mensaje = "Saludos  ";
		
		
		System.out.println("Devolución función identidad: " + txt.identidad.apply(mensaje));
		System.out.println();
		

		System.out.println("Conteo de caracteres: " + txt.contar.apply(mensaje));
		System.out.println();
		
		
		System.out.println("Mensaje en mayus: " + txt.identMayus.apply(mensaje));
		System.out.println();
		
		
		System.out.println("Conteo tras quitar espacios del final: " + txt.quitaYCuenta.apply(mensaje));
		System.out.println();
		
	}

}
