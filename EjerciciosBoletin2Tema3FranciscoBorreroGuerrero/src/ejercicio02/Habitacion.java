package ejercicio02;

public class Habitacion {

	private int numero;
	private int tipo;
	private double precioBase;
	private String clienteAsig;
	private boolean limpia;
	private boolean ocupada;

	public Habitacion(int numero, int tipo, double precioBase, String clienteAsig, boolean limpia, boolean ocupada) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.precioBase = precioBase;
		this.clienteAsig = clienteAsig;
		this.limpia = limpia;
		this.ocupada = ocupada;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getClienteAsig() {
		return clienteAsig;
	}

	public void setClienteAsig(String clienteAsig) {
		this.clienteAsig = clienteAsig;
	}

	public boolean isLimpia() {
		return limpia;
	}

	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	@Override
	public String toString() {
		return "Habitacion [numero=" + numero + ", tipo=" + tipo + ", precioBase=" + precioBase + ", clienteAsig="
				+ clienteAsig + ", limpia=" + limpia + ", ocupada=" + ocupada + "]";
	}

}
