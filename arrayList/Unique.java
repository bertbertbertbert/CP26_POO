package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);	
	    int casos = scan.nextInt();
	    
	    for(int i = 0; i<casos; i++) {
	    	int k = scan.nextInt();
	    	scan.nextLine();
	       ArrayList<String> lista = new ArrayList<>();
	   
	       for(int j = 0; j<k; j++) {
	    	  String d = scan.nextLine();
	    	  if(!lista.contains(d)) {
	    		  lista.add(d);
	    	  }
	    	  
	       }
	    	
	       System.out.println(lista);
		

	}

}
}
