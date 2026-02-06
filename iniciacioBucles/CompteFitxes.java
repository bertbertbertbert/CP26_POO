package iniciacioBucles;

import java.util.Scanner;

public class CompteFitxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int numFitxes = scan.nextInt();
		int cont = 1;
		while(cont <= numFitxes) {
			System.out.println(cont);
			cont ++;
		}

	}

}
