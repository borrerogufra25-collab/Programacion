package ejemploObjetos;

public class Circulo {

	private double radio; // Atributo en azul

	// Constructor con parámetros

	public Circulo(double radio) {// radio e suna variable, está en otro color
		this.radio = radio;
	}

	// Método para imprimir
	public void imprimirDatos() {
		System.out.println("El radio vale: " + radio);
		System.out.println("Y esto para probar");
	}

	// Método para calcular el área
	// Si hace falta el radio y no es atributo se pasa como parámetro, si es
	// atributo se pasa directamente

	public double calcularArea() {
		double area = 0.0, dos = 2.0;
		area = Math.PI * Math.pow(radio, dos);
		return area;

	}

	// Versión 2, mejor (No hace falta crear una variable porque return devuelve
	// SOLO el resultado)

	public double calcularAreaV2() {
		double dos = 2.0;
		return Math.PI * Math.pow(radio, dos);
	}

	// Vesión 1

	public double calcularAreaEnM2() {
		double dos = 2.0, area = 0.0;
		double den = 10000.0;
		area = Math.PI * Math.pow(radio, dos);
		return area / den;
	}

	// Ampliación Versión2

	public double calcularAreaEnM2V2() {
		double den = 10000.0;

		return calcularArea() / den;

	}

}
