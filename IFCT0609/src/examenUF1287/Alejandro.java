package examenUF1287;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Alejandro {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] tabla = new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("\nIntroduce valor entero:");
				try {
					tabla[i][j] = Integer.parseInt(teclado.nextLine());
				}catch(InputMismatchException | NumberFormatException e){
					j--;
					System.out.println("Valor no entero introducido, porfavor introduzca un valor entero");
				}
			}
		}
		for(int i=0;i<2;i++) {
			System.out.println("\n+-----+-----+-----+");
			for(int j=0;j<3;j++) {
				System.out.print("|");
				System.out.print(" " + tabla[i][j] + " ");
				if(j==2) System.out.print("|");
			}
			if(i==1) System.out.println("\n+-----+-----+-----+");
		}
	}
}