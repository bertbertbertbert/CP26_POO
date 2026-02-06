package iniciacioBucles;

import java.util.Scanner;

public class sumaPatates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int totalPatates = 0;
		int camions = scan.nextInt();
		int patates;
		
		for(int i = 0; i < camions; i++) {
			patates = scan.nextInt();
			totalPatates += patates;
			
		}
		
		System.out.print(totalPatates);

	}

}
