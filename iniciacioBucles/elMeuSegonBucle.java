package iniciacioBucles;

import java.util.Scanner;

public class elMeuSegonBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int casos = scan.nextInt();
		int num;
		int num2;
		for(int i = 0; i < casos; i++) {
			num = scan.nextInt();
			
			for(int y = 0; y < num; y++){
				num2 = scan.nextInt();
				int num3 = num2 + 1;
				System.out.println(num3);
		}
	}

}
}