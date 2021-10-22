package uf1290.ficheros.serializar.unoAuno;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public abstract class Aeropuerto implements Serializable {

    protected static final long serialVersionUID = 1L;
    private static int id_automerado = 1;

    // Atributos
    private int id;
    private String nombre;
    private Direccion direccion;
    private int anioInauguracion;
    private int capacidad;
    private ArrayList<Avion> aviones;

    // Constructores
    public Aeropuerto() {
        this("", "", "", 0, "", 0, 0);
    }

    public Aeropuerto(String nombre, Direccion direccion, int anioInauguracion, int capacidad) {
        this(nombre, direccion.getPais(),
                direccion.getCalle(),
                direccion.getNumero(),
                direccion.getCiudad(),
                anioInauguracion,
                capacidad);
    }

    public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
        this.id = id_automerado++;
        this.nombre = nombre;
        this.direccion = new Direccion(pais, calle, numero, ciudad);
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
        this.aviones = new ArrayList<>();
    }

    // Metodos o propiedades
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getAnioInauguracion() {
        return anioInauguracion;
    }

    public void setAnioInauguracion(int anioInauguracion) {
        this.anioInauguracion = anioInauguracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public final int aniosAbierto() {

        int anioActual = Calendar.getInstance().get(Calendar.YEAR);

        return anioActual - this.anioInauguracion;

    }

    public void aniadirAvion(Avion a) {

        if (a != null) {
            this.aviones.add(a);
        } else {
            System.out.println("No debe ser nulo");
        }
    }

    public void eliminarAvion(Avion a) {

        if (a != null) {
            this.aviones.remove(a);
        } else {
            System.out.println("No debe ser nulo");
        }
    }

    private String mostrarAviones() {

        String avionesCadena = "";
        for (Avion a : aviones) {
            if (a.isActivado()) {
                avionesCadena += a.toString() + "\n";
            }
        }
        return avionesCadena;

    }

    public abstract void gananciasTotales(double cantidad);

    @Override
    public String toString() {
        return "El aeropuerto con id " + this.id + " y nombre " + nombre + " " + this.direccion + " \n "
                + "Fue inugurado el año " + anioInauguracion + " \n "
                + "y cuenta con una capacidad de " + capacidad + " personas. \n"
                + "Cuenta con los siguientes aviones: \n"
                + mostrarAviones() + "\n";
    }

}
