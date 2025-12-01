package examenTipoA;

public class Profesor {

	private String nombreApellido;
	private int id;
	private int antiguedad;
	private int horasTrabajadas;

	public Profesor(String nombreApellido, int id, int antiguedad, int horasTrabajadas) {
		super();
		this.nombreApellido = nombreApellido;
		this.id = id;
		this.antiguedad = antiguedad;
		this.horasTrabajadas = horasTrabajadas;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public String toString() {
		return "Profesor [nombreApellido=" + nombreApellido + ", id=" + id + ", antiguedad=" + antiguedad
				+ ", horasTrabajadas=" + horasTrabajadas + "]";
	}

	public double calcularSueldo(double sueldoBase, double impuestosPorce) {
		double cien = 100;
		return (horasTrabajadas * sueldoBase) - (impuestosPorce / cien);
	}

}
