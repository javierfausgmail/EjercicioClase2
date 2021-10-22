package uf1289.herencia;

public class Vehiculo {

	//atributos
	private int ruedas;
	private int tara;
	private int CV;
	private int plazas;
	private String matricula;
	
	
	//constructor vacío o por defecto
	public Vehiculo() {
		ruedas=0;
		tara=0;
		CV=0;
		plazas=0;
		matricula="";
	}
	
	
	
	// Sobrecarga del método constructor Vehiculo con parámetros
	public Vehiculo(int ruedas, int tara, int CV, int plazas, String matricula  ) {
		this.ruedas=ruedas;
		this.tara=tara;
		this.CV=CV;
		this.plazas=plazas;
		this.matricula=matricula;
		
	}
	
	
	
	public int getRuedas() {
		return this.ruedas;
	}
	
	public void setRuedas( int ruedas ) {
		this.ruedas = ruedas;
	}



	/**
	 * @return the tara
	 */
	public int getTara() {
		return tara;
	}



	/**
	 * @param tara the tara to set
	 */
	public void setTara(int tara) {
		this.tara = tara;
	}



	/**
	 * @return the cV
	 */
	public int getCV() {
		return CV;
	}



	/**
	 * @param cV the cV to set
	 */
	public void setCV(int cV) {
		CV = cV;
	}



	/**
	 * @return the plazas
	 */
	public int getPlazas() {
		return plazas;
	}



	/**
	 * @param plazas the plazas to set
	 */
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}



	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}



	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	@Override
	public String toString() {
		return "Vehiculo [ruedas=" + ruedas + ", tara=" + tara + ", CV=" + CV + ", plazas=" + plazas + ", matricula="
				+ matricula + "]";
	}

	
	
	


}
