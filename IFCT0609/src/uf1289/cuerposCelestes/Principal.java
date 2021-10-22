package uf1289.cuerposCelestes;

import java.util.ArrayList;
import java.util.Iterator;

import uf1289.geometria.Planeta2;

public class Principal {


	public static void main(String[] args) {
		
		Planeta planeta = new Planeta("Tierra", 4750f, "Azul", 345677f);
		
		Satelite satelite = new Satelite(2000, "verde", 388, 20000);
		
			
		Asteroide ast = new Asteroide(123f, "rojo", 100, 300, 43.7f);
		
		
		planeta.traslacion();
		planeta.rotacion();
		
		EsferaAbstracta esf = planeta; // polimorfismo
		
		
		System.out.println( "Perimetro planeta/esfera:" + esf.getPerimetro()  );
		
		esf=ast;
		
		System.out.println( "Perimetro del asteroide/esfera:" + esf.getPerimetro());
		 
		
//		¿Puedo apuntar con un variable de tipo interfaz a un objeto de una clase que la implementa? Sí
		
		Movimiento mov; //= new Movimiento(); // prohibido
		
		mov = planeta;
		
		mov.rotacion();
		
		
		
		

		
	}

}
