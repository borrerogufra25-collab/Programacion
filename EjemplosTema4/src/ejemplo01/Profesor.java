package ejemplo01;

public class Profesor extends Persona {

	private double salario;

	public Profesor(String nombre, String apellidos, String dni, int edad, double salario) {
		super(nombre, apellidos, dni, edad);
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + "Profesor [salario=" + salario + "]";
	}

}
