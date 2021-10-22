package uf1289.puestoFronterizo;

import uf1289.bombilla.*;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PuestoFronterizo miPuesto= new PuestoFronterizo();
		
//		uf1289.bombilla.Bombilla bombillita2 = new uf1289.bombilla.Bombilla();
//		
//		Bombilla bombillita = new Bombilla();
//		bombillita.apaga();
		
		
		
		
		miPuesto.pasoDeFrontera("juan", "56453875H");
		miPuesto.pasoDeFrontera("Mario", "77453875H");
		
		
		miPuesto.buscarNombre("Juan");
		miPuesto.buscarDNI("56453875H");
		
		miPuesto.mostrarTodasPersonas();
		
		//..  hacer menú...
		

		
	}

}
