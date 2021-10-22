package uf1289.geometria;

public abstract class EsferaAbstracta {

//	Atributos
	protected float radio;
	protected String color;
	
//	Operaciones
	
	public abstract double getPerimetro();
	
	public abstract double getArea();
	
	public abstract double getVolumen();
	
	public float getRadio() {
		return radio;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		
		return "Esfera de radio " + radio + "y color "+ color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + Float.floatToIntBits(radio);
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass() )
			return false;
		EsferaAbstracta other = (EsferaAbstracta) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (Float.floatToIntBits(radio) != Float.floatToIntBits(other.radio))
			return false;
		return true;
	}
	
	
	
//	@Override
//	public boolean equals( Object objeto ) {
//		
//		Esfera otraEsfera = (Esfera) objeto;
//		
//		boolean iguales=false;
//		
//		if(radio == otraEsfera.getRadio()  &&  color.equals(otraEsfera.getColor()) ) {
//			iguales = true;
//		}
//		
//		return iguales;
//	}

	
	
}
