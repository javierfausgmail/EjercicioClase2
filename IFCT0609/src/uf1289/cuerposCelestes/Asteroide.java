package uf1289.cuerposCelestes;

public class Asteroide extends CuerpoCeleste{

//	atributos
	private int semiejeMayor; // en metros
	private float excentricidad; // valor decimal, indica la "deformación" del objeto respecot a una circunferencia perfecta

	
//	métodos
	public Asteroide(float radio, String color, int masa, int semiejeMayor, float excentricidad) {
		super(radio,color,masa);
		this.semiejeMayor = semiejeMayor;
		this.excentricidad = excentricidad;
	}
	
	public Asteroide(int semiejeMayor, float excentricidad) {
		super();
		this.semiejeMayor = semiejeMayor;
		this.excentricidad = excentricidad;
	}

	
	/**
	 * @return the semiejeMayor
	 */
	public int getSemiejeMayor() {
		return semiejeMayor;
	}

	/**
	 * @param semiejeMayor the semiejeMayor to set
	 */
	public void setSemiejeMayor(int semiejeMayor) {
		this.semiejeMayor = semiejeMayor;
	}

	/**
	 * @return the excentricidad
	 */
	public float getExcentricidad() {
		return excentricidad;
	}

	/**
	 * @param excentricidad the excentricidad to set
	 */
	public void setExcentricidad(float excentricidad) {
		this.excentricidad = excentricidad;
	}

	@Override
	public String toString() {
		return "Asteroide [semiejeMayor=" + semiejeMayor + ", excentricidad=" + excentricidad + ", masa=" + masa
				+ ", radio=" + radio + ", color=" + color + "]";
	}
	


}
