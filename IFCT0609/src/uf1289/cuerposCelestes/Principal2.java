package uf1289.cuerposCelestes;

import java.util.ArrayList;
import java.util.Iterator;

import uf1289.geometria.Planeta2;

public class Principal2 {

	public static int calculaRadio(int min, int max) {
		  return (int) Math.floor(Math.random() * (max - min + 1)) + min;
	}
	
	public static void main(String[] args) {
		
		int max = 1000;
		int min = 1;
		
		
		Planeta planeta = new Planeta("Tierra", calculaRadio(min,max), "Azul", 345677f);
		Planeta planeta2 = new Planeta("Marte", 47550f, "naranja", 3677f);
		
		Satelite satelite = new Satelite(2000, "verde", 388, 20000);
		Satelite satelite2 = new Satelite(789,"rojo",321,54322);
		
		
		
		ArrayList<Planeta> planetas = new ArrayList<>();
		planetas.add(planeta2);
		planetas.add(planeta);
		
		ArrayList<Satelite> satelites = new ArrayList<>();
		satelites.add(satelite);
		satelites.add(satelite2);
		
		 
		ArrayList<CuerpoCeleste> cuerposCelestes = new ArrayList<>();
		
		cuerposCelestes.addAll(planetas);
		cuerposCelestes.addAll(satelites);
		
		for (CuerpoCeleste cuerpoCeleste : cuerposCelestes) {
			System.out.println(cuerpoCeleste);
		}
	}

}
