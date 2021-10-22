package uf1289.examenAnimalPerroGatoSerializar;

import java.io.Serializable;

public abstract class Animal implements Comparable<Animal>, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8639088342107378062L;
	protected String nombre;
	protected String raza;
	
	
	public Animal() {
		this.nombre = "";
		this.raza = "";
	}
	
	public Animal(String nombre, String raza) {
		this.nombre = nombre;
		this.raza = raza;
	}
	
	public Animal (Animal a) {
		
		this.nombre = a.nombre;
		this.raza = a.nombre;
	}
	
	
	public abstract void visualizar();
	
	
}
