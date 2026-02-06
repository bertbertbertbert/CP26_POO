package arrayInici;

import java.util.Scanner;

public class comptarArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		
		int casos = scan.nextInt();
		 
		for(int i = 0; i<casos; i++) {
			int k = scan.nextInt();
			int[] arr = new int[k];
			int cont = 0;
			for(int j = 0; j<arr.length; j++) {
				arr[j] = scan.nextInt();
			}
			int p = scan.nextInt();
			for(int y = 0; y<arr.length; y++) {	
				if(arr[y] == p) {
					cont++;
				}
			}
             System.out.println(cont);
		}
	}

}
