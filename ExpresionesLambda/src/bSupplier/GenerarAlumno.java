package bSupplier;

import java.util.function.Supplier;

public class GenerarAlumno {

	/*Supplier devuelve un alumno creado en base a su constructor*/
	
	Supplier<Alumno> genAlum = () -> new Alumno("Fulanito");
	
}
