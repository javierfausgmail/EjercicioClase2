package uf1290.javaDoc;

public class MiArray 
{
	private GalletaArray[] miarray;
	
	public MiArray(int tam)
	{
		miarray=new GalletaArray[tam];
	}
	
	public GalletaArray[] getArray()
	{
		return miarray;
	}
	
	public int getSize()
	{
		return miarray.length;
	}

	public int getCount()
	{
		int cuenta=0;
		for(GalletaArray g:miarray)
			if(g!=null)
				cuenta++;
		
		return cuenta;
	}
	
	public GalletaArray get(int index)
	{
		if(index>=0 && index<miarray.length)
			return miarray[index];
		else
			return null;		
	}

	public int buscar(GalletaArray g)
	{
		int posicion=-1;
		
		for(int i=0; i<miarray.length && posicion==-1;i++)
		{
			if(miarray[i]!=null && miarray[i].equals(g))
				posicion=i;
		}
		
		return posicion;
	}
	
	public int primerHueco()
	{
		int posicion=-1;
		
		for(int i=0; i<miarray.length && posicion==-1;i++)
		{
			if(miarray[i]==null)
				posicion=i;
		}
		
		return posicion;
	}
	
	public boolean add(GalletaArray g)
	{
		int huecoLibre=primerHueco();
		if(huecoLibre!=-1)
		{
			miarray[huecoLibre]=g;
			return true;
		}else
		{
			redimensionar(1);
			return this.add(g);
			//miarray[miarray.length-1]=g;
		}
		
		//return false;
	}
	
	public void redimensionar(int diferencia)
	{
		if(diferencia>0)
		{
			int nuevoTam=miarray.length+diferencia;
			
			GalletaArray[] nuevoArray=new GalletaArray[nuevoTam];
			
			for(int i=0; i<miarray.length;i++)
			{	
				nuevoArray[i]=miarray[i];
			}
			
			miarray=nuevoArray;
		}
		
	}
	
	
	public boolean removeLast()
	{
		boolean borrado=false;
		
		for(int i=miarray.length-1; i>=0 && borrado==false; i--)
		{
			if(miarray[i]!=null)
			{
				miarray[i]=null;
				borrado=true;
			}
		}
		
		return borrado;		
	}
	
	public void removeAll()
	{		
		for(int i=miarray.length-1; i>=0; i--)
		{
			if(miarray[i]!=null)
			{
				miarray[i]=null;
			}
		}
		
		/*int primerHueco=primerHueco();
		for(int i=0; i<primerHueco; i++)
		{
			miarray[i]=null;
		}*/
		
		//miarray=new Galleta[miarray.length];
		
	}
	
	
	public boolean remove(int indice)
	{
		if(indice >=0 && indice<miarray.length)
		{
			if(miarray[indice]!=null)
			{
				miarray[indice]=null;
				miarray[miarray.length-1]=null;
				for(int i=indice;i<miarray.length-1;i++)
				{
					miarray[i]=miarray[i+1];
				}
				return true;
			}
		}
		return false;
		
	}
	
	public boolean remove(GalletaArray g)
	{
		return remove(buscar(g));
	}
	

}
