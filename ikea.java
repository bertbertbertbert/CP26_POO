import java.util.Scanner;

public class ikea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
		
        int casos = scan.nextInt();
        
		for(int i = 0; i<casos; i++) {
		int k = scan.nextInt();
		String[] arr = new String[k];
		scan.nextLine();
		for(int j =0; j<arr.length; j++) {
			arr[j] = scan.nextLine();
		}
		
		for(int y = 0; y<arr.length; y++) {
			if(arr[y].startsWith("IKEA")) {
				arr[y] = "PRIVAT";
			}
			System.out.print(arr[y] + " ");
		}
		
		System.out.println();
	
	}
	
	}

}
