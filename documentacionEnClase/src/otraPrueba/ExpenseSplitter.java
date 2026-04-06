package otraPrueba;

/*
 * Esta clase trata sobre un divisor de gastos
 * 
 * @author Grupo 7
 * @version 1.0.1
 * @see IllegalArgumentException
 * 
 */

public class ExpenseSplitter {

	/*
	 * Este m�todo calcula la cuota por persona.
	 * 
	 * @param importeTotal: es la cantidad total que vamos a dividir entre las
	 * personas
	 * 
	 * @param numeroPersonas: es la cantidad de personas por la que vamos a dividir
	 * el importe total
	 * 
	 * @return devuelve un valor con decimales que ser�a lo que tiene que pagar cada
	 * persona
	 * 
	 * @throws IllegalArgumentException: si el dato no cumple la condicion esperada
	 */

	public double calcularCuotaPorPersona(double importeTotal, int numeroPersonas) {

		if (importeTotal < 0) {
			throw new IllegalArgumentException("El importe total no puede ser negativo");
		}
		if (numeroPersonas <= 0) {
			throw new IllegalArgumentException("El número de personas debe ser mayor que cero");
		}

		return importeTotal / numeroPersonas;
	}

}
