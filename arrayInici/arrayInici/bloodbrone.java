package arrayInici;

import java.util.Scanner;

public class bloodbrone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int casos=scan.nextInt();
		for(int j = 0; j<casos; j++) {
		int k = scan.nextInt();
		int[]arr = new int[k];
		
		for(int i = 0; i < k; i++) {
			 arr[i] = scan.nextInt();
		}
		String iguals = "NO";
		for(int i = 0; i < arr.length-1; i++) {		
			if(arr[i] == arr[i+1] ) {
                iguals = "SI";
			}
           
		}
		
		System.out.println(iguals);
		}
	}

}
