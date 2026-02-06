package buclesDificils;

import java.util.Scanner;

public class dobleBucleMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int casos = scan.nextInt();
		int contPositivo = 0;
		int contNegativo = 0;
		String resposta = "";
		for(int i = 0; i < casos; i++) {
			contPositivo++;
			contNegativo = contPositivo;
			for(int j = 0; j < contPositivo; j++) {
				resposta = resposta + contNegativo;
				contNegativo--;
				
				
			}
		}
		System.out.print(resposta);
	}

}
