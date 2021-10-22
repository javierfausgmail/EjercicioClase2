package comparableANDcomparator;

import java.util.Comparator;

public class EstudianteComparator {
	
    private String nombre;
    private int numMatricula;
    private int edad;

    public EstudianteComparator(int numMatricula, String nombre, int edad) {
        this.numMatricula = numMatricula;
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
   }
   public void setNombre(String nombre) {
	this.nombre = nombre;
   }
   public int getNumMatricula() {
	return numMatricula;
   }
   public void setNumMatricula(int numMatricula) {
	this.numMatricula = numMatricula;
   }
   public int getEdad() {
	return edad;
   }
   public void setEdad(int edad) {
	this.edad = edad;
   }	
    
    @Override
    public String toString() {
        return "[ numMatricula=" + numMatricula + ", name=" + nombre + ", age=" + edad + "]";
    }


    
    /*Comparator para ordenar por nombre.
     *
     *Atenci�n: Comparator<> es una interfaz que estamos aqu� utilizando para crear un objeto de una clase sin nombre o an�nima. (Explicacion: Pg 252 Libro Aprende a Programar con Java)
     *Como tal debemos implementar los m�todos abstractos de la interfaz utilizada.  
     *
     *Adem�s dicho objeto es est�tico (o de clase)
     *
     */
    public static Comparator<EstudianteComparator> ComparadorNombre = new Comparator<EstudianteComparator>() {


    	public int compare(EstudianteComparator estudiante1, EstudianteComparator estudiante2) {


    		String StudentName1 = estudiante1.getNombre();//.toUpperCase()  
    		String StudentName2 = estudiante2.getNombre();//.toLowerCase()

    		//orden ascendente
    		return StudentName1.compareTo(StudentName2); //por orden alfab�tico ascendente, se utiliza precisamente el m�todo compareTo() de la interfaz Comparable que implementa clase String directamente

    		//orden descendente
    		//return StudentName2.compareTo(StudentName1); //si queremos orden alfab�tico descendente comparamos al rev�s
    	}};

    
    
    /* Comparator para ordenar por numero de matriculaci�n */
    public static Comparator<EstudianteComparator> ComparardorNumMatricula = new Comparator<EstudianteComparator>() {

		public int compare(EstudianteComparator estudiante1, EstudianteComparator estudiante2) {

			if(estudiante1 == null) {return -99999;} //�es buena idea gestionar esto o mejor dejar que lance la excepci�n?
			if(estudiante2 == null) {return  99999;}
			
		   int numMat1 = estudiante1.getNumMatricula();
		   int numMat2 = estudiante2.getNumMatricula();
	
		   // orden ascendente
		   return numMat1 - numMat2; // como son valores num�ricos primitivos , podemos restar directamente para devolver el valor adecuado ( si numMat1 es mayor devuelve positivo, y negativo o cero seg�n valores de numMat 1 y numMat2)
	
		   // orden descendente
		   // return numMat2 - numMat1;
		}};
   
}