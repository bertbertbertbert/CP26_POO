package iniciacioBucles;

import java.util.Scanner;

public class donnutsAmelia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int casos = scan.nextInt();
		int num1; int num2; int num3;
		int cont;
		for(int i = 0; i < casos; i++) {
			cont = 1;
			num1 = scan.nextInt(); num2 = scan.nextInt(); num3 = scan.nextInt(); 
			while(cont%num1 != 0 && cont%num2 != 0 && cont%num3 != 0) {
				cont ++;
			}
			System.out.println(cont);
		}

	}

}
