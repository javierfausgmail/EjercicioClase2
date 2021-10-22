package arrayList;

public class Mesa2 {

	public int patas=0;
	public int altura;
	public Mesa2() {
		// TODO Auto-generated constructor stub
		altura =0;
	}
	public Mesa2(int pa)
	{
		patas=pa;
		altura =70;
	}
	public void cambiarpatas(int pa)
	{
		patas = pa;
	}
	
	/*
	public String toString()
	{
		String salida;
		salida = patas +" en string y altura "+ altura;
		return salida;
	}
	*/
	@Override
	public boolean equals(Object mesaentrada)
	{
		boolean salida = false;
		Mesa mesa = (Mesa) mesaentrada;
		if(this.patas == mesa.patas && this.altura == mesa.altura)
		{
			salida =true;
		}
		return salida;
	}
	
	public boolean equals(Mesa mesa)
	{
		boolean salida = false;
		//Mesa mesa = (Mesa) mesaentrada;
		if(this.patas == mesa.patas && this.altura == mesa.altura)
		{
			salida =true;
		}
		return salida;
	}
	
}
