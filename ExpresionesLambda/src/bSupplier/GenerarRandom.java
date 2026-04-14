package bSupplier;

import java.util.function.Supplier;

public class GenerarRandom{

	/*Supplier va a devolver un Integer, por lo que en los parentesis antes de --> no pasamos nada.  Funciona como un get()*/
	
	Supplier<Integer> numeroAleatorio = () -> (int)(Math.random() * 10);
	
}
