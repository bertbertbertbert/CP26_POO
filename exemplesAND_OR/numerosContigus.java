package exemplesAND_OR;

import java.util.Scanner;

public class numerosContigus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		if (num1 < num2) {
			if ((num1 + 1) == num2) {
				System.out.print("SI");
			} else {
				System.out.print("NO");
			}

		} else if (num2 < num1) {
			if ((num2 + 1) == num1) {
				System.out.print("SI");
			} else {
				System.out.print("NO");
			}
		}

	}

}
