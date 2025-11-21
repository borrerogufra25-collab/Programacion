package ejemploParametrosAMain;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		String nombre;
		double precioB, por = 0;
		int ref, cantidad;
		boolean refrigerado = false;
		double totalVenta = 0.0;
		String nombreVendedor = "Fran";
		// Esto habría que pedirlo por teclado y demás
		double[] listaImpuestos = { 30.0, 42.0, 10.0 };

		// Declaración

		Producto p;
		LineaVenta lv;
		LineaVenta2 lv2;
		Venta v;
		Venta2 v2;

		// Pido los datos antes de instaciar

		System.out.println("Diga nombre");
		nombre = Leer.dato();
		System.out.println("Diga si es refrigerado, 1 para SI otro número si no lo es");
		ref = Leer.datoInt();
		if (ref == 1) {
			refrigerado = true;
			System.out.println("Diga el porcentaje");
			por = Leer.datoDouble();
		}

		System.out.println("Diga el precio base");
		precioB = Leer.datoDouble();

		// Ahora se intancia introduciendo todos los parámetros

		p = new Producto(nombre, refrigerado, precioB);

		// Ahora llamamos al método calcularPVP

		System.out.printf("Precio final: %.2f", p.calcularPVP(por));

		// Calcular el subtotal
		// Necesitamos un objeto de linea de venta

		// Ahora se intancia introduciendo todos los parámetros
		System.out.println("\n¿Cuántos productos lleva?");
		cantidad = Leer.datoInt();
		lv = new LineaVenta(p, cantidad);
		System.out.printf("\nSubtotal: %.2f", lv.calcularSubTotal(por));

		lv2 = new LineaVenta2(cantidad);

		System.out.printf("\nNuevo subtotal de la otra versión: %.2f", lv2.calcularSubtotalV2(por, p));

		// Pedir datos de una venta

		v = new Venta(totalVenta, nombreVendedor, listaImpuestos);

		System.out.printf("\nMedia de impuestos: %.2f", v.calcularMediaImpuestos());

		// Esto es la segunda versión

		v2 = new Venta2(totalVenta, nombreVendedor);

		System.out.printf("\nMedia de impuestos: %.2f", v2.calcularMediaImpuestosV2(listaImpuestos));

	}

}
