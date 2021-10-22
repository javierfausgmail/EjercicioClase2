package uf1289.examenAnimalPerroGatoSerializarObjeto;

import java.io.Serializable;

public class Perro extends Animal{

	private static final long serialVersionUID = 4540079968960897955L;
	
		private int mordisco;
		private int velocidad;
		private int olfato;
		private int gatosCazados;
		
		
		
		public Perro() {
			super();
			
		}

		public Perro(String nombre, String raza) {
			super(nombre, raza);
		}
		
		public Perro(int mordisco, int velocidad, int olfato) {
			super();
			this.mordisco = mordisco;
			this.velocidad = velocidad;
			this.olfato = olfato;
		}
		
		
		public Perro(String nombre, String raza, int mordisco, int velocidad, int olfato) {
			this( mordisco, velocidad, olfato);
			this.nombre = nombre;
			this.raza = raza;
		}
		
		
		public Perro(Perro perro) {
			this.mordisco = perro.mordisco;
			this.velocidad = perro.velocidad;
			this.olfato = perro.olfato;
			this.gatosCazados = perro.gatosCazados;
		}

		
		public int getMordisco() {
			return mordisco;
		}
		public void setMordisco(int mordisco) {
			this.mordisco = mordisco;
		}
		public int getVelocidad() {
			return velocidad;
		}
		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}
		public int getOlfato() {
			return olfato;
		}
		public void setOlfato(int olfato) {
			this.olfato = olfato;
		}

		public int getGatosCazados() {
			return gatosCazados;
		}

		
		public boolean cazar(Gato gato) {
			if( (mordisco + olfato + velocidad)/3  > gato.escapar() ) {
				gatosCazados++;
				gato.quitarVida();
				return true;
			}
			else
				return false;
		}
		
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Perro [mordisco=");
			builder.append(mordisco);
			builder.append(", velocidad=");
			builder.append(velocidad);
			builder.append(", olfato=");
			builder.append(olfato);
			builder.append(", nombre=");
			builder.append(nombre);
			builder.append(", raza=");
			builder.append(raza);
			builder.append(", gatosCazados(vidas)=");
			builder.append(gatosCazados);
			builder.append("]");
			return builder.toString();
		}
		
		@Override
		public void visualizar() {
			System.out.println( this );			
		}

//		@Override
//		public int compareTo(Perro otroPerro) {
//
//			if (this.gatosCazados > otroPerro.gatosCazados) {
//				return 1;// devolver un numero POSITIVO significa que YO VOY DESPUES que objetoComparado a la hora de ordenar una collección.
//			} 
//			else if(this.gatosCazados == otroPerro.gatosCazados) {
//				return 0; // devolver cero para igual
//			}
//			else {
//				return -1; // devolver un numero NEGATIVO significa que YO VOY ANTES que objetoComparado a la hora de ordenar una collección
//			}
//			
//			
////			return (this.gatosCazados - otroPerro.gatosCazados); //cuando se compara atributos con valores numéricos que se pueden restar la instruccion se puede reducir a una simple resta.
//			
//		}

		@Override
		public int compareTo(Animal otroAnimal) {
			
			//Comprobar null e instance of
			if(otroAnimal != null) {
				if(otroAnimal instanceof Perro) { //esto es por si implementas herencia al trabajar con objetos de clases superiores que no se te cuele una comparación con objetos de otros subtipos "hermanos" a este
					Perro otroPerro = (Perro) otroAnimal;
					return (this.gatosCazados - otroPerro.gatosCazados); //cuando se compara atributos con valores numéricos que se pueden restar la instruccion se puede reducir a una simple resta.
				}
				
			}
			return -1;//los null y los NO de nuestro tipo los ponenos delante para "verlos"	... ¿o dejamos que se lance la excepción ?
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + gatosCazados;
			result = prime * result + mordisco;
			result = prime * result + olfato;
			result = prime * result + velocidad;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Perro other = (Perro) obj;
			if (gatosCazados != other.gatosCazados)
				return false;
			if (mordisco != other.mordisco)
				return false;
			if (olfato != other.olfato)
				return false;
			if (velocidad != other.velocidad)
				return false;
			return true;
		}

		

}
