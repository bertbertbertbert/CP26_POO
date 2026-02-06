package arrayInici;

import java.util.Scanner;

public class termometreKo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int casos = scan.nextInt();
        
		for(int i = 0; i<casos; i++) {
		int k = scan.nextInt();
		int[] arr = new int[k];
		for(int j =0; j<arr.length; j++) {
			arr[j] = scan.nextInt();
		}
		int p = scan.nextInt();
		for(int num : arr) {
			if(num == p) {
				num = -1;
			}
			System.out.print(num + " ");
		}
        System.out.println();
	}
		
	}

}
