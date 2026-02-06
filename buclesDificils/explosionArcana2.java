package buclesDificils;

import java.util.Scanner;

public class explosionArcana2 {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Scanner scan = new Scanner(System.in);
				
				int dany = scan.nextInt();
				scan.nextLine();
				int vidaEnemic = scan.nextInt();
				int accDany = 0;
				int cont = 0;
				while(vidaEnemic > 0){
					cont++;
					accDany += dany;
					vidaEnemic -= accDany;
				}
				System.out.print(cont);
				}

			

	}


