package comparableANDcomparator;

public class EstudianteComparable implements Comparable<EstudianteComparable> {
	
    private String nombre;
    private int numMatricula;
    private int edad;
    
    

    public EstudianteComparable(int numMatricula, String nombre, int edad) {
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
    
//	@Override
//	public int compareTo(Object objetoEstudianteComparado) {
//
//		int resultado=0;
//
////		float a = 7;
////		
////		resultado = (int) a;
//			
//		
//			int edadObjetoComparado = ( (EstudianteComparable) objetoEstudianteComparado).getEdad();
//
//
//			if( this.edad >  edadObjetoComparado ) {
//				resultado = 1; //valor positivo, yo voy después que objetoComparado.
//			}
//			else if(this.edad <  edadObjetoComparado) {
//				resultado = -1; // valor negativo, yo voy antes que objetoComparado.
//			}
//			else {
//				resultado=0; // valor cero indica igualdad
//			}
//			
//		
//
//		return resultado;
//
//		// Se puede simplificar obtenidendo directamente el valor de la resta
//		/* Para orden ascendente*/
//		//return this.edad - edadObjetoComparado;
//
//		/* Para orden descendente */
//		//return edadObjetoComparado - this.edad;
//	}


	@Override
	public int compareTo(EstudianteComparable otroEstudianteComparable) {
		//Comprobar null e instance of
		if(otroEstudianteComparable != null) {
			if(otroEstudianteComparable instanceof EstudianteComparable) { //esto es por si implementas herencia al trabajar con objetos de clases superiores que no se te cuele una comparación con objetos de otros subtipos "hermanos" a este
				return this.edad - otroEstudianteComparable.edad;
			}
		}
		return -1; //los null o distintos a nuestra clase los ponemos en las primeras posiciones para "verlos" 
	}


	



}