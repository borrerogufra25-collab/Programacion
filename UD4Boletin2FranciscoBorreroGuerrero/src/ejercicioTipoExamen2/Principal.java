package ejercicioTipoExamen2;

public class Principal {

	public static void main(String[] args) {

		Producto p1 = new Movil(234.72, 1, "Iphone 17", "Cosas nuevas");
		Producto p2 = new Movil(130.24, 2, "Android", "To pepino");
		Producto p3 = new EspadaLaser(120.23, 1, "Algo", "Doble");
		Producto p4 = new EspadaLaser(145.23, 2, "Otra cosa", "Simple");

		Producto[] listaProductos = { p1, p2, p3, p4 };

		Ventas v1 = new Ventas(listaProductos);

		System.out.println("Hay un total de " + v1.contarCuantosQueda() + " productos");

		System.out.println("Los beneficios tototales serían: " + v1.calcularTotal(15) + " €");

		System.out.printf("El cambio es de : %.2f €\n", v1.devolverCambio(200.23, 500));

		v1.mostrarListado();

	}

}
