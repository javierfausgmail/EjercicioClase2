package examenUF1287;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.util.logging.Logger;


/*
 
 * 
El programa debe de pedir por pantalla al usuario que rellene los valores de una matriz de números enteros de tamaño 2 x 3. [1 punto]

Debe controlar mediante el manejo de excepciones que el tipo de dato introducido es el esperado (int). [1 punto]

En caso de no serlo. El programa se debe recuperar ante dicha excepción de manera que el flujo de programa no se interrumpa. Además el programa avisará de la situación al usuario con el mensaje “Valor no entero introducido, por favor introduzca un valor entero” y volverá a pedir el dato tantas veces como sea necesario hasta satisfacer la condición de número entero. [1 punto]

Cuando el usuario acabe de introducir todos los valores de la matriz, el programa debe de mostrar por pantalla la matriz en formato de tabla de 2 filas  x 3 columnas. [0.5 punto]

 * 
 * 
 */

public class EjercicioExamenJavi {
	
	//private final static Logger logger = Logger.getLogger("ExceptionLogging");
	

	public static void main(String[] args) 	{

		//Scanner teclado2 = new Scanner(System.in);
//		teclado2.close();

		Scanner teclado = new Scanner(System.in);
//		teclado2.close();
		
		
		
		int filas=2;
		int columnas=3;
		int[][] matriz = new int[filas][columnas];
		
		for (int i=0; i < filas; i++) {
			for (int j=0; j < columnas; j++) {
				
				try {
				
				System.out.println("Introduce el valor de la posición ["+i+","+j+"]");
				matriz[i][j] = Integer.parseInt(teclado.nextLine());
				
				
				
				}
				catch(InputMismatchException | NumberFormatException excepcion) {
					// medidas para recuperarnos de la situación excepcional
					j--; 
					System.out.println("Valor no entero introducido, por favor introduzca un valor entero.");
					
					//escribimos a salida de error o de log
//					System.err.println(excepcion.getMessage());
//					excepcion.printStackTrace(System.err);
//					logger.warning("Valor no entero introducido.");
				}
			}
		}
		
			
		//mostramos la matriz por pantalla
		for (int i = 0; i < filas; i++) {
			System.out.println( Arrays.toString(matriz[i]) );	
		}
		
		
	}
}








