package iniciacioBucles;

import java.util.Scanner;

public class apostesSenars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner(System.in);
	
	int num = scan.nextInt();
	
	for(int i = 1; i <= num; i++) {
		if(i%2 != 0) {
			System.out.println(i);
		}
	}
	
	}

}
