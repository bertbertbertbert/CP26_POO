package arrayInici;

import java.util.Scanner;

public class escriuArra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		scan.nextLine();
		String[] arr = new String[k];
		
		for(int i = 0; i<k; i++) {
			arr[i] = scan.nextLine();
			System.out.println(arr[i]);
		}
		
		int n = scan.nextInt();
		System.out.println(arr[n]);

	}

}
