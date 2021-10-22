package uf1289.examenAnimalPerroGatoFile;



public abstract class Animal implements Comparable<Animal> {
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
