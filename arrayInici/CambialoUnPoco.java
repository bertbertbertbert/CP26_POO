package arrayInici;

import java.util.Scanner;

public class CambialoUnPoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int casos = scan.nextInt();
		int[] arr;
		for(int i = 0; i < casos; i++) {
			int K = scan.nextInt();
			arr = new int[K];
			for(int j = 0; j < arr.length; j++) {
				arr[j] = scan.nextInt();
			}
			int p1 = scan.nextInt();
			int p2 = scan.nextInt();
			for(int y = 0; y < arr.length; y++) {
				if (arr[y] == p1) {
					arr[y] = p2;
				}	
			}
            for (int j = 0; j < K; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

		}

	}


