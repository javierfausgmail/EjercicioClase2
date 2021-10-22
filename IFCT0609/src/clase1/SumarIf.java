package clase1;
import java.util.Scanner;

public class SumarIf {
	
	public static void main(  String[] args  ) {
		// TODO Auto-generated method stub
		
		 Scanner teclado = new Scanner(System.in);
		 
		 
		 //ENTRADA
		 System.out.println("Introduzca el primer sumando:");
		 int num1 = teclado.nextInt();
		 
		 System.out.println("Introduzca el segundo sumando:");
		 int num2 = teclado.nextInt();
		 
		 teclado.close();

		 
		 //PROCESAMIENTO
		 int total = num1 + num2;
		 
		 if( total > 10 )//Si  CODICION_EVALUAR es true (verdadero) ejecutar código de entre las llaves
		 {
			 System.out.println("El resultado de la suma es mayor que 10, siendo igual a " + total );
		 }
		 else {  // Si CONDICION_EVALUAR es false el flujo del programa salta a esta línea
			 System.out.println("El resultado de la suma es menor o igual a 10, siendo igual a " + total );
		 }
		 
		 
		 
		 // Mostrar el resultado de la suma solo si el primer sumando es mayor que el segundo.  
		 if( num1 > num2 ) {
			 System.out.println("El primer sumando es mayor, siendo la suma igual a " + total  );
		 }
		 else {
			 System.out.println("El primer sumando es menor o igual, siendo la suma igual a " + total );
		 }
		 
		 
		 
		 // Operadores booleanos && , || , !, ==
		 if( (total < 10) && (num1<num2) ) {
			 //ejecutamos si true
			 System.out.println("Se cumplen las condiciones");
		 }
		 else if(total==0){
			 //en caso FALSE
			 System.out.println("Igual a cero!!");
			 
		 }
		 
		 
		 
//		 1 Utilizar los parametros de ejecución de args  // int total = Integer.parseInt(args[0]) + Integer.parseInt(args[1]); 
//		 2 Crear el ejemplo de la suma pero solo sumar si el primer sumando es mayor que el segundo.
//		 3 Realizar el ejercicio pero admintiendo cualquier número de sumandos hasta que el usuario decida finalizar.
//		 4 Realizar el programa con un array o vector, almacenando los sumandos en este.
//       5 Crear la clase "Sumando" con getters y setters	 
		 
	
		
	}
}
