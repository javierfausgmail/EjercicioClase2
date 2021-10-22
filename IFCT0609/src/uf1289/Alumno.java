package uf1289;

import java.util.Arrays;

public class Alumno {

//	ATRIBUTOS - Variables que almacenan los valores del alumno
	String nombre;// lectura (get)  y escritura (set)
	String apellidos;
	float [] notas;
	String [] asignaturas;
	float notaMedia;
	
	Alumno amigo;
	
	
//	MÉTODOS - operaciones que trabajas sobre los atributos del alumnos
	
	
	//Métodos constructores
	
	//Constructor vacío o por defecto
	public Alumno(){
		nombre="";
		apellidos="";
		
		notas = new float[3];
		notas[0] = 0;
		notas[1] = 0;
		notas[2] = 0;
		
		asignaturas = new String[3];
		asignaturas[0]="";
		asignaturas[1]="";
		asignaturas[2]="";
		
		notaMedia=0;
		
		amigo = null;
	}
	
	//Constructor copia
	public Alumno(Alumno alumno){
		this.nombre = alumno.getNombre();
		this.apellidos = alumno.getApellidos();
		this.asignaturas = alumno.getAsignaturas();
		this.notas = alumno.getNotas();
		this.notaMedia = alumno.getNotaMedia();
		this.amigo = alumno.getAmigo();
	}
	


	//Sobrecarga del método contructor, con un único parámetro
	public Alumno(String nombre){
		this();
		this.nombre = nombre;	
		
	}
	
	public Alumno(String nombre, String apellidos){
		//this.nombre=nombre;
		this(nombre);
		this.apellidos = apellidos;
		
	}
	
	//Sobrecarga del método constructor,y que está parametrizado 
	public Alumno(String nombre, String apellidos, String[] asignaturas ){
			this(nombre,apellidos);
			//this.asignaturas = asignaturas;
			//Aquí realizamos la copia del vector asignaturas
			if(asignaturas!=null) {
				//this.notas = notas; //copia de referencia a memoria
				
				this.asignaturas = new String[asignaturas.length];
				
				for (int i = 0; i < asignaturas.length; i++) {
					this.asignaturas[i]=asignaturas[i];
				}
					
				
			}
			
			
			
	}
	
	//Sobrecarga del método constructor,y que está parametrizado 
	public Alumno(String nombre, String apellidos, String[] asignaturas, float[] notas ){
		
		this(nombre,apellidos, asignaturas);
		
		if(notas!=null) {
			//this.notas = notas; //copia de referencia a memoria
			
			this.notas = new float[notas.length];
			
			for (int i = 0; i < notas.length; i++) {
				this.notas[i]=notas[i];
			}
					
			calcularNotaMedia();
		}
	}
	
	//Sobrecarga del método constructor,y que está parametrizado 
	public Alumno(String nombre, String apellidos, String[] asignaturas, float[] notas, Alumno amigo ){
		
		this(nombre,apellidos, asignaturas,notas);
		
		if(amigo!=null) {
			//this.amigo = amigo; //copia de referencia a memoria
			this.amigo = (Alumno) amigo.clone();
		}
	}
	
	
	public float calcularNotaMedia() {

		float acum=0;
		if(notas.length > 0) {
			for (int i = 0; i < notas.length; i++) {
				acum += this.notas[i];
			}
			
			this.notaMedia =  acum / (float)notas.length;
		}
		return notaMedia;
	}
	
	
	
	//metodo clonar
	public Object clone() {
		Alumno unClon = new Alumno(this);
		return unClon;
	}
		
	public void setAmigo(Alumno alumno) {
	    this.amigo = (Alumno) alumno.clone();
	}
	
	public Alumno getAmigo() {
	    return (Alumno) this.amigo.clone();
	}
		
	public void setNotaMedia(float notaMedia){
		this.notaMedia = notaMedia;
	}
	
	float getNotaMedia(){
		return this.notaMedia;
	}
	
	String getNombre() {
		return nombre;
	}
	
	void setNombre(String nombre ){
		this.nombre = nombre;
	}
	
	
	void setAsignaturas(String [] asignaturas){
		//this.asignaturas = asignaturas; //copia de referencia a memoria
		
		if(asignaturas!=null) {
			//this.notas = notas; //copia de referencia a memoria
			
			this.asignaturas = new String[asignaturas.length];
			
			for (int i = 0; i < asignaturas.length; i++) {
				this.asignaturas[i]=asignaturas[i];
			}
//			Para arrays de tipo primitivo y/o inmutable como String:
//			this.asignaturas = Arrays.copyOfRange(asignaturas, 0, asignaturas.length);
//			this.asignaturas = Arrays.copyOf(asignaturas, asignaturas.length);
			
//			System.arraycopy(source, 0, dest, 0, source.length);
//			System.arraycopy(asignaturas, 0, this.asignaturas, 0, asignaturas.length);

//			this.asignaturas = asignaturas.clone();
			
		}
	}
	
	String[] getAsignaturas() {
		//return this.asignaturas; //devolvemos copia de referencia a memoria
		
		String [] devolverAsignaturas = new String[asignaturas.length];
		
		for (int i = 0; i < asignaturas.length; i++) {
			devolverAsignaturas[i] = this.asignaturas[i];
		}
//		Para arrays de tipo primitivo y/o inmutable como String:
//		this.asignaturas = Arrays.copyOfRange(asignaturas, 0, asignaturas.length);
//		this.asignaturas = Arrays.copyOf(asignaturas, asignaturas.length);
		
//		System.arraycopy(source, 0, dest, 0, source.length);
//		System.arraycopy(asignaturas, 0, this.asignaturas, 0, asignaturas.length);

//		this.asignaturas = asignaturas.clone();
		
		
		return devolverAsignaturas;
	}
	
	
	
	void setNotas(float [] notas){
		
		if(notas!=null) {
			//this.notas = notas; //copia de referencia a memoria
			
			this.notas = new float[notas.length];
			
			for (int i = 0; i < notas.length; i++) {
				this.notas[i]=notas[i];
			}
//			Para arrays de tipo primitivo:
//			this.notas = Arrays.copyOfRange(notas, 0, notas.length);
//			this.notas = Arrays.copyOf(notas, notas.length);
			
//			System.arraycopy(source, 0, dest, 0, source.length);
//			System.arraycopy(notas, 0, this.notas, 0, notas.length);

//			this.notas = notas.clone();
			
			calcularNotaMedia();
		}
	}
	
	
	float[] getNotas() {
		
		float[] devolverNotas = new float[notas.length];
		
		for (int i = 0; i < notas.length; i++) {
			devolverNotas[i] = this.notas[i];
		}
//		Para arrays de tipo primitivo y/o inmutable como String:
//		this.notas = Arrays.copyOfRange(notas, 0, notas.length);
//		this.notas = Arrays.copyOf(notas, notas.length);
		
//		System.arraycopy(source, 0, dest, 0, source.length);
//		System.arraycopy(notas, 0, this.notas, 0, notas.length);

//		this.notas = notas.clone();
		
		return devolverNotas;
	}
		
	
	float getNota(int indice) {
		return this.notas[indice];
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alumno [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", notas=");
		builder.append(Arrays.toString(notas));
		builder.append(", asignaturas=");
		builder.append(Arrays.toString(asignaturas));
		builder.append(", notaMedia=");
		builder.append(notaMedia);
		builder.append(", amigo=");
		builder.append(amigo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
