package uf1290.iteratorIterable;
import java.util.Iterator;

public class MiArray<T> implements Iterable<T>
{
	private T[] mArray;
	public MiArray(T[] array) { mArray=array; }
	public T[] getArray() { return mArray; }
	public int getSize() { return mArray.length; }
	public int count()
	{
		int cuenta=0;
		for(T g:mArray)
			if(g!=null)
				cuenta++;
		return cuenta;
	}
	public T get(int index)
	{
		if(index>=0 && index<mArray.length)
			return mArray[index];
		else
			return null;
	}
	public boolean add(int index, T obj)
	{
		if(index>=0 && index<mArray.length)
		{
			mArray[index]=obj;
			return true;
		}
		else return false;
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new IteradorArrayPropio<T>(mArray);
	}
}