package arrayInici;

import java.util.Scanner;

public class escriuArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int K = scan.nextInt();
		
		int[] arr = new int[K];
		
		for(int i = 0; i<K; i++) {
			arr[i] = scan.nextInt();
			System.out.print(" " + arr[i] + " ");
		}
		
		int N = scan.nextInt();
		System.out.println(arr[N]);
			}

}
