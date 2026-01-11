package ejercicio02;

public class Carta extends Documento {

	private String fecha;
	private String otraCosa;

	public Carta(String nombreEmpresa, String letraRepresentativa, String fecha, String otraCosa) {
		super(nombreEmpresa, letraRepresentativa);
		this.fecha = fecha;
		this.otraCosa = otraCosa;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getOtraCosa() {
		return otraCosa;
	}

	public void setOtraCosa(String otraCosa) {
		this.otraCosa = otraCosa;
	}

	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + ", otraCosa=" + otraCosa + "]";
	}

	public void imprimirEncabezado() {

		super.imprimirEncabezado();
		System.out.println("La fecha es: " + fecha + "\nLa otra cosa es algo: " + otraCosa);

	}

}