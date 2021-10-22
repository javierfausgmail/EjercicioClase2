package uf1289.cuerposCelestes;

public abstract class CuerpoCeleste extends EsferaAbstracta {
	
	protected float masa;
	
	public CuerpoCeleste() {}
 
	public CuerpoCeleste(float radio) {
		this.radio=radio;
	}

	public CuerpoCeleste(float radio, String color) {
		super(radio,color);
		}

	public CuerpoCeleste(float radio, String color, float masa) {
		super(radio,color);
		this.masa = masa;
	}

	public double getPerimetro() {
		return 2* Math.PI * radio;
	}
	
	public double getArea() {
		return 4 * Math.PI * Math.pow(radio,2);
	}
	
	public double getVolumen() {
		double nucleo= (4/777) * Math.PI * Math.pow(radio, 3); ; // reutilizamos si es posible el código de la clase superior
		return nucleo * 1.8;
	}


	/**
	 * @return the masa
	 */
	public float getMasa() {
		return masa;
	}


	/**
	 * @param masa the masa to set
	 */
	public void setMasa(float masa) {
		this.masa = masa;
	}
}
