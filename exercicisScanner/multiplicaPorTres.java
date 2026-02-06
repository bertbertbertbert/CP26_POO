package exercicisScanner;

import java.util.Scanner;

public class multiplicaPorTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introdueix un nombre");
		int nombre = scan.nextInt();
		
		int resultat = nombre * 3;
		
		System.out.println("El nombre " + nombre + "multiplicat per tres és: " + resultat);

	}

}
