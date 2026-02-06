package arrayInici;

import java.util.Scanner;

public class votacioPatatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int casos=scan.nextInt();
		for(int j = 0; j<casos; j++) {
		int k = scan.nextInt();
		int[]arr = new int[k];
		int winner = -1000;
		for(int i = 0; i < k; i++) {
			 arr[i] = scan.nextInt();
			if(arr[i] > winner) {
			    winner = arr[i];
			}
		}
		int mostrarGanador = 0;
		for(int i = 0; i < arr.length; i++) {		
			if(arr[i] == winner ) {
				mostrarGanador = i + 1;
			}
           
		}
		
		System.out.println(mostrarGanador);
		}
	}

}
