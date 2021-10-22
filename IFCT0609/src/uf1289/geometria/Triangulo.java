package uf1289.geometria;

public class Triangulo {

//	Atributos
	private int base=0;
	private int altura=0;
	private int lado1=0;
	private int lado2=0;
	private String color;
	
//	Operaciones
	
	public Triangulo() {

	}

	public Triangulo( int base, int lado1, int lado2, int altura, String color ) {
	
		this.base = base;
		this.altura = altura;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.color = color;
	}
	
	public float getPerimetro() {
		return base + lado1 + lado2;
	}
	
	public float getArea() {
		return base * altura/2;
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

	/**
	 * @return the lado1
	 */
	public int getLado1() {
		return lado1;
	}

	/**
	 * @param lado1 the lado1 to set
	 */
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}

	/**
	 * @return the lado2
	 */
	public int getLado2() {
		return lado2;
	}

	/**
	 * @param lado2 the lado2 to set
	 */
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
}
