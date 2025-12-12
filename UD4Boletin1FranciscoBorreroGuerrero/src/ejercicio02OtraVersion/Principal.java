package ejercicio02OtraVersion;

public class Principal {

	public static void main(String[] args) {

		String nombre = "Miguelito S.L.";
		int CIF = 345345245;
		String numeroTelefono = "757488382";
		String correo = "a@a.com";
		String direccion = "Un calle aleatoria";

		Documento d1 = new Documento();
		Empresa e1 = new Empresa(nombre, CIF);
		TarjetaDeVisita tdv1 = new TarjetaDeVisita(numeroTelefono, correo, direccion);
		Carta c1 = new Carta("12 / 12 / 2025");

		// d1.imprimir(e1);
		tdv1.imprimir(e1);
		// c1.imprimir(e1);

	}
}
