/**
 * 
 */

/**
 * Descripción:Escriba un método recursivo que retorne la norma de un vector (a) de tamaño n. La norma de un
vector se calcula sacando la raíz cuadrada a la sumatoria de cada uno de sus elementos al
cuadrado.
 * @author Daniel Bonilla
 * @since 17/08/2018
 * @version 1.0
 */
public class Punto2 {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] vector= {1,2,3,4};
		
		System.out.println(metodo1(vector, 0, 0));
	}
	
	public static double metodo1(int vector[],int posicion,double suma) {
		
		if (posicion==vector.length) {
			return Math.sqrt(suma);
		}else {
			
			return metodo2(vector,posicion,suma);
			
		}

	}
	
	public static double metodo2(int vector[],int posicion, double suma) {
		
		suma+=Math.pow(vector[posicion], 2);
		
		return metodo1(vector, posicion+1, suma);
		
	}

}
