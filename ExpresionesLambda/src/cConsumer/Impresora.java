package cConsumer;

import java.util.function.Consumer;

public class Impresora {

	private String hoja;
	
	public Impresora(String hoja) {
		super();
		this.hoja = hoja;
	}
	
	public String getHoja() {
		return hoja;
	}

	public void setHoja(String hoja) {
		this.hoja = hoja;
	}

	//Consumer recibe un tipo y hace algo con el, pero no devuelve nada
	
	Consumer<String> cambiarHoja = (String s) -> /*hoja = s*/{
		
		hoja = s;
		
	};
	
	Consumer<String> imprimir = (String s) -> System.out.println(s);;
	
	
	//Este consumer utiliza andThen, que sirve para concatenar dos consumer en uno solo
	
	Consumer<String> cambiarEimprimir = cambiarHoja.andThen(imprimir);
	
}
