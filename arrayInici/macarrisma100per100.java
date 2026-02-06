package arrayInici;

import java.util.Locale;
import java.util.Scanner;

public class macarrisma100per100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double[] arr = new double[N];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.nextDouble();
			
           System.out.print((arr[i]*100)+"% ");
		}

	}

}
