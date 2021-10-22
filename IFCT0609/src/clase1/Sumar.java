package clase1;
import java.util.Scanner;

public class Sumar {
	
	public static void main(  String[] args  ) {
		// TODO Auto-generated method stub
		
		 Scanner teclado = new Scanner(System.in);
		 
		 
		 //ENTRADA
		 System.out.println("Introduzca el primer sumando:");
		 int num1 = teclado.nextInt();
		 
		 System.out.println("Introduzca el segundo sumando:");
		 int num2 = teclado.nextInt();
		 
		 teclado.close();
		 		 
//		 args[0] tendremos un "2" pasado al configurar la ejecución
//		 args[1] tendremos un "3" ""	""
		 
//		 int num1 = Integer.parseInt( args[0] );
//		 int num2 = Integer.parseInt( args[1] );
		 
		 //PROCESAMIENTO
		 int total = num1 +num2;
		 
		 
//		 1 Utilizar los parametros de ejecución de args  // int total = Integer.parseInt(args[0]) + Integer.parseInt(args[1]); 
//		 2 Crear el ejemplo de la suma pero solo sumar si el primer sumando es mayor que el segundo.
//		 3 Realizar el ejercicio pero admintiendo cualquier número de sumandos hasta que el usuario decida finalizar.
//		 4 Realizar el programa con un array o vector, almacenando los sumandos en este.
//       5 Crear la clase "Sumando" con getters y setters		 
		 
		 //SALIDA
		 System.out.println("El resultado de la suma es:" + total );
		
	}
}
