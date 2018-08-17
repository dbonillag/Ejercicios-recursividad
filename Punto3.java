import java.util.Vector;

/**
 * 
 */

/**
 * Descripción:Escribir un método recursivo, int product(int[]a, int b); que calcule el producto de los elementos
del array a mayores que b.
 * @author Daniel Bonilla
 * @since 17/08/2018
 * @version 1.0
 */
public class Punto3 {

	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int[] vector= {3,1,3,4};
		
		System.out.println(product(vector, 2, 0));

	}
	
	public static int product(int []a,int b, int i) {
		
		if (a.length==i) {
			return 1;
		}else {
			
			if (a[i]>b) {
				return a[i]*product(a, b, i+1);
			}else {
				return product(a, b, i+1);
			}
		}
		
		
	}
	
	

}
