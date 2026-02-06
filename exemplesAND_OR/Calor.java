package exemplesAND_OR;

import java.util.Scanner;

public class Calor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int numAlumnes = scan.nextInt();
		int temp = scan.nextInt();
		scan.nextLine();
		String acondicionat = scan.nextLine();
		
		if(temp > 25 && acondicionat.contains("SI") || (numAlumnes > 15 && acondicionat.contains("SI") && temp > 22 && temp <= 25) ) {
			System.out.println("Aire");
		}else if(((temp > 22 && temp <= 25) && numAlumnes > 15 && acondicionat.contains("NO")) || temp > 18 && numAlumnes > 15) {
			System.out.println("Obrir Finestra");
		}else {
			System.out.print("RES");
		}

	}

}
