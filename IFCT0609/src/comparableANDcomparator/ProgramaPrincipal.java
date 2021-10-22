package comparableANDcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProgramaPrincipal {

	
	
	public static void main(String[] args) {

		
//		Ejemplo utilizando interfaz Comparable

	   EstudianteComparable a = new EstudianteComparable(100, "A", 50);
	   EstudianteComparable b = new EstudianteComparable(200, "B", 40);
	   
//	   EstudianteComparator c = new EstudianteComparator(300, "C", 70);
	   
	   System.out.println(   a.compareTo( b )    );
	   
	   
//	   System.out.println(a.compareTo(c));
		
		
	   ArrayList<EstudianteComparable> listaEstudiantes = new ArrayList<EstudianteComparable>();
	   
	   listaEstudiantes.add(new EstudianteComparable(223, "CPedro", 26));
	   listaEstudiantes.add(new EstudianteComparable(245, "AMamen", 24));
	   listaEstudiantes.add(new EstudianteComparable(209, "BJuan", 32));
	   
	   
	   
	   System.out.println("Collections ordena los estudiantes con ayuda de nuestro método del EstudianteComparable compareTo() :");
	   
	   Collections.sort( listaEstudiantes );
	   
	   System.out.println("Ordenamos estudiantes COMPARABLES por edad:");
	   for(EstudianteComparable str: listaEstudiantes){
			System.out.println(str);
	   }
	
	   
	   
//	   Ejemplo utilizando la interfaz Comparartor con clases anónimas 
	   
	   
	   // NO VISTO EN CLASE, no entra en el examen del segundo trimestre
	   
	   ArrayList< EstudianteComparator > arraylist2 = new ArrayList< EstudianteComparator >();
	   
	   arraylist2.add(new EstudianteComparator(101, "Ramón", 26));
	   arraylist2.add(new EstudianteComparator(505, "Andrés", 24));
	   arraylist2.add(new EstudianteComparator(809, "María", 32));

	   EstudianteComparator [] vEstudianteComparators = arraylist2.toArray(new EstudianteComparator [0] );// ejemplo de crear un vector de nuestro ArrayList para luego ordenarlo también
	   
	   System.out.println("Ordenamos ArrayList estudiantes COMPARATOR por nombre:");
//	   Collections.sort(arraylist2, EstudianteComparator.ComparadorNombre);
	   arraylist2.sort(EstudianteComparator.ComparadorNombre);
//	   for(EstudianteComparator estudiante: arraylist2){
//			System.out.println(estudiante);
//	   }
	   //utilizando una expresion lambda que implementa la interfaz funcional Consumer<T>
	   arraylist2.forEach(estudiante -> System.out.println(estudiante));
	   
	   System.out.println("Ordenamos VECTOR estudiantes COMPARATOR por nombre:");
	   Arrays.sort(vEstudianteComparators,EstudianteComparator.ComparadorNombre);
	   System.out.println( Arrays.deepToString(vEstudianteComparators) );
	   

	   
	   System.out.println("Ordenamos ArrayList estudiantes COMPARATOR por su número de matriculación:");
	   Collections.sort(arraylist2, EstudianteComparator.ComparardorNumMatricula);
//	   arraylist2.sort(EstudianteComparator.ComparardorNumMatricula);
//	   for(EstudianteComparator estudiante: arraylist2){
//			System.out.println(estudiante);
//	   }
	   //utilizando una expresion lambda que implementa el metodo abstracto accept() de la interfaz funcional Consumer<T>
	   arraylist2.forEach(estudiante -> System.out.println(estudiante));

	   
	   
	   System.out.println("Ordenamos VECTOR estudiantes COMPARATOR por número de matriculación:");
	   Arrays.sort(vEstudianteComparators,EstudianteComparator.ComparardorNumMatricula);
	   System.out.println( Arrays.deepToString(vEstudianteComparators) );
	   	   
	   
	   
	}

}
