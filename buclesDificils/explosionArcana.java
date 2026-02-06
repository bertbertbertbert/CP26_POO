package buclesDificils;

import java.util.Scanner;

public class explosionArcana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int dany = scan.nextInt();
		scan.nextLine();
		int atacs = scan.nextInt();
		int accDany = 0;
		int accTotal = 0;
		
		for(int i = 0; i < atacs; i++) {
			accDany += dany;
			
			accTotal += accDany;
		}
		System.out.print(accTotal);
		}

	}


