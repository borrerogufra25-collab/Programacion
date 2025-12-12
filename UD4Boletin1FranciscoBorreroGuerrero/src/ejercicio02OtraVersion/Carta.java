package ejercicio02OtraVersion;

public class Carta extends Documento {

	private String fecha;

	public Carta(String fecha) {
		super();
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + "]";
	}

	public void imprimir(Empresa e) {

		super.imprimir(e);
		System.out.println("Fecha: " + fecha);
	}

}