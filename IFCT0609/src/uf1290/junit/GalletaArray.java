package uf1290.junit;

public class GalletaArray implements Comparable<GalletaArray>
{
	private int dimensiones,peso;
	
	public GalletaArray(int d, int p){dimensiones=d; peso=p;}
	int getDimensiones() {return dimensiones;}
	int getPeso() {return peso;}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof GalletaArray)
		{
			GalletaArray otraGalleta=(GalletaArray) obj;

			if(((GalletaArray) obj).dimensiones==this.dimensiones && otraGalleta.peso==this.peso)
				return true;
			else
				return false;
		}else
			return false;
	}
	
	@Override
	public String toString() {
		return ""+dimensiones+"-"+peso;
	}
	@Override
	public int compareTo(GalletaArray otro) 
	{
		if(otro!=null)
		{
			/*if(otro instanceof Galleta)
			{*/
				GalletaArray oG=otro;
				if(this.dimensiones>oG.dimensiones)
				{
					return 1;
				}else if(oG.dimensiones>this.dimensiones)
				{
					return -1;
				}else
				{
					if(this.peso>oG.peso)
						return 1;
					else if(oG.peso>this.peso)
						return -1;
					else
						return 0;
				}
					
			/*}else
				return 1;*/
		}
	return 1;
	}
	
	

}
