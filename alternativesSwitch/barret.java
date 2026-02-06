package alternativesSwitch;

import java.util.Scanner;

public class barret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String resposta = scan.nextLine();
		
		switch(resposta) {
		
		case "Coratge":
			System.out.print("Gryffindor");
		    break;
		 
		case "Coneixement":
			System.out.print("Ravenclaw");
			break;
		
		case "Ambicio":
			System.out.print("Slytherin");
			break;
		
		default:
			System.out.print("Hufflepuff");
		}
	}

}
