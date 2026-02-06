package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class escriuArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int n = scan.nextInt();
		
		while(n!=-1) {
			lista.add(n);
			n = scan.nextInt();
		}
        
		int k = scan.nextInt();
		
		System.out.println(lista);
		System.out.println(lista.get(k));
	}

}
