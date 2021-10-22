package arrayList;

public class Mesa {

	public int patas=0;
	public int altura;
	public Mesa() {
		// TODO Auto-generated constructor stub
		altura =0;
	}
	public Mesa(int pa)
	{
		patas=pa;
		altura =70;
	}
	public void cambiarpatas(int pa)
	{
		patas = pa;
	}
	
	
	public String toString()
	{
		String salida;
		salida = patas +" en string y altura "+ altura;
		return salida;
	}
}
