package iniciacioBucles;

import java.util.Scanner;

public class patates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int casos = scan.nextInt();
		int camions;
		int patates;
		int acc;
		for(int i = 0; i < casos; i++){
			camions = scan.nextInt();
			acc = 0;
			for(int y = 0; y < camions; y++) {
				patates = scan.nextInt();
				acc = acc + patates;
			}
			System.out.println(acc);
		}
	}

}
