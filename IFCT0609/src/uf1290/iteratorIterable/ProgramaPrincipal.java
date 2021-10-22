package uf1290.iteratorIterable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ProgramaPrincipal 
{
	private static void pruebaArrayFor()
	{
		String array[]=new String[20];
		String actual;
		for(int i=0; i<array.length; i++)
		{	
			actual="String"+i;
			array[i]=actual;
		}
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
	}
	private static void pruebaArrayForEach()
	{
		String array[]=new String[20];
		int i=0;
		for(String actual:array)
			actual="String"+(i++);
		for(String actual:array)
			System.out.println(actual);
	}
	private static void pruebaArrayListFor()
	{
		ArrayList<String> miArrayList=new ArrayList<>();
		for(int i=0; i<20; i++)
			miArrayList.add("String"+i);
		for(int i=0; i<miArrayList.size(); i++)
			System.out.println(miArrayList.get(i));
	}
	private static void pruebaArrayListForIni()
	{
		ArrayList<String> miArrayList=new ArrayList<>();
		for(int i=0; i<20; i++) miArrayList.add("");
		for(int i=0; i<20; i++)
		{
			String actual="String"+i;
			miArrayList.set(i, actual);
			
		}
		for(int i=0; i<miArrayList.size(); i++)
			System.out.println(miArrayList.get(i));
	}
	private static void pruebaArrayListForEach()
	{
		ArrayList<String> miArrayList=new ArrayList<>();
		for(int i=0; i<20; i++) miArrayList.add(null);
		int i=0;
		for(String actual:miArrayList)
			actual="String"+(i++);
		for(String actual:miArrayList)
			System.out.println(actual);
	}
	private static void pruebaArrayListIterator()
	{
		ArrayList<String> miArrayList=new ArrayList<>();
		for(int i=0; i<20; i++) miArrayList.add("xxx");
		int i=0;
		Iterator<String> itInicio=miArrayList.iterator();
		while(itInicio.hasNext())
		{
			String actual=itInicio.next();
			actual="String"+(i++);
			actual.toUpperCase();
		}
		Iterator<String> it=miArrayList.iterator();
		while(it.hasNext()) System.out.println(it.next());
	}
	
	
	public static void main(String[] args) 
	{
		pruebaIterablePersona();
	
	}
	public static void pruebaIterablePersona()
	{
		Persona p=new Persona("Juan", "a a", 5);

		Persona p2=new Persona("Juanasdasd", "aasdad asda", 55);
		for(String atributo:p)
		{
			System.out.println(atributo);
		}
		
		Iterator<String> it=p2.iterator();
		while(it.hasNext())
		{
			String atributo=it.next();
			System.out.println(atributo);
		}
	}
	
	public static void pruebaIterable()
	{
		MiArray<String> mArray=new MiArray<String>(new String[10]);
		for(int i=0; i<10; i++) mArray.add(i, "String "+(i+1));
		
		System.out.println("Usando ForEach del array");
		for(String actual:mArray.getArray()) System.out.println(actual);
		
		System.out.println("Usando ForEach");
		for(String actual:mArray) System.out.println(actual);
		
		System.out.println("Usando iterador propio");
		Iterator<String> it=mArray.iterator();
		while(it.hasNext()) System.out.println(it.next());
	}

	
	public static void pruebaIterator()
	{
		String[] mArray=new String[10];
		for(int i=0; i< mArray.length; i++) mArray [i] ="String "+i;
		
		System.out.println("Usando ForEach");
		for(String actual: mArray) System.out.println(actual);
		
		System.out.println("Usando iterador propio");
		Iterator<String> it=new IteradorArrayPropio(mArray);
		while(it.hasNext())
			{System.out.println(it.next());}
	}
	
	
	
	
	
	
	public static void main2(String[] args) {

		
		
		ArrayList<String> miArrayList=new ArrayList<String>();
		miArrayList.add("Hola");
		miArrayList.add("esto");
		miArrayList.add("es");
		miArrayList.add("una");
		miArrayList.add("prueba");
		
		System.out.println("Usando for 'normal' en el arrayList");
		for(int i=0; i<miArrayList.size(); i++)
		{	
			String actual=miArrayList.get(i);
			System.out.println(actual);
		}
		
		Object[] miStringArray=miArrayList.toArray();

		System.out.println("Usando for 'normal' en el array ");
		for(int i=0; i<miStringArray.length; i++)
		{	
			String actual=(String) miStringArray[i];
			System.out.println(actual);
		}

		System.out.println("Usando foreach en el arrayList");
		for(String actual : miArrayList)
		{
			System.out.println(actual);
		}

		System.out.println("Usando foreach en el array ");
		for(Object actual : miArrayList.toArray())
		{
			System.out.println(actual);
		}
		
		Iterator<String> miIterador=miArrayList.iterator();
		//hasnext()->saber si hay elementos
		//next()-> obtener el elemento siguiente
		String actual;
		while(miIterador.hasNext())
		{
			actual=miIterador.next();
			System.out.println(actual);
		}
		
		
		String s21="21";
		ArrayList<String> nuevo=(ArrayList<String>) miArrayList.clone();//Copia contenido
		ArrayList<String> nuevoR=miArrayList;//Copia referencia
		
		Object arrayLisObject=miArrayList;
		List<String> miLisObject=miArrayList;
		Iterable<String> miiterable=miArrayList;
		
		
		nuevo.add(s21);
		System.out.println(nuevo.contains(s21));
		System.out.println(miArrayList.contains(s21));
		
		int x=58;
		int y=x;
		y*=2;
		
		/*char n='2';
		int num=n-'0';
		
		String numero="21";
		int ns=Integer.parseInt(numero);*/
		
		
		
		System.out.println(x+" "+y);
		
		
		/*ArrayList<Persona> miArray= new ArrayList<Persona>();

		miArray.add(new Persona("5", "a a", 5));
		miArray.add(new Persona("2", "e e", 6));
		miArray.add(new Persona("4", "a a", 50));
		miArray.add(new Persona("6", "c c", 8));
		miArray.add(new Persona("1", "d d", 88));
		miArray.add(new Persona("3", "b b", 9));
		
		System.out.println(miArray.toString());
		
		Collections.sort(miArray, new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				
				System.out.println(o1.nombre+" "+o2.nombre);
				// TODO Auto-generated method stub
				return o1.nombre.compareTo(o2.nombre);
			}
		});

		//miArray.sort();

		System.out.println(miArray.toString());*/
		
		
		
		
	}

}
