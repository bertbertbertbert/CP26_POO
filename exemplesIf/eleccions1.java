package exemplesIf;

import java.util.Scanner;

public class eleccions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int votsJiden = scan.nextInt();
		int votsDrump = scan.nextInt();
		int votsBanders = scan.nextInt();
		if(votsJiden>votsDrump && votsJiden>votsBanders) {
			System.out.print("Jiden");
		}else if(votsDrump>votsJiden && votsDrump>votsBanders) {
			System.out.print("Drump");
		}else if(votsBanders>votsJiden && votsBanders>votsDrump) {
			System.out.print("Banders");
		}
	}

}
