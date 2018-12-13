package fp.daw.examen;

public class Ejercicio1 {

	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, un método llamado 'mostrarVector' que
	 * reciba mediante un parámetro formal un vector de números enteros y lo muestre por
	 * pantalla en una única línea con el formato siguiente:
	 * 
	 * 				[num1, num2, num3, ...., numN]
	 * 
	 * donde num1, num2, num3, ..., numN son los números almacenados en el vector.
	 */
	
	public static int [] mostrarVector (int [] vector) {
		
		
		for (int i=1; i<vector.length; i++) {
			
			return vector;
			
		
		System.out.println("num"+ vector[i]+", ");
		}
	}
	
public static void main(String[] args) {
			mostrarVector (5);
			
			
		
	}
	
	
	
	/* 
	 * 1 punto
	 * 
	 * Define, después de este comentario, la vesión sobrecargada del método anterior que
	 * muestre por pantalla un vector de caracteres con el formato siguiente:
	 * 
	 * 				['c1', 'c2', 'c3', ...., 'cN']
	 * 
	 * donde 'c1', 'c2', 'c3', ...., 'cN' son los caracteres almacenados en el vector.
	 */

	public static int [] mostrarVector (int veces) {
		
		int [] vector = new int [veces];
		for(int i =0; i<veces; i++) {
			System.out.println("c"+ vector [i]);
		}
		
		
		
	}
	
	
}
