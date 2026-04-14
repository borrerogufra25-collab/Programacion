package eBifunction;

import java.util.function.BiFunction;

public class Demo {

	//Concatena dos strings
    BiFunction<String, String, String> concatenar = (a, b) -> a + " " + b;

    //Suma dos int
    BiFunction<Integer, Integer, Integer> sumar = (x, y) -> x + y;

    //Dice la longitud de un texto
    BiFunction<String, Integer, String> textoMasNumero = (texto, numero) -> "'" + texto + "'" + " tiene " + numero + " caracteres.";
	
	
}
