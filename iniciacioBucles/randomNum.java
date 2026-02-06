package iniciacioBucles;

import java.util.ArrayList;
import java.util.Scanner;

public class randomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Pulsa cualquier tecla para hacer el sorteo");
		String next = scan.nextLine();
		
		 ArrayList<String> alumnes = new ArrayList<>();
		// alumnes.add("Alberto"); //no particia
		 alumnes.add("Dai");
		 alumnes.add("Paula");//cambiar por nombres de alumnos
		 alumnes.add("Isaac");
		 alumnes.add("Sergio");
		 
	

		int delegedo = (int) Math.floor(Math.random() * alumnes.size());
		 
		System.out.println("El delegado es: " + alumnes.get(delegedo));
		
	}
		
	}

