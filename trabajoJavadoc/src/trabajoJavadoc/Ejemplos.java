package trabajoJavadoc;

public class Ejemplos {

	// Código autocomentado

	// Método que suma dos números
	public int suma(int a, int b) {
		// Devuelve la suma
		return a + b;
	}

	public int sumar(int primerNumero, int segundoNumero) {
		return primerNumero + segundoNumero;
	}

	// Buenos nombres > comentarios

	public void p(int x) {
		if (x > 18) {
			System.out.println("OK");
		}
	}

	public void permitirAccesoSiEsMayorDeEdad(int edad) {
		if (edad > 18) {
			System.out.println("Acceso permitido");
		}
	}

	// Métodos pequeños

	public void procesarPedido1(Pedido pedido) {
		validarStock(pedido);
		aplicarDescuentos(pedido);
		calcularImpuestos(pedido);
		enviarEmailConfirmacion(pedido);
	}

	private void enviarEmailConfirmacion(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}

	private void calcularImpuestos(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}

	private void aplicarDescuentos(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}

	private void validarStock(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}

	public void procesarPedido(Pedido pedido) {
		validarPedido(pedido);
		calcularPrecioFinal(pedido);
		notificarCliente(pedido);
	}

	private void validarPedido(Pedido pedido) {
	}

	private void calcularPrecioFinal(Pedido pedido) {
	}

	private void notificarCliente(Pedido pedido) {
	}

	// Evitar duplicación

	public double calcularAreaCuadrado(double lado) {
		return lado * lado;
	}

	public double calcularAreaRectangulo(double base, double altura) {
		return base * altura;
	}

	public double calcularAreaParalelogramo(double base, double altura) {
		return base * altura;
	}

	public double multiplicar(double a, double b) {
		return a * b;
	}

	public double calcularAreaCuadrado2(double lado) {
		return multiplicar(lado, lado);
	}

	public double calcularAreaRectangulo2(double base, double altura) {
		return multiplicar(base, altura);
	}

	public double calcularAreaParalelogramo2(double base, double altura) {
		return multiplicar(base, altura);
	}

}
