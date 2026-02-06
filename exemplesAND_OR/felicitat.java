package exemplesAND_OR;

import java.util.Scanner;

public class felicitat{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        
		int f1 = scan.nextInt();
		int f2 = scan.nextInt();
		int f3 = scan.nextInt();
		
		if((f2 > f1) && (f3 > f2)){
			System.out.println("SI");
		}else {
			System.out.println("NO");
		}	

	}

}
