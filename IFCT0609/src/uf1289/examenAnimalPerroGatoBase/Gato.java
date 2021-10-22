package uf1289.examenAnimalPerroGatoBase;

public class Gato extends Animal {
	
	private int vista, oido, reflejos,vidas;

	
	
	public Gato() {
		super();
		vista = 0;
		oido = 0;
		reflejos = 0;
		vidas=7;
		
	}
	
	public Gato(String nombre, String raza) {
		super(nombre, raza);
		vidas=7;
	}

	public Gato(int vista, int oido, int reflejos) {
		 super();
		 this.vista = vista;
		 this.oido = oido;
		 this.reflejos = reflejos;
		 vidas=7;
	 }
	
	public Gato(String nombre, String raza, int vista, int oido, int reflejos) {
		super(nombre, raza);
		this.vista = vista;
		this.oido = oido;
		this.reflejos = reflejos;
		vidas=7;
	 }
	
	public Gato(Gato gato) {
		super(gato.nombre, gato.raza);
		this.vista = gato.vista;
		this.oido = gato.oido;
		this.reflejos = gato.reflejos;
		vidas=gato.vidas;
	 }
	
	
	public int escapar() {
		return (this.vista + this.oido + this.reflejos) / 3;
	}

	//Quita una vida y devuelve las que quedan
	public int quitarVida() {
		return --vidas;
	}
	
	public int getVidas() {
		return vidas;
	}
	
	
	@Override
	public void visualizar() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gato [vista=");
		builder.append(vista);
		builder.append(", oido=");
		builder.append(oido);
		builder.append(", reflejos=");
		builder.append(reflejos);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", raza=");
		builder.append(raza);
		builder.append(", vidas=");
		builder.append(vidas);
		builder.append("]");
		return builder.toString();
	}

//	@Override
//	public int compareTo(Gato otroGato) {
//
//		if (this.vidas > otroGato.vidas) {
//			return 1;// devolver un numero POSITIVO significa que YO VOY DESPUES que objetoComparado a la hora de ordenar una collección.
//		} 
//		else if(this.vidas == otroGato.vidas) {
//			return 0; // devolver cero para igual
//		}
//		else {
//			return -1; // devolver un numero NEGATIVO significa que YO VOY ANTES que objetoComparado a la hora de ordenar una collección
//		}
//		
//		
////		return (this.vidas - otroGato.vidas); //cuando se compara atributos con valores numéricos que se pueden restar la instruccion se puede reducir a una simple resta.
//		
//	}
	
	
	@Override
	public int compareTo(Animal otroAnimal) {
		//Comprobar null e instance of
		if(otroAnimal != null) {
			if(otroAnimal instanceof Gato) { //esto es por si implementas herencia al trabajar con objetos de clases superiores que no se te cuele una comparación con objetos de otros subtipos "hermanos" a este
				Gato otroGato = (Gato) otroAnimal;
				return (this.vidas - otroGato.vidas); //cuando se compara atributos con valores numéricos que se pueden restar la instruccion se puede reducir a una simple resta.
			}
			
		}
		return -1;//los null y los NO de nuestro tipo los ponenos delante para "verlos"	... ¿o dejamos que se lance la excepción ?
		
	}
	

	
}
