package util;

/**
 * # Ejemplo de Text Blocks (Java 13+)
 */
public class TextBlockEjemplo {

	public static void mostrarBanner() {
		String banner = """
				==========================
				   SISTEMA BIBLIOTECA
				==========================
				""";
		System.out.println(banner);
	}
}
