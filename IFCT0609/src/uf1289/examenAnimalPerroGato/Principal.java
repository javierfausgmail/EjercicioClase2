package uf1289.examenAnimalPerroGato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		int numGatos=10;
		int numPerros=25;


		ArrayList<Gato> aGatos = new ArrayList<>(10); 

		for (int i=0; i < numGatos; i++  ) {

			int vista=(int)(Math.random()*100)+1;
			int oido=(int)(Math.random()*100)+1;
			int reflejos=(int)(Math.random()*100)+1;

			Gato unGato = new Gato("Rasputín"+i, "Siamés", vista, oido, reflejos);
			aGatos.add(unGato);
		}

		System.out.println("Mostramos todos los gatos");
		for (Gato gato : aGatos) {
			System.out.println(gato);
		}



		ArrayList<Perro> aPerros = new ArrayList<>(10); 

		for (int i=0; i < numPerros; i++  ) {

			int mordisco=(int)(Math.random()*100)+1;
			int velocidad=(int)(Math.random()*100)+1;
			int olfato=(int)(Math.random()*100)+1;

			Perro unPerro = new Perro("Laica"+i, "Pastor", mordisco, velocidad, olfato);
			aPerros.add(unPerro);
		}

		System.out.println("Mostramos todos los perros");
		for (Perro perro : aPerros) {
			System.out.println(perro);
		}

		
//		Todos los perros intentan cazar a todos los gatos
//		for (Perro perro : aPerros) {
//			for (Gato gato : aGatos) {
//				perro.cazar(gato);
//			}
//		}
		
		
		// Todos los perros intentan cazar a todos los gatos y cuando un gato no tiene vidas 
//		se elimina del ArrayList
		for (Perro perro : aPerros) {
			
			for (Iterator<Gato> iterator = aGatos.iterator(); iterator.hasNext();) {
				Gato gato = iterator.next();
				
				perro.cazar(gato);
				
				if(gato.getVidas()<=0) {
					iterator.remove();
				}
			}
			
		}
		
		
		System.out.println("---");
		System.out.println("Mostramos todos los perros desupués de la cacería");

		for (Perro perro : aPerros) {
			System.out.println(perro);
		}
		System.out.println("Mostramos todos los gatos que quedan con vida");
		System.out.println("---");
		for(Gato gato : aGatos) {
			System.out.println(gato);
		}
		
//		OK, ¿y si queremos eliminar de la lista a los gatos a los que no les quedan vidas??
//		Tenemos que recorrer la lista y a la vez modificar la estructura de dicha lista,
//		¿podemos modificar la lista con un foreach o solo los datos de sus objetos? 
//		Solo los datos de sus objetos, para modificar la lista necesitasmos utilizar un iterador
		
//		for (Iterator<Gato> iterator = aGatos.iterator(); iterator.hasNext();) {
//			Gato gato = iterator.next();
//			
//			if(gato.getVidas()<=0) {
//				iterator.remove();
//			}
//		}
//		
//		System.out.println("---");
//		for(Gato gato : aGatos) {
//			System.out.println(gato);
//		}
		
		
		
//		Vamos ahora a ordenar los ArrayList
		
		
		Collections.sort(aPerros);
	System.out.println("Mostramos a los perros ORDENADOS");
		System.out.println("---");
		for (Perro perro : aPerros) {
			System.out.println(perro);
		}
		
		System.out.println("Mostramos todos los gatos que quedan con vida ORDENADOS");
		System.out.println("---");
		Collections.sort(aGatos);
		for(Gato gato : aGatos) {
			System.out.println(gato);
		}
		
	}
}
