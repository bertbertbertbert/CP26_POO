package iniciacioBucles;

import java.util.Scanner;

public class taulaBlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		while(num1>num2) {
		
			 num1 = scan.nextInt();
			 num2 = scan.nextInt();
		}
		
		for(int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
	}

}
