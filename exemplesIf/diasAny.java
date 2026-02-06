package exemplesIf;

import java.util.Scanner;

public class diasAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		int numAny = scan.nextInt();
		
		if(numAny >= 1 && numAny <= 365) {
			System.out.println("Correcte per un any no bixest!");
		}else if(numAny >= 1 && numAny <= 366) {
			System.out.println("Correcte per un any bixest!");
		}else {
			System.out.print("Incorrecte!");
		}

	}

}
