package exemplesIf;

import java.util.Scanner;

public class diferencia2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int numMesGran =0;
		int numMesPetit =0;
		int diferencia =0;
		
		if(num1>=num2 && num1>=num3) {
			numMesGran = num1;
		}else if(num2>=num1 && num2>=num3) {
			numMesGran = num2;
		}else if(num3>=num1 && num3>=num2) {
			numMesGran = num3;
		}
		
		if(num1<=num2 && num1<=num3) {
			numMesPetit = num1;
		}else if(num2<=num1 && num2<=num3) {
			numMesPetit = num2;
		}else if(num3<=num1 && num3<=num2) {
			numMesPetit = num3;
		}
		
	    diferencia = numMesGran - numMesPetit;
	    
       System.out.print(diferencia);
	}

}
