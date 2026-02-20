package concurso;

import java.util.Scanner;

public class caramelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int casos = scan.nextInt();
		
		for(int i = 0; i < casos; i++) {
			System.out.println("aloha1");
			int nPiles = scan.nextInt();
			int nGrups = scan.nextInt();
			int[] grupos = new int[nGrups];
			for(int j = 0; j < nPiles; j++) {
				System.out.println("aloha2 " + j);
     
             grupos[j] += scan.nextInt();
             System.out.println(grupos[j]);
			}
			System.out.println("aloha21");
			for(int k = 0; k < grupos.length; k++) {
				System.out.println(grupos[k]);
				System.out.println("aloha3");
			}
		}

	}

}
