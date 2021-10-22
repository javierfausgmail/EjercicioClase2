package uf1290.ficheros.serializar.unoAuno;

import java.io.Serializable;
import java.util.Objects;

public class Avion implements Activable, Serializable {

    private static final long serialVersionUID = 1L;
    // Atributos
    private String modelo;
    private int nAsientos;
    private double velocidadMaxima;
    private boolean activado;

    // Constructores
    public Avion() {
        this("", 0, 0);
    }

    public Avion(String modelo, int nAsientos, double velocidadMaxima) {
        this.modelo = modelo;
        this.nAsientos = nAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.activado = false;
    }

    // Metodos o propiedades
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getnAsientos() {
        return nAsientos;
    }

    public void setnAsientos(int nAsientos) {
        this.nAsientos = nAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Avion other = (Avion) obj;
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isActivado() {
        return activado;
    }

    @Override
    public void setActivado(boolean value) {
        this.activado = value;
    }

    @Override
    public String toString() {
        return "Avion{" + "modelo=" + modelo + ", nAsientos=" + nAsientos + ", velocidadMaxima=" + velocidadMaxima + '}';
    }

}
