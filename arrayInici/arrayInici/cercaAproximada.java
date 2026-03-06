package arrayInici;

import java.util.Scanner;

public class cercaAproximada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
        int[]arr = null;
		int casos=scan.nextInt();

		for(int j = 0; j<casos; j++) {
		int k = scan.nextInt();
		arr = new int[k];

		for(int i = 0; i < k; i++) {
			 arr[i] = scan.nextInt();

           }

		 int numPeu = scan.nextInt();

	    String res = "NO";

		for (int element : arr) {
			if(element == numPeu || element + 1 == numPeu || element-1 == numPeu) {
				res = "SI";
			}
		}
		System.out.println(res);
		}

		}

	}


