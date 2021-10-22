package clase1;

import java.util.Scanner;

public class ejer5_exa_uf1286_b {

	public static void main(String[] args) throws InterruptedException
	{

//		1.Solicitar al usuario 2 números
		int a;
		int b;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el valor de a: ");
		a = teclado.nextInt();
		teclado.nextLine();

		System.out.println("Introduce el valor de b: ");
		b = teclado.nextInt();
		teclado.nextLine();

		teclado.close();

//		2.Determinar que número es mayor
		
		if(a<b) 
		{
		// a es menor
			System.out.println("A es menor que B. Diferencia: " + (b-a) +"\n" );//3. Mostrar la diferencia
			
			for(int i = a+1; i<b; i++)
			{
				System.out.print( i+" " );
				Thread.sleep(1000);
			}
		}
		else if(a>b)
		{
		//a es mayor
			System.out.println("A es mayor que B. Diferencia:" + (a-b) +"\n" );//3. Mostrar la diferencia
			for(int i = b+1; i<a; i++) 
			{
				System.out.print( i+" " );
				Thread.sleep(1000);
			}
		}

		//		En caso de que los numeros sean el mismo no muestro nada
		
		

	}
}
