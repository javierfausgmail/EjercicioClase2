package clase1;

import java.util.Scanner;

/*
 
 Pedir al usuario que introduzca por teclado un numero y mostrar un triangulo rectangulo tal que:
 
 
 Ej: Introduce un 4.
 
 Salida por pantalla:
 
 ****
 ***
 **
 *
 
 Ej: Introduce un 2.
 
 Salida por pantalla:
 
 **
 *
 
 
 */

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuánto mide el triangulo?");
		int lado= teclado.nextInt();
		
		for (int i = 0; i <= lado; i++) { //numero de lineas
			
			for (int j = i; j < lado; j++) {
				//imprimo tantos caracteres '*' por linea como toca
				System.out.print("*");
			}
			
			
			System.out.println();
		}
		
		
		
		
		
		
	}

}
