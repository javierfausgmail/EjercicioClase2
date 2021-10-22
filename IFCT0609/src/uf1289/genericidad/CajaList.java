package uf1289.genericidad;

import java.util.ArrayList;

public class CajaList <T>{

	private ArrayList<T> datos;

	/**
	 * @return the dato
	 */
	public T getDato(int index) {
		return datos.get(index);
	}

	/**
	 * @param dato the dato to set
	 */
	public void setDatos(int index, T dato) {
		this.datos.add(index, dato);
	}

	public CajaList() {
		this.datos = new ArrayList<T>();
	}
	
	public CajaList(ArrayList<T> datos) {
		this.datos = datos;
	}
	
	
	
	
}
