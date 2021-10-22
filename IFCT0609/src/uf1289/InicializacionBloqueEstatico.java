package uf1289;

public class InicializacionBloqueEstatico {

    public static double numero;
    private static final int RANGO_MAX; //static + final es OK
    
	
//    final String nombre="hola"; // O inicializamos aqu� o en el constructor
    final String nombre;
    
	static {
		//public static int RANGO_MAX; //debemos quitar modificadores de acceso y static
		
		System.out.println("STATIC BLOCK, solo una vez ocurre");
		numero = 10;
		RANGO_MAX = 100;
		
		//Tambi�n nos podr�a dar la opci�n de utilizar c�digo de gesti�n de excepciones try/catch/finally
		
	}
	
	public void setNombre(String nombre) {
		//this.nombre = nombre; // no se puede hacer esto, al fin y al cabo est� pensado para ser un atributo inmutable
	}
	
	
	
	
	InicializacionBloqueEstatico(){
		this.nombre ="Juan";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InicializacionBloqueEstatico a;
		System.out.println(InicializacionBloqueEstatico.numero);
		System.out.println(InicializacionBloqueEstatico.RANGO_MAX);

		System.out.println("---");
		
		InicializacionBloqueEstatico b = new InicializacionBloqueEstatico();
		System.out.println(b.numero);
		System.out.println(b.RANGO_MAX);
		
		
	}

}
