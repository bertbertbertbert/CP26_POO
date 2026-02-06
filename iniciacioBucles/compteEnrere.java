	package iniciacioBucles;

import java.util.Scanner;

public class compteEnrere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int numCompteEnrere = scan.nextInt();
		
		while(numCompteEnrere >= 0) {
			System.out.println(numCompteEnrere);
			numCompteEnrere--;
		}

	}

}
