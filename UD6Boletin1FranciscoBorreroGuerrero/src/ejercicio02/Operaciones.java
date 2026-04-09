package ejercicio02;

public class Operaciones {

	public void validarTemperatura(int celsius) throws Exception {
		if (celsius < -273) {
			throw new Exception("No puede haber temperaturas menores a -273 ºC");
		}
	}

	public double pasarCelsius(int celsius) {
		return (celsius * 9 / 5) + 32;
	}

}
