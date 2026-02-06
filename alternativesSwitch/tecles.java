package alternativesSwitch;

import java.util.Scanner;

public class tecles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String tecla = scan.nextLine();
		
		switch(tecla) {
		
		case "Q":
			System.out.print("Skill 1");
			break;
		
		case "W":
			System.out.print("Skill 2");
			break;
			
		case "E":
			System.out.print("Skill 3");
			break;
		
		case "R":
			System.out.print("Ultimate");
			break;
			
		case "B":
			System.out.print("Recall");
			break;
			
		case "D", "F":
			System.out.print("Bronzes never use summoners");
			break;

		default:
			System.out.print("Error");
			break;
	
		}

	}

}
