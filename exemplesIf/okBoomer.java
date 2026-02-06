package exemplesIf;

import java.util.Scanner;

public class okBoomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int dataNaixament = scan.nextInt();
		
		if(dataNaixament>=1945 && dataNaixament<=1965) {
			System.out.print("ok boomer");
		}else {
			System.out.print("nah");
		}
	}

}
