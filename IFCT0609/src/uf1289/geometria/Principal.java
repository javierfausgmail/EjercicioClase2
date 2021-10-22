package uf1289.geometria;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {


	public static void main(String[] args) {
		
		Rectangulo rectan = new Rectangulo();
		rectan.setBase(5);
		rectan.setAltura(10);
		float perimetro = rectan.getPerimetro();
//		System.out.println("El rectan tine un perímetro de:" + perimetro);
		System.out.printf("rectan tine un perímetro de %3f , un base de %3d y una altura de %3d %n", perimetro, rectan.getBase(), rectan.getAltura());
		
		Circunferencia circunferencia = new Circunferencia( 4 , "verde" );
		System.out.println( "Perimetro 1: " + circunferencia.getPerimetro() );
		
		
//		circunferencia.radio=7;
		if( circunferencia.setRadio( 10 ) )
			System.out.println("cambió el radio");
		else
			System.out.println("radio inválido");
		
		
		circunferencia.getPerimetro();
		System.out.println( "Perimetro 2: " + circunferencia.getPerimetro() );

		
		/*
		 * Creamos dos esferas llamadas tierra y luna, definir en radio en km
		 * y calcular cuantas lunas caben dentro de una tierra.
		 * 
		 */
		
		
		Planeta planeta1 = new Planeta("mercurio", 2439 , "naranja");
		Planeta planeta2 = new Planeta("venus", 6051 , "verde");
		Planeta planeta3 = new Planeta("venus", 6051 , "verde");
		Planeta planeta4 = new Planeta("marte", 3389 , "rojo");
		Planeta planeta5 = new Planeta("jupiter", 69911 , "");
		Planeta planeta6 = new Planeta("saturno", 58232 , "");
		Planeta planeta7 = new Planeta("urano", 25362 , "");
		Planeta planeta8 = new Planeta("neptuno", 24622 , "");
		
		
		if( planeta2.equals(planeta3) ) {
			System.out.println("planetas iguales");
		}
		
		
		Esfera luna = new Esfera( 1737 , "blanca" );
		
		double veces =   planeta3.getVolumen() / luna.getVolumen();
		
		System.out.printf("Caben[%10.2f] lunas dentro de la Tierra %n", veces);
		
//		Esfera [] esferas = new Esfera[8];
//		esferas[0] = tierra; 
		
		ArrayList<Planeta> planetas = new ArrayList<>();
		
		planetas.add(planeta1);
		planetas.add(planeta2);
		planetas.add(planeta3);
		planetas.add(planeta4);
		planetas.add(planeta5);
		planetas.add(planeta6);
		planetas.add(planeta7);
		planetas.add(planeta8);
		
//		esferas.add(luna);

//		devolver numero de elementos en la lista
		int numEsferas = planetas.size();
		
//		devolver un elemento de la lista por su indice
//		Esfera copia = esferas.get(0);
		
//		calcular la media de los radios de todas los planetas del sistema solar
		double mediaRadios = 0;
		for (int i = 0; i < planetas.size(); i++) {
			mediaRadios += ( planetas.get(i) ).getRadio();
//			mediaRadios += planetas[i].getRadio(); // modo vector
		}
		
		mediaRadios = mediaRadios / planetas.size();
		
		System.out.println("La media de los radios del sistema solar es " + mediaRadios  + "km");
		
		
		
		for (int i = 0; i < planetas.size(); i++) {
			System.out.println( planetas.get(i).toString()  );
		}
		System.out.println();
		
		
		//eliminar del ArrayList planetas aquellos planetas que su radio sea menor a la media
		//planetas.remove(i);
		
//		for (int i = 0; i < planetas.size(); i++) {
//			if( mediaRadios > planetas.get(i).getRadio() ) {
//				planetas.remove(i);
//				i--;
//			}
//		}
		
		Iterator<Planeta> iterador = planetas.iterator();
		while(iterador.hasNext()) {
			Planeta unPlaneta = iterador.next();
			
			if( mediaRadios > unPlaneta.getRadio() ) {
				iterador.remove();
			}
		}
		
		
		  if ( planetas.contains(planeta5) )
		  {
			  System.out.println("Planeta encontrado");
		  }
		
		
		System.out.println("ANTES FOREACH");
//		foreach  para-cada
//		for (Planeta unPlaneta : planetas) {
//			if( mediaRadios > unPlaneta.getRadio() ) {
//				planetas.remove(unPlaneta);
//			}
//		}
//		
		
		
		//RECORRER el arrayList y mostrar cada elemento
		for (int i = 0; i < planetas.size(); i++) {
			System.out.println( planetas.get(i)  );
		}
	
		
		Planeta pl = null;//= new Planeta();
		
		pl.getRadio();
		
		
		//
		
//		Planeta planeta9 = new Planeta("urano9", 25362 , "");
//		
//		ArrayList< Planeta > pruebaPlanetas = new ArrayList<>();
//		
//		pruebaPlanetas.add(planeta9);
//		
//		planeta9.setNombre("mercurio");
//		System.out.println();
//		System.out.println( pruebaPlanetas.get(0).toString() );
//		
//		
		
		
		
		Planeta2 planetaZ = new Planeta2("Plutón", 1000 , "azul"); 
		float radioZ = planetaZ.getRadio();
		
	}

}
