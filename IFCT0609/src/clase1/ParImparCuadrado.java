package clase1;

import java.util.Scanner;

public class ParImparCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Pedir al usuario introducir por teclado numeros enteros positivos, y por cada numero
		 * mostrar si el numero es par, impar y su cuadrado.
		 * El programa finaliza cuando el usuario introduce un numero negativo.
		 */
		
		Scanner teclado = new Scanner(System.in); 
		int num;
		
		
//		do {
//		
//			 System.out.println("Introduce un número (para acabar -1):");
//			 num = teclado.nextInt();
//			
//			 if( num >= 0 )
//			 {
//				 if( num%2 == 0 ) {
//					 System.out.println("Número par");
//				 }
//				 else {
//					 System.out.println("Número Impar"); 
//				 }
//				 
//				 System.out.println("Su cuadrado es: " + Math.pow(num, 2) );
//			 }
//		}
//		while( num >= 0 );
		
		System.out.println("Introduce un número (para acabar -1):");
		num = teclado.nextInt();
		
		int cuadrado;
		double cuadrado2;
		
		
		while(num >= 0) 
		{
			if( num%2 == 0 ) 
			{
				 System.out.println("Número par");
			}
			else
			{
				 System.out.println("Número Impar"); 
			}

			cuadrado = num * num;
			cuadrado2 = Math.pow(num, 2);
			
			 System.out.println("Su cuadrado es: " + cuadrado );
			 System.out.println("Su cuadrado2 es: " + cuadrado2);

			 
			 //Preguntar al usario para modificar valor de num
			 System.out.println("Introduce un número (para acabar -1): ");
			 num = teclado.nextInt();
		}
		 
		
		
		
		
	}
	
	
	
	

}
