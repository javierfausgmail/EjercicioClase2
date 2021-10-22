package arrayList;

public class Perro {
	private String raza;
	private int patas;
	
	Perro()
	{
		raza = "Caniche";
		patas = 0;
	}
	
	Perro(String raza)
	{
		this.raza = raza;
		patas= 4;
	}
	/*
	@Override
	public boolean equals(Object perroentrada)
	{
		boolean salida = false;
		Perro perro = (Perro) perroentrada;
		if (this.raza.equals(perro.raza) && this.patas == perro.patas)
		{
			salida =true;
		}
		return salida;
	}
	*/
	
	void ladrar() {
		System.out.println("GUAU!!");
	}
	
}
