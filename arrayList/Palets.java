package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Palets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
	
		ArrayList<Integer> llista = new ArrayList();

		int allargada = scan.nextInt();
		while (allargada != 0) {
			llista.add(allargada);
			allargada = scan.nextInt();
		}

		int carlota = scan.nextInt();
		int joana = scan.nextInt();
		int valorC = llista.get(carlota-1);
		int valorJ = llista.get(joana-1);
		
		if(valorC<valorJ) {
			System.out.println("CARLOTA");
		}else {
			System.out.println("JOANA");
		}
		
	}

}
