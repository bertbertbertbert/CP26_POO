package iniciacioBucles;

import java.util.Scanner;

public class valorMesGranIMesPetit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int numGran=-100000;
		int numPetit=100000;
		int num = scan.nextInt();
		while(num !=0) {
			if(num >= numGran) {
				numGran = num;
			}else if(num <= numPetit) {
				numPetit = num;
			}
			num = scan.nextInt();
		}
		
		System.out.print(numGran + " " + numPetit);

	}

}
