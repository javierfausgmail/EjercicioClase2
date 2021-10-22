package uf1289;

import java.util.Arrays;


public class CopiaVectores {

	public static void main(String[] args) {
		
		
//		Para arrays de tipo primitivo y/o "inmutables" como String:
		
		String [] nombres = {"pepe","juan"};

		//Copiamos en vector nom[]
		String []nom;
		nom=Arrays.copyOf(nombres, nombres.length+1);
		nom=Arrays.copyOfRange(nombres, 0, nombres.length);
		nom=nombres.clone();

		System.out.println();
		
		
//		String []nom = new String[nombres.length];
		System.arraycopy(nombres, 0, nom, 0, nombres.length);		

		//modificamos vector copiado nom[]
		nom[0]="juan";
		
		System.out.println(nombres[0]);
		System.out.println(nom[0]);
		
	}

}
