package exemplesAND_OR;

import java.util.Scanner;

public class bambino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int N = scan.nextInt();
		
		if((N != A  && N != B && N != C) && N >= 18){
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}	

	}

}
