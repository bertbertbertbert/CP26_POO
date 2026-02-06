package alternatives_modul_horres;

import java.util.Scanner;

public class hores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int hora = scan.nextInt();
		int min  = scan.nextInt();
		int sec = scan.nextInt();
		
		if((hora >= 0 && hora <= 23) && (min >= 0 && min <= 59) && (sec >= 0 && sec <= 59)){
			
			System.out.print("SI");
			
		}else{
			
			System.out.print("NO");
		
		}

	}

}
