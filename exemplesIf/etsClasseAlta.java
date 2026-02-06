package exemplesIf;

import java.util.Scanner;

public class etsClasseAlta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int souBrut = scan.nextInt();
		
		if(souBrut >= 30400) {
			
			System.out.print("SI");
			
		}else{
			System.out.print("NO");
		}
		
		scan.close();

	}

}
