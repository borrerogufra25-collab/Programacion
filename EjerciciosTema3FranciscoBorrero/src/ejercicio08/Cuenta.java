package ejercicio08;

public class Cuenta {

	// Atributos

	private double saldo;
	private String titular;

	// Constructor se llama siempre que la clase. Por normal general se crean uno
	// completo y otro vacio.

	// Constructor vacio. Se usa para llamar recomendable hacerlo. Es el que no
	// tiene nada entre los paréntesis

	public Cuenta() {

	}

	// Constructor construye objetos (meterle datos PRO PRIMERA VEZ) SIEMPRE hay que
	// hacerlo

	public Cuenta(double saldo, String titular) {

		this.saldo = saldo;
		this.titular = titular;

	}

	// Métodos

	// Void solo sirve cuando no pones return (que no devuelve nada)

	public void ingresar(double ingreso) {

		saldo += ingreso;

	}

}
