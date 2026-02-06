package iniciacioBucles;

import java.util.Scanner;

public class numerosPositius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int nums = scan.nextInt();
		int count = 0;
		
		while(nums > 0) {
			int numero = scan.nextInt();
			if(numero>0){	
				count++;
			}
						
			nums--;
		}
         System.out.print(count);
	}

}
