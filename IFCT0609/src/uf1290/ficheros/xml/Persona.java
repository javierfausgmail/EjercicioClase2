package uf1290.ficheros.xml;
public class Persona {

	private String nombre;
	private String apellidos;
	
	public Persona(String nombre, String apellidos) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public Persona() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}