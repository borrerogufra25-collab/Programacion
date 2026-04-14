package ejercicioCompleto;

import java.util.ArrayList;
import java.util.List;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Se pide realizar una aplicación para gestionar una lista de mensajes distintos. 
		 * Estos mensajes se caracterizan por el cuerpo del mensaje y 
		 * una propiedad para detectar si son o no de error.
		 * 
		 * Crear la clase mensaje y otra clase donde haremos las operaciones sobre ellos, pasando por parametro lo necesario.
		 * 
		 * Debe ser posible crear un mensaje, borrarlo, mostrarlo en mayusculas y 
		 * concatenar el usuario que esta usando la app con el propio mensaje.
		 * 
		 * Comprobar todos los mensajes en el main con un menu.
		 */

		int op;
		String cuerpo, usuario = "Alumno";
		boolean esError;
		
		List<Mensaje> listaMensajes = new ArrayList<>();
		
		GestorMensaje gm = new GestorMensaje(listaMensajes);
		
		//Introduzco mensaje genérico
		listaMensajes.add(gm.genMensajeBase.get());
		
		do {
			
			System.out.println("\nSeleccione una opción:\n");
			System.out.println("1 - Crear un mensaje.");
			System.out.println("2 - Borrar un mensaje.");//Esta preparado para borrar el primero en la lista
			System.out.println("3 - Mensaje de bienvenida al usuario.");
			System.out.println("4 - Mensaje de error genérico.");
			System.out.println("5 - Ver todos los mensajes");
			System.out.println("0 - Cerrar programa.");
			
			op = Leer.datoInt();
			
			System.out.println();
			
			switch (op) {
			
				case 1:
					
					System.out.println("Di el cuerpo del mensaje: ");
					cuerpo = Leer.dato();
					
					System.out.println("Di si es un error (0/1): ");
					if (Leer.datoInt() == 0) {
						
						esError = false;
						
					} else {
						
						esError= true;
						
					}
					
					if (gm.crearMensaje.apply(cuerpo, esError)) {
					
						System.out.println("Mensaje añadido");
					
					}
					
				break;
			
				case 2:
					
					if (listaMensajes.size() != 0) {
						
						gm.borraMensaje.accept(listaMensajes.get(0));
					
						System.out.println("Mensaje borrado");
						
					} else {
						
						System.out.println("No quedan mensajes");
						
					}
					
				break;
				
				case 3:
					
					gm.mensajeBienvenida.apply(usuario); //Este no mprime ya que la funcion solo devuelve el texto
					
					System.out.println(gm.mensajeBienvenida.apply(usuario));
					
				break;
				
				case 4:
					
					gm.mensajeEnMayus.accept(gm.mensajeError.get());
					
				break;
				
				case 5:
					
					gm.mostrarMensajes.accept(listaMensajes);
					
				break;
			}
			
			
			
		} while (op != 0);
		
		System.out.println("\n\n---- Fin del programa ----");
		
	}

}
