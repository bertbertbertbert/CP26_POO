package inventari;
import java.util.ArrayList;
import java.util.Scanner;
public class inventari {
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean sortir = false;
		while(!sortir) {
			
			System.out.println("1.Productes");
			System.out.println("2.Comandes");
			System.out.println("3.Estadóstiques");
			System.out.println("4.Sortir");
			System.out.println("-----------");
			System.out.println("ESCULL OPCIO:");
			int opcio = scan.nextInt();
			switch(opcio) {
			case 1:
				opcioProducte();
				break;
			case 2: 
				opcioComandes();
				break;
			case 3:

				break;
			case 4: 
				sortir=true;
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
		switch(opcio) {
		case 1:
            System.out.println("Introdueix el codi del producte");
			int codi = scan.nextInt();
            System.out.println("Introdueix el nom del producte");
			String nom = scan.next();
            System.out.println("Introdueix el preu del producte");
			int preu = scan.nextInt();	
            System.out.println("Introdueix la quantitat del producte");
			int quantitat = scan.nextInt();	
			new Producte(codi, nom, preu, quantitat);
			System.out.println("Producte enrellistrat");
			break;
		case 2: 
            Producte.veureProductes();
			break;
		case 3:
	          System.out.println("Introdueix el codi del producte");
				codi = scan.nextInt();
	            System.out.println("Introdueix la nova quantitat del producte");
				quantitat = scan.nextInt();
			   modificarEstoc(codi, quantitat);
			break;
		}
		
	  }
	
	static public void opcioComandes() {
		Comanda comanda = new Comanda();
		System.out.println("1.Nova comanda");
		System.out.println("2.Veure comanda d'un client");
		System.out.println("3.Veure totes les comandes");
		int opcio = scan.nextInt();
		switch(opcio) {
		case 1:
            System.out.println("Introdueix el DNI del client");
			String dni = scan.next();
            System.out.println("Introdueix el codi del producte");
			int codi = scan.nextInt();
			Producte p = new Producte();
			boolean existeix = false;
			for(Producte producte : Producte.retornaLlista()) {
				if(producte.codi == codi) {
					p = producte;
					existeix = true;
				}
			}
			if(!existeix) {
				System.out.println("El producte no existeix");
				return;
			}
            System.out.println("Introdueix la quantitat");
			int quantitat = scan.nextInt();	
			comanda = new Comanda(dni, p, quantitat);
			System.out.println("Comanda enrellistrada");
			break;
		case 2:    
			break;
		case 3:
			Comanda.veureComandes();
			comanda.getTotal();
			break;
		}
		
	  }
		
	
	static public void modificarEstoc(int codi, int quantitat) {
     boolean existeix = false;
     for(Producte producte : Producte.retornaLlista()) {
		if(producte.codi == codi) {	
			existeix = true;
	producte.estoc += quantitat;
		System.out.println("Estoc actualitzat");
		}
	} if(!existeix) {
		System.out.println("El producte no existeix");
	}
}
	}

