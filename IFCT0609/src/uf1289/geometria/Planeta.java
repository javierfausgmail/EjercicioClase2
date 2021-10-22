package uf1289.geometria;

public class Planeta extends Esfera {

//	Atributo
	private String nombre;
	
	public Planeta(String nombre, float radio) {
		super(radio);
		this.nombre = nombre;
	}
	
	
	public Planeta(String nombre, float radio , String color) {
		super(radio, color);
		this.nombre = nombre;
	}
	
	
	
	@Override
	public double getVolumen() {
		double nucleo= super.getVolumen(); // reutilizamos si es posible el código de la clase superior
		return nucleo * 1.3;
	}
	
	public void setNombre( String nombre ) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString(  ) {
//		return "Soy el planeta " + nombre + " mi radio es " + super.getRadio() + " y color " + super.getColor();
		return "Soy el planeta " + nombre +". "+ super.toString();
	}
	
	
	@Override
	public boolean equals(Object objeto) {
		boolean iguales = false;
		
		if( !super.equals(objeto) ) {
			return false;
		}
		
		Planeta otroPlaneta = (Planeta) objeto;
		
		if( this.nombre.equals( otroPlaneta.getNombre() )) {
			iguales = true;
		}
		
		return iguales;
	}

	
}
