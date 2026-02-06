package buclesDificils;

import java.util.Scanner;

public class cagaTio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int casos = scan.nextInt();
		String acc = "";
		String cagatio = "";
		int generacions;
		for(int i = 0; i < casos; i++){
			generacions = scan.nextInt();
			acc = "";
		for(int y = 1; y <= generacions; y++){
			
			if(y != 1 && y%2 != 0) {
				acc = acc + "caga";
			}
			
		}
		
		System.out.println("Caga " + acc + "tio!");

	   }
	}

}
