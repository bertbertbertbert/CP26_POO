package iniciacioBucles;

import java.util.Scanner;

public class jugadorsAmbSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int numGran = 0;
         while(num != 0) {
        	 if(num > numGran) {
        		 numGran = num;
        	 }
        	 num = scan.nextInt();
         }
         
         System.out.print(numGran);
	}

}
