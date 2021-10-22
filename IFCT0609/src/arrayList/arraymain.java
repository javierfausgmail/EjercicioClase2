package arrayList;

import java.util.ArrayList;

public class arraymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> arrayl = new ArrayList<Persona>();
		
		Persona personaux = new Persona();
		arrayl.add(personaux);
		
		Persona persona2 = new Persona();
		Persona personaux2 = new Persona();
		personaux2.setNombre("Juan");
		
		arrayl.add(personaux2);
		arrayl.add(personaux);
		arrayl.add(personaux2);
		
		personaux2.setNombre("Antonio");
		
		for(int i=0; i<arrayl.size(); i++)
		{
			System.out.println(arrayl.get(i).getNombre()); 
//			for(int j=0; j<arrayl.get(i).getAsigna().length; j++) // o implementar .toString() en Persona y Asignatura 
//			{
//				System.out.println("Asignatura" + j);
//				System.out.println(arrayl.get(i).getAsigna()[j].getNombre());
//				System.out.println(arrayl.get(i).getAsigna()[j].getAnyo());
//			}
		}
		
		int valor=-1;
		System.out.println();
		arrayl.remove(personaux2);
		arrayl.remove(persona2);
		/*for(int i=0; i<arrayl.size(); i++)
		{
			Persona p = arrayl.get(i);
			if(p.getNombre().equals("Antonio"))
			{
				valor = i;
			}
			
		}
		if (valor!=-1)
		{
			arrayl.remove(valor);			
		}
		*/
		for(int i=0; i<arrayl.size(); i++)
		{
			System.out.println(arrayl.get(i).getNombre());
			/*for(int j=0; j<arrayl.get(i).getAsigna().length; j++)
			{
				System.out.println(arrayl.get(i).getAsigna()[j].getNombre());
				System.out.println(arrayl.get(i).getAsigna()[j].getAnyo());
			}*/
		}
		arrayl.remove(personaux2);
		System.out.println();
		for(int i=0; i<arrayl.size(); i++)
		{
			System.out.println(arrayl.get(i).getNombre());
			
		}
	}

}
