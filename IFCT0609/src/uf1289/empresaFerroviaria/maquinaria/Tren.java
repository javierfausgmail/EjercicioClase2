package uf1289.empresaFerroviaria.maquinaria;

import java.util.Arrays;

import uf1289.empresaFerroviaria.personal.Maquinista;

public class Tren {
    Locomotora locomotora;
    Vagon vagones[];
    Maquinista responsable;
    private int numVagones; 
    
    public Tren(Locomotora locomotora, Maquinista responsable) {
        this.locomotora = locomotora;
        this.responsable = responsable;
        
        vagones = new Vagon[5]; 
        numVagones = 0; 
    }
    
    public void enganchaVagon(int capacidadMax, int capacidadActual, String mercancia) {
        if (numVagones >= 5) {
            System.out.println("El tren no admite más vagones");
        } else {
            Vagon v = new Vagon (capacidadMax, capacidadActual, mercancia);
            vagones[numVagones] = v;
            numVagones ++; 
        }
    }

	@Override
	public String toString() {
		return String.format("Tren [locomotora=%s, vagones=%s, responsable=%s, numVagones=%s]", locomotora,
				Arrays.toString(vagones), responsable, numVagones);
	}

    
    
    
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Tren [locomotora=").append(locomotora).append(", vagones=").append(Arrays.toString(vagones))
//				.append(", responsable=").append(responsable).append(", numVagones=").append(numVagones).append("]");
//		return builder.toString();
//	}

//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Tren [locomotora=");
//		builder.append(locomotora);
//		builder.append(", vagones=");
//		builder.append(Arrays.toString(vagones));
//		builder.append(", responsable=");
//		builder.append(responsable);
//		builder.append(", numVagones=");
//		builder.append(numVagones);
//		builder.append("]");
//		return builder.toString();
//	}   
	
    
	
	
}
