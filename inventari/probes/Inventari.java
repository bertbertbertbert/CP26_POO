package probes;

import java.util.Scanner;

public class Inventari {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean sortir = false;
		while (!sortir) {
			System.out.println("1.Productes.");
			System.out.println("2.Comandes");
			System.out.println("3.Estadístiques");
			System.out.println("4.Sortir");
			System.out.println("-----------");
			System.out.println("ESCULL OPCIO:");
			int opcio = scan.nextInt();
			switch (opcio) {
				case 1:
					opcioProducte();
					break;
				case 2:
					opcioComandes();
					break;
				case 3:
					opcioInformes();
					break;
				case 4:
					sortir = true;
					System.out.println("Has sortit" + "\n");
					break;
				default:
					System.out.println("Opció incorrecta" + "\n");
					break;
			}
		}
	}

	public static void opcioProducte() {
		System.out.println("1.Introduir producte");
		System.out.println("2.Llista productes");
		System.out.println("3.Modificar stock");
		int opcio = scan.nextInt();
		switch (opcio) {
			case 1:
				System.out.println("Introdueix el codi del producte");
				int codi = scan.nextInt();
				// validacio del codi amb una funcio apart
				if (!validacions.validacioCodi(codi)) {
					System.out.println("Codi incorrecte o repetit");
					return;
				}

				System.out.println("Introdueix el nom del producte");
				String nom = scan.next();

				// validacio del preu amb una funcio apart
				System.out.println("Introdueix el preu del producte");
				double preu = scan.nextDouble();
				if (!validacions.validacioPreu(preu)) {
					System.out.println("Preu incorrecte a de ser mayor a 0");
					return;
				}

				// validacio quantitat amb una funcio apart
				System.out.println("Introdueix la quantitat del producte");
				int quantitat = scan.nextInt();
				if (!validacions.validacioQuantitat(quantitat, codi)) {
					System.out.println("Quantitat introduida 0 o estoc insuficient");
					return;
				}

				// si tot está bé creem un objecte Producte i enviem els valors
				new Producte(codi, nom, preu, quantitat);
				System.out.println("Producte enrellistrat");
				break;

			case 2:
				// cridem a la funció d'aquesta clase per veure tots els productes
				Producte.veureProductes();
				break;

			case 3:
				System.out.println("Introdueix el codi del producte");
				codi = scan.nextInt();
				System.out.println("Qué vols fer, sumar o resta stock? (S/R)");
				String operacio = scan.next();
				System.out.println("Introdueix la quantitat del producte");
				quantitat = scan.nextInt();
				modificarEstoc(codi, quantitat, operacio);
				break;
		}

	}

	static public void opcioComandes() {
		System.out.println("1.Nova comanda");
		System.out.println("2.Veure comanda d'un client");
		System.out.println("3.Veure totes les comandes");
		int opcio = scan.nextInt();
		switch (opcio) {
			case 1:
				System.out.println("Introdueix el DNI del client");
				String dni = scan.next();

				// VALIDACIO DNI
				if (!validacions.validacioDNI(dni)) {
					System.out.println("DNI incorrecte o repetit");
					return;
				}

				System.out.println("Introdueix el codi del producte");
				int codi = scan.nextInt();
				boolean existeix = false;
				Producte p = null;
				for (Producte producte : Producte.productes) {
					if (producte.codi == codi) {
						p = producte;
						existeix = true;
					}
				}
				if (!existeix) {
					System.out.println("El producte no existeix");
					return;
				}
				System.out.println("Introdueix la quantitat");
				int quantitat = scan.nextInt();
				new Comanda(dni, p, quantitat);
				System.out.println("Comanda enrellistrada");
				break;
			case 2:
				existeix = false;
				System.out.println("Introdueix el DNI del client del que vols veure les comandes");
				dni = scan.next();
				for (Comanda comanda : Comanda.comandes) {
					if (comanda.dni.equals(dni)) {
						existeix = true;
						System.out.println("Producte: " + comanda.producte.nom);
						System.out.println("Quantitat: " + comanda.quantitat);
						System.out.println("Preu Total: " + comanda.preuTotal);
						System.out.println("------------------------");
					}
				}
				if (!existeix) {
					System.out.println("El DNI no existeix");
				}
				break;
			case 3:
				Comanda.veureComandes();
				break;
		}
	}

	public static void opcioInformes() {
		System.out.println("1.Vuere productes sota mínims");
		System.out.println("2.Veure vendes totals");
		System.out.println("3.Veure producte més venut");
		int opcio = scan.nextInt();
		switch (opcio) {
			case 1:
				Informes.veurePorducteSotaMinims();
				break;
			case 2:
				Informes.veureTotalVendes();
				break;
			case 3:
				Informes.veurePorducteMesVenut();
				break;

		}
	}

	static public void modificarEstoc(int codi, int quantitat, String operacio) {
		boolean existeix = false;
		for (Producte producte : Producte.productes) {
			if (producte.codi == codi) {
				existeix = true;
				if (operacio.equals("S")) {
					producte.estoc += quantitat;
				} else if (operacio.equals("R")) {
					if (producte.estoc >= quantitat) {
						producte.estoc -= quantitat;
					} else {
						System.out.println("Estoc insuficient");
						return;
					}
				}
				System.out.println("Estoc actualitzat");
			}
		}
		if (!existeix) {
			System.out.println("El producte no existeix");
		}
	}

}
