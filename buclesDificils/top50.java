package buclesDificils;

import java.util.Scanner;

public class top50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int posicio = scan.nextInt();
		int tornejos = scan.nextInt();
		
		for(int i = 0; i < tornejos; i++) {
		  posicio = posicio / 2 ;
		}
		
		System.out.println(posicio);

	}

}
