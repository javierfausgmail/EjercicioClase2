package uf1290.ficheros.serializar.unoAuno;

import java.io.Serializable;

public class Direccion implements Serializable{

    private static final long serialVersionUID = 1L;
    private String pais;
    private String calle;
    private int numero;
    private String ciudad;

    public Direccion() {
        this("", "", 0, "");
    }

    public Direccion(String pais, String calle, int numero, String ciudad) {
        this.pais = pais;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "esta en el pais " + pais + " en la direccion: \n "
                + "calle " + calle + ", numero " + numero + ", ciudad " + ciudad + ".";
    }

}
