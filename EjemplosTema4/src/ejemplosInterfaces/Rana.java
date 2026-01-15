package ejemplosInterfaces;

public class Rana extends Anfibio implements IPresa, IDepredador {

	@Override
	public void cazar(boolean enGrupo) {
		if (enGrupo) {
			System.out.println("No creo que las ranas vayan en grupo");

		} else {
			System.out.println("Yo me lo guiso, yo me lo como");
		}
	}

	@Override
	public void perseguir() {
		System.out.println("¡A saltitos o mu quieta!");
	}

}
