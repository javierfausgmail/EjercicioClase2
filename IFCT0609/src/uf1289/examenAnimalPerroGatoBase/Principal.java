package uf1289.examenAnimalPerroGatoBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Principal  {

	public static void main(String[] args) {
		int numGatos=10;
		int numPerros=20;

		 

		ArrayList<Gato> aGatos = new ArrayList<>(); 
		
		for (int i=0; i < numGatos; i++  ) {

			int vista=(int)(Math.random()*100)+1;
			int oido=(int)(Math.random()*100)+1;
			int reflejos=(int)(Math.random()*100)+1;

			Gato unGato = new Gato("Rasputín"+i, "Siamés", vista, oido, reflejos);
			aGatos.add(unGato);
//			aGatos.add( new Gato("Rasputín"+i, "Siamés", vista, oido, reflejos)  );
		}
		
		System.out.println("Mostramos todos los gatos");
		
		for (Gato gato : aGatos) {
			System.out.println(gato);
		}

		


		ArrayList<Perro> aPerros = new ArrayList<>(); 

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
		
		

//		1.
//		Todos los perros intentan cazar a todos los gatos (simple, sin borrar los gatos que no tienen vidas)
//		for (Perro perro : aPerros) {
//			for (Gato gato : aGatos) {
//				perro.cazar(gato);
//			}
//		}
	
		
//		2.
//		Todos los perros intentan cazar a todos los gatos y cuando un gato no tiene vidas 
//		se elimina del ArrayList
		for (Perro perro : aPerros) {
		
//			Recorremos la lista y modificamos la propia estructura de lista (si es necesario)
			for(int i = 0; i<aGatos.size();i++) {
				perro.cazar(aGatos.get(i));
				
				if(aGatos.get(i).getVidas()<=0) {
					aGatos.remove(i);
					i--; // como hemos borrado el elemento actual tenemos que volver a repetir este indice para no saltarnos uno ya que la lista se redimensiona dinámicamente  
				}
			}	
			
			
//			Otra manera de recorrer la lista y modificarla (si es necesario) con un iterador 
				Iterator<Gato> iterator = aGatos.iterator();
				while( iterator.hasNext() ) {
					Gato gato = iterator.next();
					
					perro.cazar(gato);
					if(gato.getVidas()<=0) {
						iterator.remove();
					}
				}
				
		}
			
		
		System.out.println("---");
		System.out.println("Mostramos todos los perros después de la cacería");
		for (Perro perro : aPerros) {
			System.out.println(perro);
		}

//		Ordenamos el ArrayList, es necesario implementar Comparator y sobrescribir .CompareTo() para indicar a Java "el orden entre objetos de tipo Perro"
		Collections.sort(aPerros);
		
		System.out.println("---");
		System.out.println("Mostramos todos los perros después de la cacería ORDENADOS");
		for (Perro perro : aPerros) {
			System.out.println(perro);
		}
		
		
		
		System.out.println("---");
		System.out.println("Mostramos todos los gatos que quedan con vida");
		for(Gato gato : aGatos) {
			System.out.println(gato);
		}
		
		
//		Ordenamos el ArrayList, es necesario implementar Comparator y sobrescribir .CompareTo() para indicar a Java "el orden entre objetos Gato"
		Collections.sort(aGatos);
		
		System.out.println("---");
		System.out.println("Mostramos todos los gatos que quedan con vida ORDENADOS");
		for(Gato gato : aGatos) {
			System.out.println(gato);
		}
		
		
		//System.out.println( aPerros.get(0).compareTo(aGatos.get(0)) ); // resultado de comparar tipos distintos controlado en método .compareTo()
		
		
	}

}
