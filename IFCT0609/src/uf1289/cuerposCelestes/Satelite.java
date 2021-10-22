package uf1289.cuerposCelestes;

public class Satelite extends CuerpoCeleste{

	private int distanciaOrbita; //distancia en km al planeta al cual orbita
	
	public Satelite(float radio , String color, float masa , int distanciaOrbita) {
		super(radio,color,masa);
		this.distanciaOrbita = distanciaOrbita;
	}
	
	public float calculaOrbita() {
		// calculas las orbitas del satelite
		float resultado=5;
		return resultado;
	}

	/**
	 * @return the distanciaOrbita
	 */
	public int getDistanciaOrbita() {
		return distanciaOrbita;
	}

	/**
	 * @param distanciaOrbita the distanciaOrbita to set
	 */
	public void setDistanciaOrbita(int distanciaOrbita) {
		this.distanciaOrbita = distanciaOrbita;
	}

	@Override
	public String toString() {
		return "Satelite [distanciaOrbita=" + distanciaOrbita + ", masa=" + masa + ", radio=" + radio + ", color="
				+ color + "]";
	}
	
	

}
