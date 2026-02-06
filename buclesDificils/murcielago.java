package buclesDificils;

import java.util.Scanner;

public class murcielago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	    String resposta ="";
		String paraula = scan.nextLine();
		
		for(int i = 0; i < paraula.length(); i++) {
			if(paraula.contains("a") && paraula.contains("e") && paraula.contains("i") && paraula.contains("o") && paraula.contains("u")) {
				resposta = "TOTES";
			}else {
                resposta = "FALTEN";
			}
		}
		System.out.println(resposta);

	}

}
