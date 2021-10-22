package uf1289.geometria;

public class Rectangulo {

//	Atributos
	private int base=0;
	private int altura=0;
	private String color;
	
//	Operaciones
	
	public Rectangulo() {

	}

	public Rectangulo( int base, int altura, String color ) {
	
		this.base = base;
		this.altura = altura;
		this.color = color;
	}
	
	public float getPerimetro() {
		return 2* base + 2 * altura;
	}
	
	public float calcularArea() {
		return base * altura;
	}
	
	
	public int getBase() {
		return base;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setBase(int nuevaBase) {
		this.base = nuevaBase;
	}
	
	public void setAltura(int nuevaAltura) {
		this.altura=nuevaAltura;
	}
	
}
