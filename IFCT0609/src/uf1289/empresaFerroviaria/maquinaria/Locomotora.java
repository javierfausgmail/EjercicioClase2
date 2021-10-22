package uf1289.empresaFerroviaria.maquinaria;

import java.io.Serializable;

import uf1289.empresaFerroviaria.personal.Mecanico;

public class Locomotora implements Serializable{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
String matricula;
   int potencia;
   int anyoFabricacion;
   Mecanico mec;
   
   
   
   
   public Locomotora() {
	super();
}

public Locomotora(String matricula, int potencia, int anyoFabricacion, Mecanico mec) {
      this.matricula = matricula;
      this.potencia = potencia;
      this.anyoFabricacion = anyoFabricacion;
      this.mec = mec;
   }

   
   
/**
 * @return the matricula
 */
public String getMatricula() {
	return matricula;
}

/**
 * @param matricula the matricula to set
 */
public void setMatricula(String matricula) {
	this.matricula = matricula;
}

/**
 * @return the potencia
 */
public int getPotencia() {
	return potencia;
}

/**
 * @param potencia the potencia to set
 */
public void setPotencia(int potencia) {
	this.potencia = potencia;
}

/**
 * @return the anyoFabricacion
 */
public int getAnyoFabricacion() {
	return anyoFabricacion;
}

/**
 * @param anyoFabricacion the anyoFabricacion to set
 */
public void setAnyoFabricacion(int anyoFabricacion) {
	this.anyoFabricacion = anyoFabricacion;
}

/**
 * @return the mec
 */
public Mecanico getMec() {
	return mec;
}

/**
 * @param mec the mec to set
 */
public void setMec(Mecanico mec) {
	this.mec = mec;
}



@Override
public String toString() {
	return "Locomotora [matricula=" + matricula + ", potencia=" + potencia + ", anyoFabricacion=" + anyoFabricacion
			+ ", mec=" + mec + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + anyoFabricacion;
	result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
	result = prime * result + ((mec == null) ? 0 : mec.hashCode());
	result = prime * result + potencia;
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
	Locomotora other = (Locomotora) obj;
	if (anyoFabricacion != other.anyoFabricacion)
		return false;
	if (matricula == null) {
		if (other.matricula != null)
			return false;
	} else if (!matricula.equals(other.matricula))
		return false;
	if (mec == null) {
		if (other.mec != null)
			return false;
	} else if (!mec.equals(other.mec))
		return false;
	if (potencia != other.potencia)
		return false;
	return true;
}
}
