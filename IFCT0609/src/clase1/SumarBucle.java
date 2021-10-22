package clase1;
import java.util.Scanner;

public class SumarBucle {
	
	public static void main(  String[] args  ) {
		// ÁMBITO local del main
		
		 Scanner teclado = new Scanner(System.in);
		 int sum = 0;

		 System.out.println("¿Cuántos sumandos quiere introducir?");
		 int numSumandos = teclado.nextInt();
		 
		 for( int contador=1; contador <= numSumandos  ; contador++)
		 {// ÁMBITO local del for
			System.out.println("Introduzca el "+ contador +"º sumando:");
		  	sum = sum + teclado.nextInt();
		 }
		 
		 teclado.close();
		 System.out.println("El resultado de la suma es:" + sum );
		
	}
}
