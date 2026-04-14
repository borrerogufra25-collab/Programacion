package aEjemploIntroducción;

import java.util.function.Function;

//Esta clase comprueba el tamaño de un String y lo devuelve

/*
  Function es del tipo <T,R>, donde T es el tipo introducido y R el tipo del resultado. Lo comprobamos poniendo el raton encima de Function.
  En este caso pasamos un String para devolver un Integer
  
  Estamos obligados a usar apply(String nombreVar) ya que viene de base con la función.
  
*/

public class FormaLambda implements Function<String,Integer> {

	//Esta es la función autogenerada por usar implements
	
	@Override
	public Integer apply(String s) {
		
		return s.length();
	}

	
	
	
	//Esta es una versión acortada de la versión anterior

	Function<String,Integer> contarTamaño = (String s) -> {
	    return s.length();
	};
	
	
	
	
	
	Function<String,Integer> contarTamañoCompacto =  s -> s.length();
	
	
	
	
	
	
	Function<String, Integer> contar = String::length;
}
