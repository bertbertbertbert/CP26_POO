package iniciacioBucles;

import java.util.Scanner;

public class notas {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int nota = scan.nextInt();
    int contDeu = 0;
    int contNotes = 0;
	
		while(nota != -1) {
			
			if(nota == 10) {
				contDeu++; contNotes++;
			}else if(nota >= 0 && nota <=9) {
				contNotes++;
			}
			nota = scan.nextInt();
			
	}
		
		System.out.print("TOTAL NOTES: " + contNotes + " NOTES10: " + contDeu);
}
}
