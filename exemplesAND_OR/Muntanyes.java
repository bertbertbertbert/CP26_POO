package exemplesAND_OR;

import java.util.Scanner;

public class Muntanyes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		
		if(num1 < num2 && num2 > num3 && num3 < num4 && num4 > num5) {
			System.out.println("SI");
		}else if(num1 > num2 && num2 < num3 && num3 > num4 && num4 < num5) {
			System.out.println("SI");
		}else {
			System.out.println("NO");

		}

	}

}
