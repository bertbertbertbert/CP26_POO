package iniciacioBucles;

import java.util.Scanner;

public class venda {


	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		

		int vueltas = sc.nextInt();


			for (int i = 0; i < vueltas; i++) {
		  		int miVel = sc.nextInt(); 
				 int compaVel = sc.nextInt();
				if (miVel >= compaVel) {

					 int enemyVel = sc.nextInt();
					 int distEnemy = sc.nextInt();
					 int distTorre = sc.nextInt();
			       	 int miTotal=0;
				     int enemyTotal= - distEnemy;
				     int compaTotal=0;		
				boolean tuVivo = true;
				boolean compiVivo = true;
 
				if(distEnemy > 0) {
					
				
				while (miTotal <= distTorre) {
                     miTotal += miVel;
					enemyTotal += enemyVel;				
					if(miTotal <= enemyTotal) {
						tuVivo = false;
					}

				} 
				enemyTotal= 0;
				enemyTotal = enemyTotal - distEnemy;
				while(compaTotal <= distTorre) {
					compaTotal += compaVel;
					enemyTotal += enemyVel;
					if(compaTotal <= enemyTotal) {
						compiVivo = false;
					}
				}
			

                if(tuVivo && compiVivo) {
					System.out.println("SALVATS");

                }else if(tuVivo && !compiVivo) {
					System.out.println("LA VENDA");

                }else if(!tuVivo && !compiVivo) {
					System.out.println("MORTS");

                }
				
				}else {
					System.out.println("MORTS");
					}



			}	
				
			
		} 
		

	}


}
