package iniciacioBucles;

import java.util.Scanner;

public class apostesPerdudesEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num;
		int cont = 0;
        for(int i = 0; i < 5; i++) {
        	num = scan.nextInt();
        	if(num < 0) {
        		cont++;
        	}
        }
        
        System.out.print(cont);

	}

}
