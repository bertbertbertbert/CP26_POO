package concurso;

import java.util.Scanner;

public class DanyCritic {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);


		String casos = sc.nextLine();

		int posicionizq = 0;

		int posiciondrch = 0;

		while (casos != "END") {

			String letra = sc.nextLine();

			posicionizq = casos.indexOf(letra) - casos.length();

			posiciondrch = casos.lastIndexOf(letra) - casos.length();

			System.out.println(casos);

			if (posicionizq > posiciondrch) {

				System.out.println(posiciondrch + "->");

			} else if (posiciondrch > posicionizq) {

				System.out.println(posicionizq + "<-");

			}

			casos = sc.nextLine();

		}
	
}
}
