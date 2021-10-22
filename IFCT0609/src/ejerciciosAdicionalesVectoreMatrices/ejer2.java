package ejerciciosAdicionalesVectoreMatrices;

public class ejer2 {

	public static void main(String[] args) {
		
		int [][] matrizTabla = new int[4][4];
		int contador = 0;
		
		for (int i = 0; i < matrizTabla.length; i++) {
			
			for (int j = 0; j < matrizTabla.length; j++) {
				
//				matrizTabla[i][j] = contador++ ;
				matrizTabla[i][j] = 1 ;
				
			}
			
		}
		
		
		for (int i = 0; i < matrizTabla.length; i++) {
			
			for (int j = 0; j < matrizTabla.length; j++) {
				System.out.print( matrizTabla[i][j] + "\t");
			}
			System.out.println();

		}
		
		
		
	}
	
}
