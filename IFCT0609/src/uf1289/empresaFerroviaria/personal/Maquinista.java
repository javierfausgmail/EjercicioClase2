
package uf1289.empresaFerroviaria.personal;


public class Maquinista {
    String nombre;
    String dni;
    double sueldo;
    String rango;

    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Maquinista [nombre=").append(nombre).append(", dni=").append(dni).append(", sueldo=")
				.append(sueldo).append(", rango=").append(rango).append("]");
		return builder.toString();
	}
}
