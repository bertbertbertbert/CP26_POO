package exemplesIf;

import java.util.Scanner;

public class diferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int diferencia;
		
		if(num1>num2) {
			diferencia = num1 - num2;
		}else {
			diferencia = num2 - num1;
		}
		
		System.out.print(diferencia);

	}

}
