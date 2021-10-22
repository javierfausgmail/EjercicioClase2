package uf1289.examenAnimalPerroGato;

public class Gato extends Animal implements Comparable<Gato>{
	
	private int vista, oido, reflejos,vidas;

	
	public Gato() {
		super();
		vidas=7;
	}
	
	public Gato(String nombre, String raza) {
		super(nombre, raza);
		vidas=7;
	}

	public Gato(int vista, int oido, int reflejos) {
		 super();
		 this.vista = vista;
		 this.oido = oido;
		 this.reflejos = reflejos;
		 vidas=7;
	 }
	
	public Gato(String nombre, String raza, int vista, int oido, int reflejos) {
		super(nombre, raza);
		this.vista = vista;
		this.oido = oido;
		this.reflejos = reflejos;
		vidas=7;
	 }
	
	public Gato(Gato gato) {
		super(gato.nombre, gato.raza);
		this.vista = gato.vista;
		this.oido = gato.oido;
		this.reflejos = gato.reflejos;
		vidas=gato.vidas;
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

	@Override
	public int compareTo(Gato otroGato) {
		int resultado=0;

		if( this.vidas >  otroGato.vidas ) {
			resultado = 1; //valor positivo, yo voy después que objetoComparado.
		}
		else if(this.vidas <  otroGato.vidas) {
			resultado = -1; // valor negativo, yo voy antes que objetoComparado.
		}
		else {
			resultado=0; // valor cero indica igualdad
		}
		
	return resultado;

	// Se puede simplificar obtenidendo directamente el valor de la resta
	/* Para orden ascendente*/
	//return this.atributo - otroObjeto.atributo;

	/* Para orden descendente */
	//return otroObjeto.atributo - this.atributo;
	}

	
}
