package arrayList;

import java.util.ArrayList;

public class Main2 {
/*
	public ArrayList<Integer> mifuncion(ArrayList<Integer> entrada)
	{
		return entrada++;
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
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
		
		*/
		
		Mesa mesa = new Mesa(5);
		Mesa mesa2 = new Mesa(7);
		ArrayList<Mesa> arraym = new ArrayList<Mesa>();
		arraym.add(mesa);
		//arraym.add(mesa2);
		System.out.println(mesa);
		System.out.println(mesa2);
		System.out.println(arraym.indexOf(mesa2)); //indexOf recorre todo el arraylist comprobando con equals
		//si equals no lo hemos definido para la clase en concreto, es como si hicieramos ==
		
		
		ArrayList<Object> locura = new ArrayList<Object>(); //NO HACER NUNCA!!!!!!!!!!!
		locura.add(mesa);
		Perro perro = new Perro("Bulldog");
		Perro perro2 = new Perro("Labrador");
		Perro perro3 = new Perro("Labrador");
		locura.add(perro2);
		locura.add(perro);
		locura.add(mesa2);
		
		
		System.out.println(locura);
		System.out.println(perro3);
		System.out.println(locura.indexOf(perro2));//Posible error al tratar un objeto de tipo Perro como un objeto de tipo Mesa
		
		//no muy recomendable pero posible
		for (Object object : locura) {
			if(object instanceof Mesa)
				((Mesa)object).toString();
			if(object instanceof Perro)
				((Perro)object).ladrar();
			
			
		}
		
	}

}
