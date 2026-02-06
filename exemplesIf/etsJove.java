package exemplesIf;

import java.util.Scanner;

public class etsJove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int edat = scan.nextInt();
		
		if(edat>=32) {
			System.out.print("NO");
		}else {
			System.out.print("SI");
		}
	}

}
