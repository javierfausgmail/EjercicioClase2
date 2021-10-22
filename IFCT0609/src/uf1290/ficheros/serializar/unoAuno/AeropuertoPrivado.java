package uf1290.ficheros.serializar.unoAuno;

import java.io.Serializable;

public class AeropuertoPrivado extends Aeropuerto implements Serializable{

    private int numSocios;

    public AeropuertoPrivado() {
        super();
    }

    public AeropuertoPrivado(int numSocios, String nombre, Direccion direccion, int anioInauguracion, int capacidad) {
        super(nombre, direccion, anioInauguracion, capacidad);
        this.numSocios = numSocios;
    }

    public AeropuertoPrivado(int numSocios, String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
        super(nombre, pais, calle, numero, ciudad, anioInauguracion, capacidad);
        this.numSocios = numSocios;
    }

    public int getNumSocios() {
        return numSocios;
    }

    public void setNumSocios(int numSocios) {
        this.numSocios = numSocios;
    }

    @Override
    public void gananciasTotales(double cantidad) {

        double ganancia = cantidad / this.numSocios;

        System.out.println("La cantidad ganada por cada socio es de " + ganancia);

    }

    @Override
    public String toString() {
        return super.toString() + " Es privado y tiene " + numSocios + " socios";
    }

}
