package examenUF1287;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 
 * Pedir al usuario por pantalla que introduzca 5 numeros enteros, en caso de introducir un valor NO entero, se debe manejar la excepción asociada volviendo a pedir
 * al usuario que introduzca dicho número. 
 * 
 * Cada número se muestra a continuación de ser tomado del usuario.
 * 
 */


public class RepasoExcepciones {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int [] numero = new int[5];

		

		for (int i = 0; i < 5; i++) {

//			Thread.sleep(1222);

			try {

				System.out.println("Introduce un número entero: ");
				numero[i] = Integer.parseInt(teclado.nextLine());
				
//				numero[i] = teclado.nextInt(); // basura de caracteres invisibles/especiales /n /t ...   
				
				System.out.println("El número"+ i +" es:" + numero[i]);
			}
			catch(NumberFormatException | InputMismatchException e ) {
				//tratamos la excepción
				i--;
			}

		}// el i++ del for se ejecuta aquí 
		teclado.close();
		
	
		
		
		System.out.println("Se acaba el programa");
		
	}

}
