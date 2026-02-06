package exemplesIf;

import java.util.Scanner;

public class diesSetmanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int numDia = scan.nextInt();
		String dia ="";
		
		switch(numDia){
		case 1:
			dia = "Monday";
			break;
		case 2: 
			dia = "Tuesday";
		    break;
		case 3: 
			dia = "Wednesday";
			break;
		case 4:
			dia = "Thursday";
			break;
		case 5:
			dia = "Friday";
			break;
		case 6:
			dia = "Saturday";
			break;
		case 7:
			dia = "Sunday";
			break;
		default:
			break;
		}
       
		System.out.print(dia);

	}

}
