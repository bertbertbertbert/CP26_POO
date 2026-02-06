package buclesDificils;

import java.util.Scanner;

public class dobleBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int cont = 0;
		
		for(int i = 0; i < n; i++) {
			cont++;
			
			for(int y = 0; y < cont; y++) {
				System.out.print(cont);
				
			}
		}
		
	}

}
