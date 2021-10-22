package uf1289.geometria;

public class Planeta2 extends EsferaAbstracta {

//	Atributo
	private String nombre;
	
	public Planeta2(String nombre, float radio) {
		this.radio = radio;
		this.nombre = nombre;
	}
	
	public Planeta2(String nombre, float radio , String color) {
		this.radio = radio;
		this.color= color;
		this.nombre = nombre;
	}
	
	public double getPerimetro() {
		return 2* Math.PI * radio;
	}
	
	public double getArea() {
		return 4 * Math.PI * Math.pow(radio,2);
	}
	
	@Override
	public double getVolumen() {
		double nucleo= (4/3) * Math.PI * Math.pow(radio, 3); ; // reutilizamos si es posible el código de la clase superior
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
		
		Planeta2 otroPlaneta = (Planeta2) objeto;
		
		if( this.nombre.equals( otroPlaneta.getNombre() )) {
			iguales = true;
		}
		
		return iguales;
	}

	
}
