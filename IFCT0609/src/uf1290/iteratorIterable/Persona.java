package uf1290.iteratorIterable;
import java.util.Comparator;
import java.util.Iterator;

public class Persona implements Comparable<Persona>, Iterable<String>
{

	private class IteratorPersona implements Iterator<String>
	{
		Persona laPersona;
		int miIndice;
		public IteratorPersona(Persona p) {
			laPersona=p;
			miIndice=0;
		}
		
		@Override
		public boolean hasNext() {
			return miIndice<3;
		}

		@Override
		public String next() {
			
			String actual="";
			switch(miIndice)
			{
				case 0:
					actual="Nombre: "+laPersona.nombre;
					break;
				case 1:
					actual="Apellidos: "+laPersona.apellidos;
					break;
				case 2:
					actual="Altura: "+laPersona.altura;
					break;
			}
			miIndice++;
			return actual;
		}
	}
	
	@Override
	public Iterator<String> iterator() {
		
		/*String[] atributos=new String[3];
		atributos[0]="-Nombre: "+nombre;
		atributos[1]="-Apellidos: "+apellidos;
		atributos[2]="-Altura: "+altura;
		return new IteradorArrayPropio<String>(atributos);*/
		
		//return new IteratorPersona(this);
		
		return new Iterator<String>() {
			int miIndice=0;
			@Override
			public boolean hasNext() {
				return miIndice<3;
			}

			@Override
			public String next() {

				String actual="";
				switch(miIndice)
				{
					case 0:
						actual="Nombre: "+nombre;
						break;
					case 1:
						actual="Apellidos: "+apellidos;
						break;
					case 2:
						actual="Altura: "+altura;
						break;
				}
				miIndice++;
				return actual;
			}
		};
		
		
	}
	
	String nombre, apellidos;
	int altura;
	
	public void mimetodo()
	{
		System.out.println("Mi metodo");
	}
	
	Persona(String nombre, String apellidos, int altura)
	{
		this.nombre=nombre; 
		this.apellidos=apellidos;
		this.altura=altura;
	}
	Persona()
	{
		}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", altura=" + altura + "]\n";
	}

	@Override
	public int compareTo(Persona o) {

			int dv=apellidos.compareTo(o.apellidos);
			if(dv!=0)
				return dv;
			else
				return nombre.compareTo(o.nombre);

	}
	
	public static Comparator<Persona> comparadorAltura=new Comparator<Persona>(){

		@Override
		public int compare(Persona o1, Persona o2) {
			// TODO Auto-generated method stub
			
			return o1.altura-o2.altura;
		}
		// TODO Auto-generated constructor stub
	
	};


	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Persona)
		{
			Persona otraPersona=(Persona) o;
			int dv=apellidos.compareTo(otraPersona.apellidos);
			if(dv!=0)
				return dv;
			else
				return nombre.compareTo(otraPersona.nombre);
		}
		return 1;
	}*/

}
