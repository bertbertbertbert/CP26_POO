package exercicisScanner;

import java.util.Scanner;

public class caramels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int caramels = scan.nextInt();
		int nebots = scan.nextInt();
		
		System.out.print(caramels%nebots);
	}

}
