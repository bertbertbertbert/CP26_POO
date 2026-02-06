package exercicisScanner;

import java.util.Scanner;

public class areaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		double base = scan.nextInt();
		double altura = scan.nextInt();
		
		System.out.print((base * altura) / 2);
	}

}
