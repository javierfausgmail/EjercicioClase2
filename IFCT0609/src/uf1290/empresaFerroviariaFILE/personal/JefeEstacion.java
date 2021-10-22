package uf1290.empresaFerroviariaFILE.personal;

import java.io.Serializable;

public class JefeEstacion implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6785642012023560073L;
	String nombre;
    String dni;

    public JefeEstacion(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		JefeEstacion other = (JefeEstacion) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
