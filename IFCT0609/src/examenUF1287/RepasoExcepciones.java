package examenUF1287;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 * Pedir al usuario por pantalla que introduzca 5 numeros enteros, en caso de introducir un valor NO entero, se debe manejar la excepci�n asociada volviendo a pedir
 * al usuario que introduzca dicho n�mero. 
 * 
 * Cada n�mero se muestra a continuaci�n de ser tomado del usuario.
 * 
 */


public class RepasoExcepciones {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int [] numero = new int[5];

		

		for (int i = 0; i < 5; i++) {

//			Thread.sleep(1222);

			try {

				System.out.println("Introduce un n�mero entero: ");
				numero[i] = Integer.parseInt(teclado.nextLine());
				
//				numero[i] = teclado.nextInt(); // basura de caracteres invisibles/especiales /n /t ...   
				
				System.out.println("El n�mero"+ i +" es:" + numero[i]);
			}
			catch(NumberFormatException | InputMismatchException e ) {
				//tratamos la excepci�n
				i--;
			}

		}// el i++ del for se ejecuta aqu� 
		teclado.close();
		
	
		
		
		System.out.println("Se acaba el programa");
		
	}

}
