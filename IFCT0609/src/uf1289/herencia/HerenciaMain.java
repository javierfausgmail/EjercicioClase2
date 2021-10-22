package uf1289.herencia;

public class HerenciaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo vehiculo = new Vehiculo();
		Vehiculo vehiculo2 = new Vehiculo(4, 1200, 100, 5, "123123HJ");
		
		System.out.println(vehiculo2.toString() );
		
		Coche coche  = new Coche();
		Coche coche2 = new Coche("Fiat", "Punto", "Rojo");
		Coche coche3 = new Coche(4, 1200, 100, 5,"123432DDS", "Fiat", "Punto", "Rojo");

		coche3.getRuedas();
		
		System.out.println(coche3);
		
//		Coche [][] aCoches = new Coche[5][5];
//		
//		int ruedas =4;
//		int tara = 1000;
//		int CV = 75;
//		int plazas = 4;
//		String matricula="123234H";
//		String marca="Fiat";
//		String modelo = "Punto";
//		String color = "Rojo";
//		
//		
//		for (int i = 0; i < aCoches.length; i++) {
//			for (int j = 0; j < aCoches.length; j++) {
//			
//				aCoches[i][j]=new Coche( (ruedas+j), (tara+5*i*j) , CV, plazas, matricula, (marca+(i*j)), modelo, color);
//				
//			}
//		}
//		
//		for (int i = 0; i < aCoches.length; i++) {
//			for (int j = 0; j < aCoches.length; j++) {
//				System.out.println( aCoches[i][j] );
//			}
//		}
//		
		
		
		Moto moto= new Moto();
		Moto moto2= new Moto(250, 5);
		Moto moto3= new Moto(2, 200, 120, 2, "1233425DD", 250, 6f);
		
		System.out.println(moto3);
		
		
		
		
		
		
		
		
	}

}
