package ejercicio03;

public class Furgoneta extends Vehiculos {

	private boolean transporteMerca;

	public Furgoneta(int categoria, boolean transporteMerca) {
		super(categoria);
		this.transporteMerca = transporteMerca;
	}

	public boolean isTransporteMerca() {
		return transporteMerca;
	}

	public void setTransporteMerca(boolean transporteMerca) {
		this.transporteMerca = transporteMerca;
	}

	@Override
	public String toString() {
		return "Furgoneta [transporteMerca=" + transporteMerca + "]";
	}
	
	

}
