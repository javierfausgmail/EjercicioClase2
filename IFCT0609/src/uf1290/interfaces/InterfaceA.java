package uf1290.interfaces;

public interface InterfaceA extends InterfaceB, InterfaceC, InterfaceD{

	//los atributos son final y static,no hace falta ponerlo es "por defecto" 
	static final int version=1;
	
	
	//los métodos son :

//	default ->  hay que implementarlos, se heredan y se pueden Override
//	static -> hay que implementarlos, son métodos "de clase" la interfaz 
//  a estos métodos se les llama "de extensión"
	static void interfaceA() { // si es static tiene que implementarse, es un método estático
			System.out.println("Método estático de la InterfazA . Versión: "+version);
	}
	
	default void interfaceA2() { // si es DEFAULT tiene que implementarse, es un método estático
		System.out.println("Método DEFAULT de la InterfazA, se me puede Override. Versión: "+version);
	}
	
	// métodos "normales" de una interfaz, el que la implemente los tiene que implementar, public abstract se puede omitir ya que es "por defecto".
	public abstract void interfaceA3(); // si es static y public tiene que implementarse, es un método estático
	
	
}
