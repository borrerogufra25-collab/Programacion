package ejercicio02;

public class TarjetaDeVisita extends Documento {

	private String numeroTelefono;
	private String correo;
	private String direccion;

	public TarjetaDeVisita(String nombreEmpresa, String letraRepresentativa, String numeroTelefono, String correo,
			String direccion) {
		super(nombreEmpresa, letraRepresentativa);
		this.numeroTelefono = numeroTelefono;
		this.correo = correo;
		this.direccion = direccion;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "TarjetaDeVisita [numeroTelefono=" + numeroTelefono + ", correo=" + correo + ", direccion=" + direccion
				+ "]";
	}

	public void imprimirEncabezado() {

		super.imprimirEncabezado();
		System.out.println("Número: " + numeroTelefono + "\nCorreo: " + correo + "\nDirección: " + direccion);
	}

}