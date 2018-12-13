package fp.daw.examen;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2 puntos
	 * 
	 * Crea en el método 'main' un juego que consista en generar de forma aleatoria
	 * un número entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedirá que introduza por teclado un número.
	 * Si introduce el número correcto se mostrará un mesaje por pantalla indicando
	 * que ha acertado acompañado del número de intentos realizados y del tiempo
	 * empleado. A continuación, se le dará al usuario la opción de volver a jugar o
	 * de finalizar el juego.
	 * 
	 */
	
	public static void main(String[] args) {
		
		 Random r = new Random();
		int  aleatorio= r.nextInt(201)+100;
		int cliente;
		int cuenta =0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Escribe un numero haber si es el que yo he pensado");
		
		cliente = s.nextInt();
		
		do {
		if (cliente == aleatorio) {
			
			System.out.println("ENORABUENA HAS HACERTADO. Has escrito" + cuenta + "veces" );
		}
		else {
			System.out.println("No era correcto, el numero correcto es " + aleatorio + " vuelve a empezar poneido el número aqui");
			cliente = s.nextInt();
			cuenta++;
		}
		}while(cliente != aleatorio);

	}

}
