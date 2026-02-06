package exemplesAND_OR;

import java.util.Scanner;

public class cercaParelles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        
		int c1 = scan.nextInt();
		int c2 = scan.nextInt();
		int c3 = scan.nextInt();
		
		if((c1 == c2) && (c2 == c3)){
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}	

	}

}
