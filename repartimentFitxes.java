import java.util.Scanner;

public class repartimentFitxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int resultado;
		
		for(int i = 1; i <= 10; i++) {
			
		  resultado =	num * i;
		  System.out.println(num + " x " + i + " = " + resultado );
			
		}

	}

}
