package buclesDificils;

import java.util.Scanner;

public class exclamaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String resposta = "";
		int contApertura;
		int contCierre;
		resposta = scan.nextLine();		
		while(!resposta.equals("FIN")) {
			contApertura = 0;
			contCierre = 0;
			for(int i = 0; i < resposta.length(); i++) {
				if(resposta.charAt(i) == '¡') {
					contApertura ++;
				}else if(resposta.charAt(i) == '!') {
					contCierre++;
				}
			}
			if(contApertura == contCierre) {
				System.out.println("SI");
			}else {
			    System.out.println("NO");
			}			
			resposta = scan.nextLine();

		}
	}

}
