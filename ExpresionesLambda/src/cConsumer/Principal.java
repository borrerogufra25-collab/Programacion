package cConsumer;

public class Principal {

	public static void main(String[] args) {
		
		String mensaje = "Papel para imprimir";
		
		Impresora imp = new Impresora(mensaje);
		
		
		imp.imprimir.accept(mensaje);
		
		
		mensaje = "Segundo papel";
		
		System.out.println();
		imp.cambiarEimprimir.accept(mensaje);
		
		
	}

}
