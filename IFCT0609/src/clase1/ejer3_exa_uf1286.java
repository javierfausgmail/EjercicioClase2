package clase1;

import java.util.Scanner;

public class ejer3_exa_uf1286 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		int b;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el valor de a: ");
		a = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Introduce el valor de b: ");
		b = teclado.nextInt();
		teclado.nextLine();
		
		
		if(a>=b) {
			System.out.println("A es mayor o igual");
			
		}
		else {
			System.out.println("b es mayor");
		}
		
	}

}
