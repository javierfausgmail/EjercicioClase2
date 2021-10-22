package clase1;

import java.util.Scanner;

public class ejer5_exa_uf1286 {

	public static void main(String[] args) throws InterruptedException {

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

		if(a>b) {
			System.out.println("A es mayor o igual");
			System.out.println("Diferencia entre ambos: " + (a-b) );
			
			for (int i = b+1; i < a; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}

		}
		else if(a<b){
			System.out.println("b es mayor");
			System.out.println("Diferencia entre ambos: " + (b-a) );

			for (int i = a+1; i < b; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}

		}

	}
}
