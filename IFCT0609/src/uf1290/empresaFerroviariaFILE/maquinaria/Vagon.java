
package uf1290.empresaFerroviariaFILE.maquinaria;

import java.io.Serializable;

public class Vagon implements Serializable{
	
	private static final long serialVersionUID = -7116872460096274465L;
	
	static String pais = "Spain";
	
	int capacidadMax;
    int capacidadActual;
    String mercancia;

    public Vagon(int capacidadMax, int capacidadActual, String mercancia) {
        this.capacidadMax = capacidadMax;
        this.capacidadActual = capacidadActual;
        this.mercancia = mercancia;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vagon [capacidadMax=").append(capacidadMax).append(", capacidadActual=").append(capacidadActual)
				.append(", mercancia=").append(mercancia).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacidadActual;
		result = prime * result + capacidadMax;
		result = prime * result + ((mercancia == null) ? 0 : mercancia.hashCode());
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
		Vagon other = (Vagon) obj;
		if (capacidadActual != other.capacidadActual)
			return false;
		if (capacidadMax != other.capacidadMax)
			return false;
		if (mercancia == null) {
			if (other.mercancia != null)
				return false;
		} else if (!mercancia.equals(other.mercancia))
			return false;
		return true;
	}
}
