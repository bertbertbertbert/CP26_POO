package arrayInici;

import java.util.Scanner;

public class bambino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Scanner scan = new Scanner(System.in);
		
		int casos = scan.nextInt();
		int[] arr = new int[casos];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int p = scan.nextInt();
		int cont = 0;
		for(int i : arr) {
			if(p == i) {
				cont++;
			}
		}
		
		System.out.println(cont);

	}

}
