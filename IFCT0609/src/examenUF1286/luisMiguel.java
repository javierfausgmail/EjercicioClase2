// Luis Miguel Rubio Toledo
/*
 *     5. Dados los siguientes requisitos, genera el c�digo Java que realiza dichas necesidades:
    � Solicitar al usuario 2 n�meros.
    � Determinar qu� n�mero es mayor.
    � Mostrar la diferencia entre ambos n�meros.
    � Mostrar de menor a mayor, todos los n�meros que hay entre los n�meros introducidos por el usuario.
     En el caso de que los n�meros introducidos por el usuario sean el mismo, no mostrar nada.
 */
package examenUF1286;
import java.util.Scanner;
public class luisMiguel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
		
int mayor;
int menor;

		System.out.println("Introduzca a:");
		int a = teclado.nextInt();
	
		System.out.println("Introduzca b: ");
		int b = teclado.nextInt();
		
				if (a>b) {
				 mayor=a;
				 menor=b;
				}
				else {
					 mayor=b;
				
						menor =a;
				}
				
			for( int i=menor; i<=mayor; i++) {
						
						System.out.println(i);
			
			}
			
		}
}