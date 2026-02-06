package arraySpicy;

import java.util.Arrays;
import java.util.Scanner;

public class formulaEuler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int casos = scan.nextInt();
		int[] arr;
		
		for(int j = 0; j<casos; j++){
			int k = scan.nextInt();
			arr = new int[k];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		int res = 0;
		int count = 0;
		for(int i = arr.length - 1; i>=arr.length/2; i--) {
			res =  arr[count] + arr[i];
			System.out.print(res + " ");
			count ++;
		}
		System.out.println();
	  }
	}
}

