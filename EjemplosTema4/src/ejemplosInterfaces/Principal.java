package ejemplosInterfaces;

public class Principal {

	public static void main(String[] args) {

		// IDepredador d = new IDepredador(); No se puede por abstracta

		Anfibio a = new Anfibio();
		Rana r = new Rana();

		r.cazar(false);
		r.perseguir();

	}

}
