package exercicisScanner;

import java.util.Scanner;

public class sumaDosNombres {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sumaNum1 = scan.nextInt();
		int sumaNum2 = scan.nextInt();
		
		System.out.print(sumaNum1 + sumaNum2);
	}

}
