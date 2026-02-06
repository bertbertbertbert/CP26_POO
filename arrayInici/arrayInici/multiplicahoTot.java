package arrayInici;

import java.util.Scanner;

public class multiplicahoTot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
        int[] arr;
        int casos = scan.nextInt();
        
        for(int i = 0; i<casos; i++) {
        	int k = scan.nextInt();
        	arr = new int[k];
        	for(int j = 0; j < arr.length; j++) {
        		arr[j] = scan.nextInt(); 
        	}
        	
        	int m = scan.nextInt();
        	for(int n : arr) {
        		
        		System.out.print(n*m+" ");
        	}
        }
	}

}
