package iniciacioBucles;

import java.util.Scanner;

public class elMeuPrimerBucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		while(num != 0) {						
			System.out.println(num + 1);
			
			num = scan.nextInt();
		
		}
	}

}
