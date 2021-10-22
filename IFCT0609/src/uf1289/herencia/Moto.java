package uf1289.herencia;

public class Moto extends VehiculoAbstracto{
	int velocidadMax;
	float consumo;
	
	
	
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Moto(int ruedas, int tara, int CV, int plazas, String matricula, int velocidadMax, float consumo) {
		super(ruedas, tara, CV, plazas, matricula);
		this.velocidadMax=velocidadMax;
		this.consumo=consumo;
			
	}
	
	public Moto(int velocidadMax, float consumo) {
		super();
		this.velocidadMax = velocidadMax;
		this.consumo = consumo;
	}

	/**
	 * @return the velocidadMax
	 */
	public int getVelocidadMax() {
		return velocidadMax;
	}

	/**
	 * @param velocidadMax the velocidadMax to set
	 */
	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	/**
	 * @return the consumo
	 */
	public float getConsumo() {
		return consumo;
	}

	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Moto [velocidadMax=" + velocidadMax + ", consumo=" + consumo + ", ruedas=" + getRuedas() + ", tara=" + getTara()
				+ ", CV=" + getCV() + ", plazas=" + getPlazas() + ", matricula=" + getMatricula() + "]";
	}
	
	
	
	
	
}
