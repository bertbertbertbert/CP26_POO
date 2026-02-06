package iniciacioBucles;

import java.util.Scanner;

public class intervalNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num2>num1) {
			System.out.println("El segon numero no es mes petit que el primer");
		}else {
			while(num1>=num2) {
				System.out.println(num1);
				num1--;
			}
		}

	}

}
