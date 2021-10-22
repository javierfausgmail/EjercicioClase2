package uf1289.genericidad;

import clase1.Alumnos;
import uf1289.Alumno;
import uf1289.texto.Texto;

public class GenericidadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Texto texto = new Texto(200);
		texto.addPrincipio("Hola caracola");
		
		Caja<Texto> cajaTexto = new Caja<>();
		cajaTexto.setDatos(texto);
		
		Texto texto2 = cajaTexto.getDato();
		texto2.mostrar();
		
		Alumno alumno0 = new Alumno("Juan", "Fasus", new String[]{"Mates","Lengua"} , new float[]{1,2,3} );
		Alumno alumno1 = new Alumno("Pedro", "Fasus", new String[]{"Mates","Lengua"} , new float[]{1,2,3} );
		Alumno alumno2 = new Alumno("Mario", "Fasus", new String[]{"Mates","Lengua"} , new float[]{1,2,3} );
		
		
		CajaList<Alumno> cajaAlumnos = new CajaList<>();
		
		cajaAlumnos.setDatos( 0, alumno0);
		cajaAlumnos.setDatos( 1, alumno1);
		cajaAlumnos.setDatos( 2, alumno2);
		
		Alumno alumno3 = cajaAlumnos.getDato(0);
		Alumno alumno4 = cajaAlumnos.getDato(1);
		Alumno alumno5 = cajaAlumnos.getDato(2);

		System.out.println(alumno3.toString());
		System.out.println(alumno4.toString());
		System.out.println(alumno5.toString());
		
		
	}

}
