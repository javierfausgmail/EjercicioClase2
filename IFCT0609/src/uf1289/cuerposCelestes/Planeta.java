package uf1289.cuerposCelestes;

public class Planeta extends CuerpoCeleste implements Movimiento {

//	Atributo
	private String nombre;
	
	public Planeta(String nombre, float radio) {
		super(radio);
		this.nombre = nombre;
	}
	
	
	public Planeta(String nombre, float radio , String color, float masa) {
		super(radio, color, masa);
		this.nombre = nombre;
	}
	
	public void rotacion() {
		System.out.println("planeta en rotación...");
	}
	
	public void traslacion() {
		System.out.println("planeta en traslación...");
	}
	
	@Override
	public double getPerimetro() {
		System.out.println("Perimetro planeta");
		double nucleo= super.getVolumen(); // reutilizamos si es posible el código de la clase superior
		return nucleo * 1.3;// modificación particular para los planetas
	}
	
	@Override
	public double getVolumen() {
		System.out.println("Volumen planeta");
		double nucleo= super.getVolumen(); // reutilizamos si es posible el código de la clase superior
		return nucleo * 1.3;// modificación particular para los planetas
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
