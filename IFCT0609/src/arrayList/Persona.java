package arrayList;

import java.util.Arrays;

public class Persona {

	private String nombre;
	private Asignatura[] asignaturas;
	private int indice;
	
	Persona()
	{
		this.nombre="vacio";
		asignaturas = new Asignatura[20];
		for(int i =0; i<20; i++)
			asignaturas[i]=new Asignatura();
	}
	
	Persona(String nombre)
	{
		this.nombre="vacio";
	}
	
	public Persona(String nombre, Asignatura[] asignaturas, int indice) {
		super();
		this.nombre = nombre;
		this.asignaturas = asignaturas.clone() ;
		this.indice = indice;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Asignatura[] getAsigna() {
		return asignaturas;
	}
	public void setAsignaturas(Asignatura asignaturas) {
		if(indice++<this.asignaturas.length)
		{
			this.asignaturas[indice] = asignaturas;
		}
	}
	


	
	
	
	@Override
	public boolean equals(Object p) {
		boolean igual=false;
		
			if( this.nombre.equals( ((Persona)p).getNombre() )  )
				igual=true;
		
		return igual;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", asignaturas=");
		builder.append(Arrays.toString(asignaturas));
		builder.append(", indice=");
		builder.append(indice);
		builder.append("]");
		return builder.toString();
	}
	
	

	
	
}
