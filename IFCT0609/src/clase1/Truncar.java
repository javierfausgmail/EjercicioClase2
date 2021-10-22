package clase1;

public class Truncar {
	
	
	static void main(String[] args) {
	
//	Java Type Casting
//	Type casting is when you assign a value of one primitive data type to another type.
//
//	In Java, there are two types of casting:
//
//	Widening Casting (automatically) - converting a smaller type to a larger type size
//	byte -> short -> char -> int -> long -> float -> double
//
	
	
	

	int num1 = 4;
	
	float numFloat = 3.0f;
	
	
	numFloat = (float) num1;
	
	num1 = (int) numFloat;
	
	
	
//	Narrowing Casting (manually) - converting a larger type to a smaller size type
//	double -> float -> long -> int -> char -> short -> byte

	
//	Para nuestras clases, en tanto al con cepto de casting podemos hacer referencia en su utilizdad de
//	Polimorfismo de convresión "hacia arriba" y "hacia abajo". Para ello es mejor imaginar la jerarquía de clases (herencia) 
//	en forma de arbol genealógico . Hacia arriba significa subir un paso hacia arriba en el árbol (del hijo al padre) y viceversa para "hacia abajo"  
	
	/*
	 * 
	 *
Profesor p1; //p1 es tipo Profesor (padre). "Admite ser" (referenciar a objeto de tipo) Profesor, ProfesorTitular (hijo) o ProfesorInterino (hijo)

ProfesorInterino p44 = new ProfesorInterino(); //p44 es ProfesorInterino.

p1 = p44; // Conversión hacia arriba: sin problema. Ahora p1 que es tipo profesor, "almacena" (referencia a un objeto de tipo) un profesor interino

pero si tratamos de hacer

p44 = p1 // ERROR en la conversión hacia abajo. El compilador no llega tan lejos como para
saber si p1 almacena un profesor interino u otro tipo de profesor y ante la incertidumbre
 salta un error. La forma de forzar al compilador a que “comprenda” que p1 está almacenando
 un profesor interino y por tanto puede asignarse a una variable que apunta a un 
 profesor interino se llama “hacer casting” o enmascaramiento. Escribiríamos lo siguiente:
 
p44 = (ProfesorInterino) p1;

 
	 * 
	 * 
	 * 
	 */
	
	
	}

}
