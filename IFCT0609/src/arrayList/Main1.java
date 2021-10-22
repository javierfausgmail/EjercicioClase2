package arrayList;

import java.util.ArrayList;

public class Main1 {
/*
	public ArrayList<Integer> mifuncion(ArrayList<Integer> entrada)
	{
		return entrada++;
	}
*/
	public static void main(String[] args) {
		
		ArrayList<String> arrayl;
		arrayl = new ArrayList<String>();
		
		
		//ArrayList<Integer>	arrayi=null;
		
		System.out.println(arrayl);
		arrayl.add("hola");
		arrayl.add("hola2");
		System.out.println(arrayl);
		
		
		arrayl = new ArrayList<String>();
		System.out.println(arrayl);
		arrayl.add("hola");
		arrayl.add("mundo");
		System.out.println(arrayl);
		
		System.out.println(arrayl.size());
		System.out.println(arrayl.indexOf("sdafasdf"));
	//	System.out.println(arrayl.get(7));
		
		
		
		Mesa mesa = new Mesa(5);
		ArrayList<Mesa> arraym = new ArrayList<Mesa>();
		arraym.add(mesa);
		
		
		
		Mesa mesa2 = mesa;
		arraym.add(mesa2);
		System.out.println(arraym);
		
		
		
		mesa = new Mesa(6);
		arraym.add(mesa);
		System.out.println(arraym);
		
		mesa = new Mesa(5);
		mesa2.cambiarpatas(3);
		arraym.add(mesa);
		arraym.add(mesa2);
		System.out.println(arraym);
		
		//arrayl.add(1, "Que pasa");
	
		//System.out.println(arraym);
		if(arraym.remove(mesa2))
			System.out.println("Eliminado");
		else
			System.out.println("No eliminado");
		System.out.println(arraym);
		System.out.println("el tamaño máximo es:"+arraym.size());
		System.out.println(arraym.get(2));
		System.out.println(arraym.indexOf(mesa));
		
		System.out.println(mesa);
		arraym.set(1,mesa);
		System.out.println(arraym);
		arraym.get(2).cambiarpatas(90);
		System.out.println(arraym.get(2).patas);
		System.out.println(arraym);
	//	System.out.println(mesa2);
		
	}

}
