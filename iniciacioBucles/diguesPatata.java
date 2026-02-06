package iniciacioBucles;

import java.util.Scanner;

public class diguesPatata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int max = scan.nextInt();	
		String linea;
        
		for(int i = 0; i <= max; i++) {
			linea = scan.nextLine();
			System.out.println(linea);
		}		
           
	}

}
