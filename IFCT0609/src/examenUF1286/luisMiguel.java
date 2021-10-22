// Luis Miguel Rubio Toledo
/*
 *     5. Dados los siguientes requisitos, genera el código Java que realiza dichas necesidades:
    • Solicitar al usuario 2 números.
    • Determinar qué número es mayor.
    • Mostrar la diferencia entre ambos números.
    • Mostrar de menor a mayor, todos los números que hay entre los números introducidos por el usuario.
     En el caso de que los números introducidos por el usuario sean el mismo, no mostrar nada.
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