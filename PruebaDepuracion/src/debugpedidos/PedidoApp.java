package debugpedidos;

import java.util.ArrayList;
import java.util.List;

public class PedidoApp {

    public static void main(String[] args) {
        List<Producto> productos = cargarProductos();

        double total = calcularTotalPedido(productos);
        int productosCaros = contarProductosCaros(productos, 50);
        Producto masCaro = buscarProductoMasCaro(productos);

        System.out.println("TOTAL DEL PEDIDO: " + total + " €");
        System.out.println("PRODUCTOS DE MÁS DE 50 €: " + productosCaros);
        System.out.println("PRODUCTO MÁS CARO: " + masCaro.getNombre());
    }

    public static List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Teclado mecánico", 79.99, 1));
        productos.add(new Producto("Ratón inalámbrico", 24.50, 2));
        productos.add(new Producto("Monitor 24 pulgadas", 159.99, 1));
        productos.add(new Producto("Cable HDMI", 8.99, 3));
        productos.add(new Producto("Silla oficina", 129.90, 1));

        return productos;
    }

    public static double calcularTotalPedido(List<Producto> productos) {
        double total = 0;

        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            total += producto.getPrecio() * producto.getCantidad();
        }

        return total;
    }

    public static int contarProductosCaros(List<Producto> productos, double precioMinimo) {
        int contador = 0;

        for (Producto producto : productos) {
            if (producto.getPrecio() < precioMinimo) {
                contador++;
            }
        }

        return contador;
    }

    public static Producto buscarProductoMasCaro(List<Producto> productos) {
        Producto productoMasCaro = null;

        for (Producto producto : productos) {
            if (producto.getPrecio() > productoMasCaro.getPrecio()) {
                productoMasCaro = producto;
            }
        }

        return productoMasCaro;
    }
}

class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
