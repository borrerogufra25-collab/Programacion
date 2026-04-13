package ejercicio03;

public class CEcuacion2Grado {

	private double a, b, c;

	public CEcuacion2Grado(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double[] resolver() throws EcuacionDegeneradaException, RaicesComplejasException {

		double x, discriminante, x1, x2;

		if (a == 0 && b == 0) {
			throw new EcuacionDegeneradaException("La ecuación es degenerada (a = 0 y b = 0).");
		}

		if (a == 0) {
			x = -c / b;
			return new double[] { x };
		}

		discriminante = b * b - 4 * a * c;

		if (discriminante < 0) {
			throw new RaicesComplejasException("Las raíces son complejas (discriminante < 0).");
		}

		x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
		x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

		return new double[] { x1, x2 };
	}
}
