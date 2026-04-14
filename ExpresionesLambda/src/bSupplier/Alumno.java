package bSupplier;

/* Clase normal y corriente, aqui no hacemos nada*/

public class Alumno {

	private String name;
	
	public Alumno(String name) {
		super();
		this.name = name;
	}

	public Alumno() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Alumno [name=" + name + "]";
	}
	
	
}
