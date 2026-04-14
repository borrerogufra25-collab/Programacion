package eBifunction;

public class Principal {

	public static void main(String[] args) {
		
		Demo dm = new Demo();
		
		int num1 = 2, num2 = 3;
		String str1 = "Hola", str2 = "Adiós";

        System.out.println(dm.concatenar.apply(str1, str2));
        System.out.println();
        
        System.out.println(dm.sumar.apply(num1, num2));
        System.out.println();
        
        System.out.println(dm.textoMasNumero.apply(str1, str1.length()));

	}

}
