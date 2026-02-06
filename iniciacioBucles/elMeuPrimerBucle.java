package iniciacioBucles;

import java.util.Scanner;

public class elMeuPrimerBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int casos = scan.nextInt();
		
		while(casos>0) {
			int num = scan.nextInt();
			int resultado = num + 1;
			System.out.println(resultado);
			casos--;
		}

	}

}
