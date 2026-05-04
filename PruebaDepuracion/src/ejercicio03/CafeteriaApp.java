package ejercicio03;

import java.util.ArrayList;
import java.util.List;

public class CafeteriaApp {

	public static void main(String[] args) {
		List<Pedido> pedidos = new ArrayList<>();

		pedidos.add(new Pedido("Ana", "Café con leche", 2, 1.50));
		pedidos.add(new Pedido("Luis", "Tostada", 1, 2.20));
		pedidos.add(new Pedido("Marta", "Zumo natural", 3, 2.00));
		pedidos.add(new Pedido("Carlos", "Café solo", 1, 1.20));
		pedidos.add(new Pedido("Lucía", "Bocadillo", 2, 3.50));

		mostrarPedidos(pedidos);

		double totalCaja = calcularTotalCaja(pedidos);
		System.out.println("Total de caja: " + totalCaja + " €");

		Pedido pedidoMasCaro = buscarPedidoMasCaro(pedidos);
		System.out.println("Pedido más caro:");
		System.out.println(pedidoMasCaro);

		int pedidosGrandes = contarPedidosConMasDeUnaUnidad(pedidos);
		System.out.println("Pedidos con más de una unidad: " + pedidosGrandes);

		aplicarDescuentoSiSuperaImporte(pedidos, 6.00, 0.10);

		System.out.println();
		System.out.println("Pedidos después de aplicar descuento:");
		mostrarPedidos(pedidos);
	}

	public static void mostrarPedidos(List<Pedido> pedidos) {
		for (Pedido pedido : pedidos) {
			System.out.println(pedido);
		}
	}

	public static double calcularTotalCaja(List<Pedido> pedidos) {
		double total = 0;

		for (Pedido pedido : pedidos) {
			total = pedido.calcularImporte();
		}

		return total;
	}

	public static Pedido buscarPedidoMasCaro(List<Pedido> pedidos) {
		Pedido pedidoMasCaro = pedidos.get(0);

		for (int i = 1; i < pedidos.size(); i++) {
			Pedido pedidoActual = pedidos.get(i);

			if (pedidoActual.calcularImporte() > pedidoMasCaro
					.calcularImporte()) {
				pedidoMasCaro = pedidoActual;
			}
		}

		return pedidoMasCaro;
	}

	public static int contarPedidosConMasDeUnaUnidad(List<Pedido> pedidos) {
		int contador = 0;

		for (Pedido pedido : pedidos) {
			if (pedido.getCantidad() > 1) {
				contador++;
			}
		}

		return contador;
	}

	public static void aplicarDescuentoSiSuperaImporte(List<Pedido> pedidos,
			double importeMinimo, double descuento) {
		for (Pedido pedido : pedidos) {
			double importe = pedido.calcularImporte();

			if (importe > importeMinimo) {
				double nuevoPrecioUnitario = pedido.getPrecioUnitario()
						* (1 - descuento);
				pedido.setPrecioUnitario(nuevoPrecioUnitario);
			}
		}
	}
}

class Pedido {

	private String cliente;
	private String producto;
	private int cantidad;
	private double precioUnitario;

	public Pedido(String cliente, String producto, int cantidad,
			double precioUnitario) {
		this.cliente = cliente;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}

	public String getCliente() {
		return cliente;
	}

	public String getProducto() {
		return producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public double calcularImporte() {
		return cantidad * precioUnitario;
	}

	@Override
	public String toString() {
		return cliente + " pidió " + cantidad + " x " + producto
				+ " | Precio unitario: " + precioUnitario + " € | Importe: "
				+ calcularImporte() + " €";
	}
}