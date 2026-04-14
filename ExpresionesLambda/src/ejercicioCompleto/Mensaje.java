package ejercicioCompleto;

public class Mensaje {

	private String cuerpo;
	private boolean error;
	
	public Mensaje(String cuerpo, boolean error) {
		
		this.cuerpo = cuerpo;
		this.error = error;
		
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "Mensaje [cuerpo=" + cuerpo + ", error=" + error + "]";
	}
	
	/********************************/
	
	
	
}
