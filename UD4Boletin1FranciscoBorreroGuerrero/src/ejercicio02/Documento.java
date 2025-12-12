package ejercicio02;

public class Documento {

	private String nombreEmpresa;
	private String letraRepresentativa;

	public Documento(String nombreEmpresa, String letraRepresentativa) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.letraRepresentativa = letraRepresentativa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getLetraRepresentativa() {
		return letraRepresentativa;
	}

	public void setLetraRepresentativa(String letraRepresentativa) {
		this.letraRepresentativa = letraRepresentativa;
	}

	@Override
	public String toString() {
		return "Documento [nombreEmpresa=" + nombreEmpresa + ", letraRepresentativa=" + letraRepresentativa + "]";
	}

	public void imprimirEncabezado() {

		System.out.println("Nombre de la empresa: " + nombreEmpresa + " y el tipo de letra es: " + letraRepresentativa);

	}

}