package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class colarse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int casos = scan.nextInt();
		
		for(int i = 0; i<casos; i++) {
			ArrayList<Integer> lista = new ArrayList<>();
			int n = scan.nextInt();
			for(int j = 0; j<n; j++) {
				 int p = scan.nextInt();
				 lista.add(p);
			}
			
			int k = scan.nextInt();
			int y = scan.nextInt();
			lista.add(y,k);
			
			for(int z = 0; z<lista.size(); z++) {
				System.out.print(lista.get(z)+" ");
			}
		}

	}

}
