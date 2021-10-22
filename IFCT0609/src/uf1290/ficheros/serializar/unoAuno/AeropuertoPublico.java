package uf1290.ficheros.serializar.unoAuno;

import java.io.Serializable;

public class AeropuertoPublico extends Aeropuerto implements Serializable{

    private double financiacion;
    private int numTrabajadoresDiscapacitados;

    public AeropuertoPublico() {
        super();
    }

    public AeropuertoPublico(double financiacion, int numTrabajadoresDiscapacitados, String nombre, Direccion direccion, int anioInauguracion, int capacidad) {
        super(nombre, direccion, anioInauguracion, capacidad);
        this.financiacion = financiacion;
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

    public AeropuertoPublico(double financiacion, int numTrabajadoresDiscapacitados, String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
        super(nombre, pais, calle, numero, ciudad, anioInauguracion, capacidad);
        this.financiacion = financiacion;
        this.numTrabajadoresDiscapacitados = numTrabajadoresDiscapacitados;
    }

    public double getFinanciacion() {
        return financiacion;
    }

    public int getNumTrabajadoresDiscapacitados() {
        return numTrabajadoresDiscapacitados;
    }

    @Override
    public void gananciasTotales(double cantidad) {

        double ganacias = cantidad + financiacion + (numTrabajadoresDiscapacitados * 100);

        System.out.println("La ganancia ha sido de " + ganacias);

    }

    @Override
    public String toString() {
        return super.toString() + "El aeropuerto es publico y su financiacion por parte del estado es de " + financiacion + " y hay " + numTrabajadoresDiscapacitados + " trabajadores discapacitados";
    }

}
