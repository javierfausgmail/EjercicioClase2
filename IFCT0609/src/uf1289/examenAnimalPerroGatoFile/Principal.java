package uf1289.examenAnimalPerroGatoFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Principal  {

	public static void main(String[] args) {
		int numGatos=10;
		int numPerros=5;

		 

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
		System.out.println("Mostramos todos los perros después de la cacería ORDENADOS por COMPARABLE");
		for (Perro perro : aPerros) {
			System.out.println(perro);
		}
		
		
		
		System.out.println("---");
		System.out.println("Mostramos todos los gatos que quedan con vida (COMPARABLE)");
		for(Gato gato : aGatos) {
			System.out.println(gato);
		}
		
		
//		Ordenamos el ArrayList, es necesario implementar Comparator y sobrescribir .CompareTo() para indicar a Java "el orden entre objetos Gato"
		Collections.sort(aGatos);
		
		System.out.println("---");
		System.out.println("Mostramos todos los gatos que quedan con vida ORDENADOS (COMPARABLE)");
		for(Gato gato : aGatos) {
			System.out.println(gato);
		}
		
		
		//Vasmos a ordenar los gatos por diferentes criterios con nuestros comparator
		
		   System.out.println("Ordenamos ArrayList gatos por VISTA (COMPARATOR):");
//		   Collections.sort(aGatos, Gato.ComparadorVista);
		   aGatos.sort(Gato.ComparadorVista);
		   System.out.println(aGatos);
		
		   
		   System.out.println("Ordenamos ArrayList gatos por OIDO (COMPARATOR):");
//		   Collections.sort(aGatos, Gato.ComparadorOido);
		   aGatos.sort(Gato.ComparadorOido);
		   System.out.println(aGatos);
		   
		   System.out.println("Ordenamos ArrayList gatos por REFLEJOS (COMPARATOR):");
//		   Collections.sort(aGatos, Gato.ComparadorReflejos);
		   aGatos.sort(Gato.ComparadorReflejos);
		   System.out.println(aGatos);
		   
//		   System.out.println("Ordenamos ArrayList gatos por VIDAS (COMPARATOR):");
////		   Collections.sort(aGatos, Gato.ComparadorVidas);
//		   aGatos.sort(Gato.ComparadorVidas);
//		   System.out.println(aGatos);
//		   
		//System.out.println( aPerros.get(0).compareTo(aGatos.get(0)) ); // resultado de comparar tipos distintos controlado en método .compareTo()

		   
		   
		   // GUARDAMOS EN FICHERO
		   
			//Preparamos escritura de archivo
			String nombreArchivo = "gatos.txt";
			boolean append = true;
			
			//try con recursos
			try(
					FileWriter fileWriter = new FileWriter( nombreArchivo , append);
					BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				)	
			{
				//Escribimos al fichero los atributos de las gatos
				for (Gato gato : aGatos) {
					bufferedWriter.write(gato.toString());
					bufferedWriter.newLine();
				}
				
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		   
			
			//Leemos de un fichero y mostramos por pantalla
			
			try(
					FileReader fileReader = new FileReader(nombreArchivo);
					BufferedReader bufferedReader = new BufferedReader(fileReader)
				)	
			{
				String textoFichero="";
				String linea = bufferedReader.readLine(); //lee una linea de texto y omite el \n final
				while(linea != null) {
					//Ejemplo lectura para mostrar luego por pantalla lo que se ha leído
					textoFichero += linea + '\n'; //anyadimos el salto de linea 
					linea = bufferedReader.readLine(); 
				}
				System.out.println("Mostramos contenido del ARCHIVO " + nombreArchivo);
				System.out.println(textoFichero);
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		   
		
	}

}
