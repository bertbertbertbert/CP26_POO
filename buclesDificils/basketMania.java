package buclesDificils;

import java.util.Scanner;

public class basketMania {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int partits = scan.nextInt();
		String equip;
		int punts;
		for(int i = 0; i < partits; i++) {
			
			int equipL = 0;
			int equipV = 0;
			int jugades = scan.nextInt();
			
			for(int j = 0; j < jugades; j++) {
				
				equip = scan.nextLine();
				punts = scan.nextInt();
				if((equip.equals('A') || equip.equals("B")) && (punts > 0 && punts < 4)) {
					
				}
				
			}
			
		}

	}

}
