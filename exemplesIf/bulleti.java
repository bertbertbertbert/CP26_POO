package exemplesIf;

import java.util.Scanner;

public class bulleti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		int nota = scan.nextInt();
		
		if(nota>=0 && nota<=4) {	
			System.out.print("Suspes");
		}else if(nota>=5 && nota<=6) {	
			System.out.print("Aprovat");
		}else if(nota>=7 && nota<=8) {	
			System.out.print("Notable");
		}else if(nota>=9 && nota<=10) {	
			System.out.print("Excelent");
		}

	}

}
