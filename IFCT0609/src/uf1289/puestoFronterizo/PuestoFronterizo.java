package uf1289.puestoFronterizo;

public class PuestoFronterizo {

	String [] DNIs;
	String [] nombres;
	int contador=0;
	
	
	PuestoFronterizo(){
		this.DNIs=new String[200];//keep it simple my friend
		this.nombres=new String[200];
	}
	
	void pasoDeFrontera(String nombre, String dni) { 
		
			DNIs[contador] = dni;
			nombres[contador] = nombre;
			contador++;
			
	}
	
	
	void mostrarTodasPersonas() {
		//hacer..
	}
	void buscarDNI(String dni) {
		//hacer...
	}
	
	void buscarNombre( String nombre ){
		// Buscar en mi vector "nombres", y mostrar
		// syso ...
		
	}
	
}
