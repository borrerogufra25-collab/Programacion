package dFunction;

import java.util.function.Function;

public class Texto {

	//Reciben un tipo devuelve otro
	Function<String, String> mayus = s -> s.toUpperCase();
	Function<String, Integer> contar = s -> s.length();
	Function<String, String> quitarEspacios = s -> s.trim();
	
    //Devuelve lo mismo que recibe
    Function<String, String> identidad = Function.identity();

    //Concatena quitarEspacios y contar
    Function<String, Integer> quitaYCuenta = quitarEspacios.andThen(contar);

    //Compose hace que antes de aplicar mayus se aplique identidad, es decir, se aplica mayus sobre lo que devuelve identidad
    Function<String, String> identMayus = mayus.compose(identidad);
	
}
