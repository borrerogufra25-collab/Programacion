package ejemploPolimorfismo;

public class OperacionesFiguras {

	// ENTRA EN EL EXAMEN

	public double calcularElAreaDeUnaFigura(Figura f) {

		return f.calcularArea();
	}

	public double calcularElPerimetroDeUnaFigura(Figura f) {

		return f.calcularPerimetro();

	}

	/*
	 * 1) Dentro del método sumarAreas, se está llamando al método
	 * calcularElAreaDeUnaFigura, al que se le pasa como parámetro una figura del
	 * array
	 * 
	 * 2) El método calcularElAreaDeUnaFigura es el que distingue a qué versión de
	 * calcularArea hay que llamar según lo que haya en el listado, un cuadrado o un
	 * círculo
	 */

	public double sumarAreas(Figura[] listado) {
		double resultado = 0;
		for (int i = 0; i < listado.length; i++) {
			resultado = resultado + calcularElAreaDeUnaFigura(listado[i]);
		}
		return resultado;
	}

	// El método anterior se puede usar
	// resultado = resultado + listado[i].calcularArea();
	// Pero es mejor usar el otro ya que es más general
}