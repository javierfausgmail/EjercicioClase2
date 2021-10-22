package uf1289.examenAnimalPerroGato;

import comparableANDcomparator.EstudianteComparable;

public class Perro extends Animal implements Comparable<Perro> {
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
			builder.append(", gatosCazados=");
			builder.append(gatosCazados);
			builder.append("]");
			return builder.toString();
		}
		@Override
		public void visualizar() {
			System.out.println(this);			
		}

	

		@Override
		public int compareTo(Perro otroPerro) {
			
			int resultado=0;

				if( this.gatosCazados >  otroPerro.gatosCazados ) {
					resultado = 1; //valor positivo, yo voy después que objetoComparado.
				}
				else if(this.gatosCazados <  otroPerro.gatosCazados) {
					resultado = -1; // valor negativo, yo voy antes que objetoComparado.
				}
				else {
					resultado=0; // valor cero indica igualdad
				}
				
			

			return resultado;

			// Se puede simplificar obtenidendo directamente el valor de la resta
			/* Para orden ascendente*/
			//return this.edad - edadObjetoComparado;

			/* Para orden descendente */
			//return edadObjetoComparado - this.edad;
			
		}

}
