package iniciacioBucles;

import java.util.Scanner;

public class tiradesPerfectes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int tirada = scan.nextInt();
		int tiradasPerfectas = 0;
		
		while(tirada != -1) {
			
			if(tirada == 6) {
				tiradasPerfectas++;
				
			}
			
			tirada = scan.nextInt();
		}

		System.out.println(tiradasPerfectas);

	}

}
