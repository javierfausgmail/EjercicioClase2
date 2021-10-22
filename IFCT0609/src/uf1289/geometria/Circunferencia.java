package uf1289.geometria;

public class Circunferencia {

//	Atributos
	private int radio=0;
	private String color;
	
//	Operaciones
	
	public Circunferencia() {

	}

	public Circunferencia( int radio, String color ) {
		
		this.radio = radio;
		this.color = color;
	}
	
	public double getPerimetro() {
		return 2* Math.PI * radio;
	}
	
	public double getArea() {
		return 2 * Math.PI * Math.pow(radio, 2);
	}

	/**
	 * @return the radio
	 */
	public int getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public boolean setRadio(int radio) {
		boolean cambiado=true;
		
		if( radio>=0 &&  radio <= 10)
			this.radio = radio;
		else
			cambiado=false;
		
		return cambiado;
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
