package Uf1286;

import java.util.Scanner;

class FuncionesEjemplo {


	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
	/*	int a = teclado.nextInt();
		teclado.nextLine();
		int y = teclado.nextInt();
		teclado.nextLine();
		int s;
	*/
		
		
		
		/*
		String cadena = "Hola";
		s=suma(5,10);
		System.out.println(s);
		s=suma(a,10);
		System.out.println(s);
		s=suma(a,y);
		System.out.println(s);
		s=suma(y,a);
		System.out.println(s);
		mostrarHola();
		
		System.out.println(resta(4,5));
		*/
		//String dato = teclado.nextLine();
		System.out.println(palindromo("HOhOH"));
		System.out.println(palindromo2("HOhH"));
		System.out.println(burbuja("cama"));
		System.out.println(burbuja("juan"));
		System.out.println(burbuja("damian"));
		System.out.println(burbuja("casa"));
		System.out.println(burbuja("dato"));
		//System.out.println(seleccion("cama"));
		//System.out.println(seleccion("Juan"));
		//System.out.println(seleccion("damian"));
		//System.out.println(seleccion("casa"));
		System.out.println(seleccion("cubierta"));
		
		
		
		
		System.out.println("Encriptación");
		System.out.print("A las 10:30 es la hora del descanso --> ");
		String encriptado = encriptar("A las 10:30 es la hora del descanso");
		System.out.print(encriptado);
		System.out.println(" -- >  " + desencriptar(encriptado));
	}
	
	
	
	
	
	static int suma(int num1, int b)
	{
		int resultado;
		resultado = num1+b+5+7+8+9+3+4;
		return resultado;
		
	}
	
	
	static int resta(int a, int b)
	{
		System.out.println("Vamos a restar");
		int resultado = a - b;
		return resultado;
	}
	
	
	
	static void mostrarHola()
	{
		System.out.println("Hola");
		System.out.println("Esta es una funcion que no devuelve nada");
		
	}
	
	static boolean palindromo(String palabra)
	{
		boolean salida =true;
		int lon = palabra.length();
		
		for(int i = 0; i<lon/2;i++)
		{
			if(palabra.charAt(i)!=palabra.charAt(lon-i-1))
			{
				salida =false;
			}
		}	
		return salida;
		
	}

	static boolean palindromo2(String palabra)
	{
		boolean salida =false;
		int lon = palabra.length();
		String pal2 = "";
		
		for(int i = lon-1; i>=0;i--)
		{
			pal2 =pal2 + palabra.charAt(i);
		}	
		
		if(pal2.equals(palabra))
			salida= true;
		return salida;
		
	}
	
	
	static String burbuja(String palabra)
	{
		int total = 0;
		String salida = "";
		
		int lon = palabra.length();
		char[] palabra2 = new char[lon];
		for(int i = 0; i<lon; i++)
		{
			palabra2[i]=palabra.charAt(i);
		}
		for(int i=0; i<lon-1; i++)
		{
			for(int j=0; j<lon-1-i;j++)
			{
				if(palabra2[j]>palabra2[j+1])
				{
					char aux = palabra2[j+1];
					palabra2[j+1] = palabra2[j];
					palabra2[j]= aux;
				}
				total++;
			}
		}
		
		for(int i=0; i<lon; i++)
		{
			salida=salida +palabra2[i];
		}
		System.out.println(total);
		return salida;
		
	}
	
	
	
	
	
	static String seleccion(String palabra)
	{
		String salida = "";
		int lon = palabra.length();
		char[] palabra2 = new char[lon];
		char mayor;
		int pos;
		for(int i = 0; i<lon; i++)
		{
			palabra2[i]=palabra.charAt(i);
		}
		
		for(int i=0; i<lon; i++)
		{
			mayor=palabra2[0];
			pos=0;
			for(int j=0; j<lon-i;j++)
			{
				if(palabra2[j]>mayor)
				{
					mayor=palabra2[j];
					pos = j;
				}
			}
			//System.out.println("cambio la "+ palabra2[pos] +" a la pos " + (lon-i-1));
			palabra2[pos]=palabra2[lon-i-1];
			palabra2[lon-i-1]=mayor;
		}
		
		for(int i=0; i<lon; i++)
		{
			salida+=palabra2[i];
		}
				
		return salida;
		
	}
	
	static String encriptar(String dato)
	{
		String salida ="";
		
		String alfabetooriginal ="abcdefghijklmnñopqrstuvwxyz0123456789";
		String encriptacion =    "zyxwvutsrqpoñnmlkjihgfedcba9876543210";
		
		int lon = dato.length();
		char[] encriptado= new char[lon];
		
		for(int i=0; i<lon;i++)
		{
			for(int j=0; j<alfabetooriginal.length(); j++)
			{
				if(alfabetooriginal.charAt(j)==dato.charAt(i))
				{
					encriptado[i]=encriptacion.charAt(j);
				}
			}
		}
		
		for(int i = 0; i<lon; i++)
		{
			salida+=encriptado[i];
		}
		
		return salida;
	}
	
	
	static String desencriptar(String dato)
	{
		String salida ="";
		
		String alfabetooriginal ="abcdefghijklmnñopqrstuvwxyz0123456789";
		String encriptacion =    "zyxwvutsrqpoñnmlkjihgfedcba9876543210";
		
		int lon = dato.length();
		char[] desencriptado= new char[lon];
		
		for(int i=0; i<lon;i++)
		{
			for(int j=0; j<encriptacion.length(); j++)
			{
				if(encriptacion.charAt(j)==dato.charAt(i))
				{
					desencriptado[i]=alfabetooriginal.charAt(j);
				}
			}
		}
		
		for(int i = 0; i<lon; i++)
		{
			salida+=desencriptado[i];
		}
		
		return salida;
	}
	
}
