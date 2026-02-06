package iniciacioBucles;

import java.util.Scanner;

public class banana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int casos = scan.nextInt();
        int vida;
        int dany;
        
        for(int i = 0; i < casos; i++) {
        	vida = scan.nextInt();
        	dany = scan.nextInt();
            if(dany<vida) {
            int vintPerCent = vida / 100 * 20;
            if(dany>vintPerCent) {
            	System.out.println("Momento Banana");
            }else {
            	System.out.println("Nope");
            }
            }else {
            	System.out.println("Nope");
            }
        }
        System.out.println("fin");
	}

}
