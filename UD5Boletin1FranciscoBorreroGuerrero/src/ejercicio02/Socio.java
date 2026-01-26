package ejercicio02;

public class Socio {

	private String nombre, apellido1, apellido2, DNI;
	private int ID, edad;
	private double cuota;
	private boolean activo;
	private int antiwedad;

	public Socio(String nombre, String apellido1, String apellido2, String dNI, int iD, int edad, double cuota,
			boolean activo, int antiwedad) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		DNI = dNI;
		ID = iD;
		this.edad = edad;
		this.cuota = cuota;
		this.activo = activo;
		this.antiwedad = antiwedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public int getAntiwedad() {
		return antiwedad;
	}

	public void setAntiwedad(int antiwedad) {
		this.antiwedad = antiwedad;
	}

	@Override
	public String toString() {
		return "\nSocio [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", DNI=" + DNI
				+ ", ID=" + ID + ", edad=" + edad + ", cuota=" + cuota + ", activo=" + activo + ", antiwedad="
				+ antiwedad + "]";
	}

	public double calcularCuotaFinal(double cantidad) {

		return cuota - cantidad * antiwedad;
	}

}
