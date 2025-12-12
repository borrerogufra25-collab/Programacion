package ejercicio02;

/*
 * Escribir un programa que tenga una clase Documento y dos clases hijas, Tarjeta de visita y Carta.
Crear los métodos necesarios para que, la cabecera de cada tipo de documento se imprima en pantalla
de una forma diferente, según sus características. Como es un ejemplo académico, podemos hacer los
métodos de impresión dentro de cada clase. Por ejemplo, el documento genérico solo tiene un pequeño
encabezado con los datos de la empresa, la tarjeta puede llevar, además, los datos de contacto de una
persona y la carta, una fecha.
Crear un main para hacer una prueba con cada método llamado con objetos de las distintas clases.
 */

public class Principal {

	public static void main(String[] args) {

		Documento d1 = new Documento("Salesianos", "Triana");
		TarjetaDeVisita t1 = new TarjetaDeVisita("Salesianos", "Triana", "838499571", "esuncorreo@loquesea.com",
				"Una dirección");
		Carta c1 = new Carta("Salesianos", "Triana", "12/12/2025", "Algo más por probar");

		d1.imprimirEncabezado();
		t1.imprimirEncabezado();
		c1.imprimirEncabezado();

	}
}