package ejercicioCompleto;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class GestorMensaje {

	private List<Mensaje> listaMensajes = new ArrayList<>();

	
	public GestorMensaje(List<Mensaje> listaMensajes) {
		
		this.listaMensajes = listaMensajes;
		
	}
	
	
	@Override
	public String toString() {
		return "GestorMensaje [listaMensajes=" + listaMensajes + ", genMensajeBase=" + genMensajeBase
				+ ", mostrarMensajes=" + mostrarMensajes + "]";
	}



	/**********************/
	
	//No recibe nada y devuelve un mensaje
	Supplier<Mensaje> genMensajeBase = () -> new Mensaje("Mensaje de prueba", false);
	
	//Recibe una lista de mensajes y no devuelve nada
	Consumer<List<Mensaje>> mostrarMensajes = (listaMensajes) -> System.out.println(listaMensajes);
    
    //Recibe los parametros y crea el mensaje, sirve porque un mensaje tiene justo 2 atributos
    BiFunction<String, Boolean, Boolean> crearMensaje = (texto, esError) -> listaMensajes.add(new Mensaje(texto, esError));
    
    //Recibe un mensaje y lo borra
    Consumer<Mensaje> borraMensaje = (Mensaje m) -> listaMensajes.remove(m);
    
    //Recibe el nombre del usuario y le devuelve un mensaje de bienvenida
    Function<String, String> mensajeBienvenida = usuario -> "Bienvenido a la app " + usuario ;
    
    //Mensaje de error base
    Supplier<String> mensajeError = () -> "¡error - no funciona nada!" ;
    
    //Recibe un String y lo saca en mayusculas
    Consumer<String> mensajeEnMayus = texto -> System.out.println(texto.toUpperCase());
;
}
