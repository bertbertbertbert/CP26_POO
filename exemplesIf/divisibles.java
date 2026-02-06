package exemplesIf;

import java.util.Scanner;

public class divisibles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if(num%2 == 0 && num%4 == 0 && num%5 == 0 && num%7 == 0) {
			
			System.out.print("SI");
		}else {
			
			System.out.print("NO");
		}


	}

}
