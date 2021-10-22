package uf1289.cuerposCelestes;

// A diferencia de una clase abstracta se puede implementar muchas interfaces en una misma clase
// A diferencia de una clase abstract una interfaz puede heredar de varios otras interfaces (herencia multiple)

public interface Movimiento {

//	todos los atributos definidos en una interfaz son public final y static por defecto

	/* public final static */double VELOCIDAD_LUZ = 299792.458; // Km por segundo
	
	
//	todos los métodos de una interfaz son abstractos a menos que se indique lo contrario
	void traslacion(); // se debe implementar en cada clase que implements Movimiento

//	podemos tener métodos implementados por defecto que luego pueden ser sobreescritos
	default void rotacion() {
		System.out.println("Rotación DEFAULT de la interfaz...");
	}
	
	
	
//	
	
	
}
