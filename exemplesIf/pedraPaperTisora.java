package exemplesIf;

import java.util.Scanner;

public class pedraPaperTisora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		Scanner scan = new Scanner(System.in);
		
		int eleccioJugador1 = scan.nextInt();
		int eleccioJugador2 = scan.nextInt();
		
		if((eleccioJugador1>0 && eleccioJugador1<4)&&(eleccioJugador2>0 && eleccioJugador2<4)) {
			if(eleccioJugador1 == eleccioJugador2) {
				System.out.print("EMPAT");
			}else if((eleccioJugador1 == 1 && eleccioJugador2 == 2) || (eleccioJugador1 == 2 && eleccioJugador2 == 3) || (eleccioJugador1 == 3 && eleccioJugador2 == 1)) {
				System.out.print("JUGADOR2");
			}else if((eleccioJugador2 == 1 && eleccioJugador1 == 2) || (eleccioJugador2 == 2 && eleccioJugador1 == 3) || (eleccioJugador2 == 3 && eleccioJugador1 == 1)) {
				System.out.print("JUGADOR1");
			}
		}else {
			System.out.print("ERROR");
		}

		
	}

}

