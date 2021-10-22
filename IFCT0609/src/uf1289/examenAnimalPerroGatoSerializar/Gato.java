package uf1289.examenAnimalPerroGatoSerializar;

import java.util.Comparator;

import java.io.Serializable;


public class Gato extends Animal{

	private static final long serialVersionUID = 2439722227882667692L;
	
	private int vista, oido, reflejos,vidas;

	transient private NoSerializada objetoNoserializado;
//	private NoSerializada objetoNoserializado;
	
	public Gato() {
		super();
		vista = 0;
		oido = 0;
		reflejos = 0;
		vidas=7;
	
		objetoNoserializado=new NoSerializada();
	}
	
	public Gato(String nombre, String raza) {
		super(nombre, raza);
		vidas=7;
		objetoNoserializado=new NoSerializada();
	}

	public Gato(int vista, int oido, int reflejos) {
		 super();
		 this.vista = vista;
		 this.oido = oido;
		 this.reflejos = reflejos;
		 vidas=7;
		 objetoNoserializado=new NoSerializada();
	 }
	
	public Gato(String nombre, String raza, int vista, int oido, int reflejos) {
		super(nombre, raza);
		this.vista = vista;
		this.oido = oido;
		this.reflejos = reflejos;
		vidas=7;
		objetoNoserializado=new NoSerializada();
	 }
	
	public Gato(Gato gato) {
		super(gato.nombre, gato.raza);
		this.vista = gato.vista;
		this.oido = gato.oido;
		this.reflejos = gato.reflejos;
		vidas=gato.vidas;
		objetoNoserializado=gato.objetoNoserializado;
	 }
	
	
	public int escapar() {
		return (this.vista + this.oido + this.reflejos) / 3;
	}

	//Quita una vida y devuelve las que quedan
	public int quitarVida() {
		return --vidas;
	}
	
	public int getVidas() {
		return vidas;
	}
	
	
	@Override
	public void visualizar() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gato [vista=");
		builder.append(vista);
		builder.append(", oido=");
		builder.append(oido);
		builder.append(", reflejos=");
		builder.append(reflejos);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", raza=");
		builder.append(raza);
		builder.append(", vidas=");
		builder.append(vidas);
		builder.append("]");
		return builder.toString();
	}

//	@Override
//	public int compareTo(Gato otroGato) {
//
//		if (this.vidas > otroGato.vidas) {
//			return 1;// devolver un numero POSITIVO significa que YO VOY DESPUES que objetoComparado a la hora de ordenar una collección.
//		} 
//		else if(this.vidas == otroGato.vidas) {
//			return 0; // devolver cero para igual
//		}
//		else {
//			return -1; // devolver un numero NEGATIVO significa que YO VOY ANTES que objetoComparado a la hora de ordenar una collección
//		}
//		
//		
////		return (this.vidas - otroGato.vidas); //cuando se compara atributos con valores numéricos que se pueden restar la instruccion se puede reducir a una simple resta.
//		
//	}
	
	
	@Override
	public int compareTo(Animal otroAnimal) {
		//Comprobar null e instance of
		if(otroAnimal != null) {
			if(otroAnimal instanceof Gato) { //esto es por si implementas herencia al trabajar con objetos de clases superiores que no se te cuele una comparación con objetos de otros subtipos "hermanos" a este
				Gato otroGato = (Gato) otroAnimal;
				return (this.vidas - otroGato.vidas); //cuando se compara atributos con valores numéricos que se pueden restar la instruccion se puede reducir a una simple resta.
			}
			
		}
		return -1;//los null y los NO de nuestro tipo los ponenos delante para "verlos"	... ¿o dejamos que se lance la excepción ?
		
	}
	

	
	public static Comparator<Gato> ComparadorVidas = new Comparator<Gato>() {

		public int compare(Gato gato1, Gato gato2) {
	
			int gatoVidas1 = gato1.getVidas();//.toUpperCase()  
			int gatoVidas2 = gato2.getVidas();//.toLowerCase()
	
			//orden ascendente
			return gatoVidas1 - gatoVidas2; //por orden ascendente
	}};


	public static Comparator<Gato> ComparadorVista = new Comparator<Gato>() {

		public int compare(Gato gato1, Gato gato2) {
			return gato1.getVista() - gato2.getVista(); //por orden ascendente
		}};


	public static Comparator<Gato> ComparadorOido = new Comparator<Gato>() {

		public int compare(Gato gato1, Gato gato2) {
			return gato1.getOido() - gato2.getOido(); //por orden ascendente
		}};

	public static Comparator<Gato> ComparadorReflejos = new Comparator<Gato>() {

		public int compare(Gato gato1, Gato gato2) {
			return gato1.getReflejos() - gato2.getReflejos(); //por orden ascendente
		}};


			/**
			 * @return the vista
			 */
			public int getVista() {
				return vista;
			}

			/**
			 * @param vista the vista to set
			 */
			public void setVista(int vista) {
				this.vista = vista;
			}

			/**
			 * @return the oido
			 */
			public int getOido() {
				return oido;
			}

			/**
			 * @param oido the oido to set
			 */
			public void setOido(int oido) {
				this.oido = oido;
			}

			/**
			 * @return the reflejos
			 */
			public int getReflejos() {
				return reflejos;
			}

			/**
			 * @param reflejos the reflejos to set
			 */
			public void setReflejos(int reflejos) {
				this.reflejos = reflejos;
			}

			/**
			 * @return the comparadorVidas
			 */
			public static Comparator<Gato> getComparadorVidas() {
				return ComparadorVidas;
			}

			/**
			 * @param comparadorVidas the comparadorVidas to set
			 */
			public static void setComparadorVidas(Comparator<Gato> comparadorVidas) {
				ComparadorVidas = comparadorVidas;
			}

			/**
			 * @return the comparadorVista
			 */
			public static Comparator<Gato> getComparadorVista() {
				return ComparadorVista;
			}

			/**
			 * @param comparadorVista the comparadorVista to set
			 */
			public static void setComparadorVista(Comparator<Gato> comparadorVista) {
				ComparadorVista = comparadorVista;
			}

			/**
			 * @param vidas the vidas to set
			 */
			public void setVidas(int vidas) {
				this.vidas = vidas;
			}

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + oido;
				result = prime * result + reflejos;
				result = prime * result + vidas;
				result = prime * result + vista;
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
				Gato other = (Gato) obj;
				if (oido != other.oido)
					return false;
				if (reflejos != other.reflejos)
					return false;
				if (vidas != other.vidas)
					return false;
				if (vista != other.vista)
					return false;
				return true;
			}
	
}
