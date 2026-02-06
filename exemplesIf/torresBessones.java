package exemplesIf;

import java.util.Scanner;

public class torresBessones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double altura1 = scan.nextDouble();
		double altura2 = scan.nextDouble();
		
		double diferencia;
		
		if(altura1>altura2) {
			diferencia = altura1 - altura2;
		}else {
			diferencia = altura2 - altura1;
		}
		
		if(diferencia <= 5) {
			System.out.print("SI");
		}else {
			System.out.print("NO");
		}

		
	}
		

	}

