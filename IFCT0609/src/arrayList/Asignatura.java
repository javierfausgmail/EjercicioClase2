package arrayList;


public class Asignatura {

	private String nombre;
	private String anyo;

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAnyo() {
		return anyo;
	}
	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}
	
	Asignatura()
	{		
		nombre ="vacia";
		anyo="2000";		
	}
	Asignatura(String nombre, String anyo)
	{
		
		this.nombre = nombre;
		this.anyo = anyo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asignatura [nombre=");
		builder.append(nombre);
		builder.append(", anyo=");
		builder.append(anyo);
		builder.append("]");
		return builder.toString();
	}
}
