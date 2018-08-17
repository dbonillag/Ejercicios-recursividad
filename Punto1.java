/**
 * 
 */

/**
 * Descripción:
 * @author Daniel Bonilla
 * @since 17/08/2018
 * @version 1.0
 */
public class Punto1 {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(calcularVocales("murcielago", 0));

	}
	
	public static int calcularVocales(String cadena,int i) {
		
		if (i==cadena.length()) {
			return 0;
		}else {
			char car= cadena.toLowerCase().charAt(i);
			if (car=='a'||car=='e'||car=='i'||car=='o'||car=='u') {
				return 1+calcularVocales(cadena, i+1);
			}else {
				return calcularVocales(cadena, i+1);
			}
			
		}
		
			
		
		
	}

}
