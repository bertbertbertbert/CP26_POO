package arrayInici;

import java.util.Scanner;

public class foli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
        int casos = scan.nextInt();
        
		for(int i = 0; i<casos; i++) {
		int k = scan.nextInt();
		 int [] arr = new int[k];
		for(int j =0; j<arr.length; j++) {
			arr[j] = scan.nextInt();
		}
		
		int cont = 0;
		boolean tres = false;
		for(int y = 2; y<arr.length -1 && !tres; y++) {	 
             if(arr[y]-1 == arr[y-1] && arr[y] -2 == arr[y-2]) {
            	 tres = true;
             }
		}
		 if(tres){
			 System.out.println("MILLORA");
		 }else{
			 System.out.println("ESTABLE");
		 }
			
		}

	}

}
