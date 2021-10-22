package uf1290.iteratorIterable;
import java.util.Iterator;

public class IteradorArrayPropio<T> implements Iterator<T>
{
	T[] miArray;
	int miIndice;
	
	//TODO Añadir los atributos necesarios
	public IteradorArrayPropio(T[] array)
	{
		miArray=array;
		miIndice=0;
	}
	@Override
	public boolean hasNext()
	{
		/*boolean resultado=true;
		try
		{
			T actual=miArray[miIndice];
		}catch(Exception e)
		{
			resultado=false;
		}*/
		
		return miIndice<miArray.length;
	}
	@Override
	public T next()
	{
		T actual=miArray[miIndice];
		miIndice++;
		return actual;
	}
}
