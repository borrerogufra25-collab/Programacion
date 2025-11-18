package ejercicio10;

public class Maquina {

	private Ticket t;
	private double saldo;
	private int contrasenia;
	private int numMaquina;
	private double precioBase;

	// Constructor
	public Maquina(int numMaquina, int contrasenia, double precioBase) {
		this.numMaquina = numMaquina;
		this.contrasenia = contrasenia;
		this.precioBase = precioBase;
		this.saldo = 0;
	}

	// Comprar billete(s)

	public Ticket comprarBillete(int numBilletes, int saltos, double dineroEntregado) {
		t = new Ticket(precioBase, numBilletes, saltos);
		double precio = t.calcularPrecio();

		// Mostrar primero el precio
		System.out.println("El precio del billete es: " + precio + " €");

		// Comprobar si el dinero entregado es suficiente
		if (dineroEntregado < precio) {
			System.out.println("Dinero insuficiente. Faltan " + (precio - dineroEntregado) + " €");
			return null;
		}

		// Actualizar saldo de la máquina
		saldo += precio;

		// Calcular y mostrar el cambio
		double cambio = dineroEntregado - precio;
		System.out.println("Cambio a devolver: " + cambio + " €");

		return t;
	}

	// Métodos de operario

	public boolean comprobarContrasenia(int contrasenia) {
		return this.contrasenia == contrasenia;
	}

	public double getSaldoTotal() {
		return saldo;
	}

	public void cambiarPrecio(double nuevoPrecio) {
		this.precioBase = nuevoPrecio;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public int getNumMaquina() {
		return numMaquina;
	}
}
