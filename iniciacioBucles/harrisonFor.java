package iniciacioBucles;

import java.util.Scanner;

public class harrisonFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int millions;
		int acc=0;
		
		while(acc < 10000000) {
			millions = scan.nextInt();
			acc = acc + millions;
			System.out.println(acc);
		}

	}

}
