package uf1289.herencia;

public class Coche extends Vehiculo {

		private String marca;
		private String modelo;
		private String color;
	
		public Coche(){
			super();
			marca="";
			modelo="";
			color="";
		}
		
		public Coche(String marca, String modelo, String color) {
			this();
			this.marca=marca;
			this.modelo=modelo;
			this.color=color;
		}
		
		
		public Coche(int ruedas, int tara, int CV, int plazas, String matricula, String marca, String modelo, String color)
		{
			super(ruedas, tara, CV, plazas, matricula);
			this.marca=marca;
			this.modelo=modelo;
			this.color=color;
		}
		
		
		@Override
		public String toString() {
//			String cadena = super.toString();
			
			String cadena = 
					"Coche "
					+ " [Ruedas: "+ getRuedas()
					+ " Tara: " + getTara()
					+ " CV: " + getCV()
					+ " Plazas: "+ getPlazas()
					+ " Matrícula: "+ getMatricula()
					+ " Marca: "+marca+ " Modelo: "+modelo+" Color: "+color+"]";
				
				return cadena;
		}
		
		
		
		
	
}
