package documentacionEnClase;

/**
 * Esta clase sirve para clacular varios tipos de descuentos
 */

public class DiscountCalculator {

	/**
	 * Aplica un descuento
	 * 
	 * @param precio     al que se le aplica el descuento
	 * @param porcentaje a aplicar
	 * @return precio con el descuento aplicado
	 * 
	 */

	public double aplicarDescuento(double precio, double porcentaje) {
		return precio - (precio * porcentaje / 100);
	}

}