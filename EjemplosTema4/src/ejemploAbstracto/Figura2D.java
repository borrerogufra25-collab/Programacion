package ejemploAbstracto;

public abstract class Figura2D {

	private double x;
	private double y;

	public Figura2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Figura2D [x=" + x + ", y=" + y + "]";
	}

	public abstract double calcularArea(); // No se le ponen llaves a métodos abstractos

}
