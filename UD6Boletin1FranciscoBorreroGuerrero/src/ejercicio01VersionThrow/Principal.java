package ejercicio01VersionThrow;

public class Principal {

	public static void main(String[] args) {

		Operaciones o = new Operaciones();

		try {

			o.dividir(2, 0);

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
