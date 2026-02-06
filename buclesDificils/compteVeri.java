package buclesDificils;

import java.util.Scanner;

public class compteVeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int casos = scan.nextInt();
		int vidaEnemic;
		int VidaRestantEn;
		int atacR;
		int atacT;
		int ronda;
		String matador ="";
		
		for(int i = 0; i < casos; i++) {
			vidaEnemic = scan.nextInt();
			VidaRestantEn = vidaEnemic;
			atacR = scan.nextInt();
			atacT = scan.nextInt();
			ronda = 0;
			while(VidaRestantEn >= 0) {
				ronda++;
				
				
				VidaRestantEn -= atacR;
				if(VidaRestantEn <= 0) {
					matador = "RAMMUS";
					break;
				}
				
				
				VidaRestantEn -= atacT;
				if(VidaRestantEn <= 0) {
					matador = "TWITCH";
				   break;
				}
				
             }
			
			System.out.println(matador +" "+ronda);
			
		}
	}

}

