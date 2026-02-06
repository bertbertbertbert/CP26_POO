package arrayInici;

import java.util.Scanner;

public class escriuArray4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); 
		int k = scan.nextInt();
		int[] arr = new int[k];
		
		for(int i = 0; i<k; i++) {
			arr[i] = scan.nextInt();
		}
		
		int n = scan.nextInt();
		
		for(int i = 0; i<k; i++) {
			System.out.print(" "+(arr[i]+n));
		}
	}

}
