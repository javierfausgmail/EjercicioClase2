package uf1290.interfaces;

public interface InterfaceA extends InterfaceB, InterfaceC, InterfaceD{

	//los atributos son final y static,no hace falta ponerlo es "por defecto" 
	static final int version=1;
	
	
	//los m�todos son :

//	default ->  hay que implementarlos, se heredan y se pueden Override
//	static -> hay que implementarlos, son m�todos "de clase" la interfaz 
//  a estos m�todos se les llama "de extensi�n"
	static void interfaceA() { // si es static tiene que implementarse, es un m�todo est�tico
			System.out.println("M�todo est�tico de la InterfazA . Versi�n: "+version);
	}
	
	default void interfaceA2() { // si es DEFAULT tiene que implementarse, es un m�todo est�tico
		System.out.println("M�todo DEFAULT de la InterfazA, se me puede Override. Versi�n: "+version);
	}
	
	// m�todos "normales" de una interfaz, el que la implemente los tiene que implementar, public abstract se puede omitir ya que es "por defecto".
	public abstract void interfaceA3(); // si es static y public tiene que implementarse, es un m�todo est�tico
	
	
}
