package ejercicio05;

import java.util.*;

public class Gestor {

	private Set<Integer> numerosGenerados = new HashSet<>();
	private Map<Integer, String> objetosConId = new HashMap<>();
	private double saldo = 50.0;

	// 1. Excepción si el número aleatorio ya fue generado antes

	public int generarNumeroUnico() throws NumeroRepetidoException {

		Random r = new Random();
		int num = r.nextInt(10);

		if (numerosGenerados.contains(num)) {
			throw new NumeroRepetidoException("El número " + num + " ya fue generado antes.");
		}

		numerosGenerados.add(num);
		return num;
	}

	// 2. Excepción si el ID ya está asignado

	public void asignarId(int id, String nombreObjeto) throws IdDuplicadoException {

		if (objetosConId.containsKey(id)) {
			throw new IdDuplicadoException("El ID " + id + " ya está asignado a " + objetosConId.get(id));
		}
		objetosConId.put(id, nombreObjeto);
	}

	// 3. Excepción si el número es impar

	public void comprobarPar(int numero) throws NumeroImparException {

		if (numero % 2 != 0) {
			throw new NumeroImparException("El número " + numero + " es impar.");
		}
	}

	// 4. Excepción si no hay saldo suficiente

	public void hacerBizum(double cantidad) throws SaldoInsuficienteException {

		if (cantidad > saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente. Tienes " + saldo + "€.");
		}
		saldo -= cantidad;
	}

	// 5. Excepción si la cadena está vacía

	public void validarCadena(String texto) throws CadenaVaciaException {

		if (texto == null || texto.isBlank()) {
			throw new CadenaVaciaException("La cadena está vacía o es nula.");
		}
	}

	// 6. Excepción si la edad no es válida

	public void validarEdad(int edad) throws EdadNoValidaException {

		if (edad < 0 || edad > 120) {
			throw new EdadNoValidaException("La edad " + edad + " no es válida.");
		}
	}
}
