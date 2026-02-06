package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class complintRatios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int casos = scan.nextInt();
		
		for(int i = 0; i<casos; i++) {
			ArrayList<String> lista = new ArrayList<>();
			int n = scan.nextInt();
			scan.nextLine();
			for(int j = 0; j<n; j++) {
				String d = scan.next();
				lista.add(d);
			}
			
			int r = scan.nextInt();
			lista.remove(r);
			for(int y = 0; y<lista.size(); y++) {
				System.out.print(lista.get(y) + " ");
			}
		}

	}

}
