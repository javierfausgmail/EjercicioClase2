package uf1289.examenAnimalPerroGato;

public abstract class Animal {
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
	
	public abstract void visualizar();
	
}
