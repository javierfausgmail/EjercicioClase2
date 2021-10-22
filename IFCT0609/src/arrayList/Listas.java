package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Listas {

	// Clase Interna
	// Tutorial: https://javadesdecero.es/poo/clases-internas/
	public class Persona {

		private String nombre;
		private Asignatura[] asignaturas;
		private int indice;
		
		Persona()
		{
			this.nombre="vacio";
			asignaturas = new Asignatura[20];
			for(int i =0; i<20; i++)
				asignaturas[i]=new Asignatura();
		}
		
		Persona(String nombre)
		{
			this.nombre="vacio";
		}
		
		public Persona(String nombre, Asignatura[] asignaturas, int indice) {
			super();
			this.nombre = nombre;
			this.asignaturas = asignaturas.clone() ;
			this.indice = indice;
		}
		
		
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Asignatura[] getAsigna() {
			return asignaturas;
		}
		public void setAsignaturas(Asignatura asignaturas) {
			if(indice++<this.asignaturas.length)
			{
				this.asignaturas[indice] = asignaturas;
			}
		}
		


		
		
		
		@Override
		public boolean equals(Object p) {
			boolean igual=false;
			
				if( this.nombre.equals( ((Persona)p).getNombre() )  )
					igual=true;
			
			return igual;
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Persona [nombre=");
			builder.append(nombre);
			builder.append(", asignaturas=");
			builder.append(Arrays.toString(asignaturas));
			builder.append(", indice=");
			builder.append(indice);
			builder.append("]");
			return builder.toString();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		// Cuatro siguientes instrucciones relativas a la construcción de un objeto de la clase interna
		//Creamos un objeto llamado "lista" de la clase externa Listas (la de este archivo)
		
		Listas lista = new Listas();
		
		// Con el objeto "lista" ya podemos crear las personas (clase interna) para los ejemplos de ArrayList que queremos hacer
		Listas.Persona p1 = lista.new Persona("Juan");
		Listas.Persona p2 = lista.new Persona("Olga");
		Listas.Persona p3 = lista.new Persona("Pedro");
		
		ArrayList<Persona> aPersonas = new ArrayList<Persona>();
		aPersonas.add(p1);
		aPersonas.add(p2);
		aPersonas.add(p3);
		
		aPersonas.remove(p1);
		aPersonas.remove(0);
		
//		aPersonas.clear();//vacía la lista, no borra la variable aPersonas
		
		int size = aPersonas.size(); // devuelve un int con cuantos elementos tengo dentro 
		
		System.out.println("Tamaño: "+size);
		
		if(aPersonas.isEmpty()) {
			System.out.println("VACIA");
		} 
		
		if( aPersonas.contains(p2) ){
			System.out.println("CONTIENE");
		}// ¿contiene a p2? true or false
		
		
		if(aPersonas.contains(lista.new Persona("Juan")) ){
			System.out.println("IGUALES");
		} // OJO porque ArrayList no sabe comparar nuestras clases, tenemos que @Override el método equals()		
		
		
		System.out.println(aPersonas.toString());
		String cadena = aPersonas.toString();
		
		
		
		for( Iterator<Persona> iterador = aPersonas.iterator() ; iterador.hasNext() ; ) {
			
			Persona persona = iterador.next();
			
			if(persona.equals(p2) ) {
				System.out.println("soy P2");
				iterador.remove();
			}
			else {
				System.out.println("No soy P2");
			}
			
			
			//iterador.next();
			//iterador.remove();
			//System.out.println(persona.toString()+" ]");
			
		}
		System.out.println(aPersonas);
		
		System.out.println(p1 +" "+ p2 + " " + p3);
		
		
		for (Persona persona : aPersonas) {
			if(persona.equals(p2) ) {
				System.out.println("soy P2");
			}
			else {
				System.out.println("No soy P2");
			}
		}
		
		
		Persona[] vPersonas =  aPersonas.toArray( new Persona[0] );
		
		for (int i = 0; i < vPersonas.length; i++) {
			System.out.println(vPersonas[i]);
		}
		
		
		
		
	}

}
