package uf1289.geometria;

public class  Esfera {

//	Atributos
	private float radio;
	private String color;
	
//	Operaciones
	
	public Esfera() {

	}
	
	public Esfera(float radio) {
		this.radio = radio;
	}

	public Esfera( float radio, String color ) {
		
		this.radio = radio;
		this.color = color;
	}
	
	public double getPerimetro() {
		return 2* Math.PI * radio;
	}
	
	public double getArea() {
		return 4 * Math.PI * Math.pow(radio,2);
	}
	
	public double getVolumen() {
		return (4/3) * Math.PI * Math.pow(radio, 3); 
	}
	
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
		Esfera other = (Esfera) obj;
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
