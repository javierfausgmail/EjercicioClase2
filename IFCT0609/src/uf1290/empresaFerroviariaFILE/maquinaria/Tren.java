package uf1290.empresaFerroviariaFILE.maquinaria;

import java.io.Serializable;
import java.util.Arrays;

import uf1290.empresaFerroviariaFILE.personal.Maquinista;

public class Tren implements Serializable{
	private static final long serialVersionUID = 2571397067243899522L;
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
            System.out.println("El tren no admite mas vagones");
        } else {
            Vagon v = new Vagon (capacidadMax, capacidadActual, mercancia);
            vagones[numVagones] = v;
            numVagones ++; 
        }
    }



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locomotora == null) ? 0 : locomotora.hashCode());
		result = prime * result + numVagones;
		result = prime * result + ((responsable == null) ? 0 : responsable.hashCode());
		result = prime * result + Arrays.hashCode(vagones);
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
		Tren other = (Tren) obj;
		if (locomotora == null) {
			if (other.locomotora != null)
				return false;
		} else if (!locomotora.equals(other.locomotora))
			return false;
		if (numVagones != other.numVagones)
			return false;
		if (responsable == null) {
			if (other.responsable != null)
				return false;
		} else if (!responsable.equals(other.responsable))
			return false;
		if (!Arrays.equals(vagones, other.vagones))
			return false;
		return true;
	}

    
	@Override
	public String toString() {
		return String.format("Tren [locomotora=%s, vagones=%s, responsable=%s, numVagones=%s]", locomotora,
				Arrays.toString(vagones), responsable, numVagones);
	}
	
    
	
	
}
