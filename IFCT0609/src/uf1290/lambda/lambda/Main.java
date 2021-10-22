package uf1290.lambda.lambda;

interface StringFunction { //interfaz funcional, tiene un �nico m�todo abstracto
	String run(String str);
}

public class Main{
	
	public static void main(String[] args) {
		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";
		printFormatted("Hello", exclaim);
		printFormatted("Hello", ask);
	}
	public static void printFormatted(String str, StringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}
}