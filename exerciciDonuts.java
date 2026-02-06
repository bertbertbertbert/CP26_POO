import java.util.ArrayList;
import java.util.Scanner;

public class exerciciDonuts {
	
	static ArrayList <Integer> llistaDonuts = new ArrayList();
    static Scanner scan = new Scanner(System.in);
    final static double preuDonut = 0.50;
    
	public static void main(String[] args) {
			
		boolean sortir = false;
		while(!sortir) {
			
			System.out.println("1.Regsitrar Venda");
			System.out.println("2.Veure Total Donuts");
			System.out.println("3.Veure Total Vendes");
			System.out.println("4.Veure Mitjana Vendes");
			System.out.println("5.Veure quantes dotzenes s'han venut de cop");
			System.out.println("6.Veure quantes vendes individuals s'han fet");
			System.out.println("7.Veure quantes paquets de + de 20 donuts s'han venut");
			System.out.println("8.Veure l'import total");
			System.out.println("9.Morirem de diabetes avuí?");
			System.out.println("10.Esborrar vendes");
			System.out.println("11.Sortir");
			System.out.println("-----------");
			llistaNumerada();
			System.out.println("ESCULL OPCIO:");
			int opcio = scan.nextInt();
			switch(opcio) {
			case 1:
				registrarVenda();
				break;
			case 2: 
				int totalDonuts = totalDonuts();
				System.out.println("El total de donuts és " + totalDonuts + "\n");
				break;
			case 3:
				int totalVendes = totalVendes();
				System.out.println("El total de vendes és " + totalVendes + "\n");
				break;
			case 4: 
				double mitjana = mitjanaVendes();
				System.out.println("La mitjana és " + mitjana + "\n");
				break;
			case 5: 
                int dotzenes = dotzenes();
                System.out.println("S'han venut " + dotzenes+ " dotzenes" + "\n");
				break;
			case 6: 
                int individuals = vendesIndividuals();
                System.out.println("S'han venut " + individuals+ " individuals" + "\n");
				break;
			case 7: 
                int paquetsGrans = paquetsGrans();
                System.out.println("S'han venut " + paquetsGrans+ " paquets grans" + "\n");
				break;
			case 8: 
                System.out.println("L'import total és " + importTotal() + "\n");
				break;
			case 9: 
				if(totalDonuts()>=100) {
					System.out.println("Sí" + "\n");
				}else {
					System.out.println("No (de moment)" + "\n");
				}
				break;
			case 10: 
				esborrarVendes();
				break;
			case 11: 
				sortir=true;
				System.out.println("Has sortit" + "\n");
				break;
			default:
				System.out.println("Opció incorrecta" + "\n");
			break;
			}
		}

	}
	
	private static void registrarVenda() {
		int quantitat = scan.nextInt();
		if(quantitat>0) {
			llistaDonuts.add(quantitat);
		}
	} 
	
	public static int totalDonuts() {
			int totalDonuts=0;
			for(int i = 0; i<llistaDonuts.size(); i++) {
				totalDonuts += llistaDonuts.get(i);
			}
			return totalDonuts;
	} 
	
	public static int totalVendes() {
		return llistaDonuts.size();	
	} 
	
	public static double mitjanaVendes() {
		int total = totalDonuts();
		int vendes = totalVendes();
		if(total > 0 && vendes > 0) {
			double mitjana = total/vendes;
			return mitjana;
		}else {
			return -1;
		}
	} 
	
	public static int dotzenes() {
		int acc=0;
		for(int i = 0; i<llistaDonuts.size(); i++) {
			if(llistaDonuts.get(i)==12) {
				acc++;
			}
		}
		return acc;
	}
	
	public static int vendesIndividuals() {
		int acc=0;
		for(int i = 0; i<llistaDonuts.size(); i++) {
			if(llistaDonuts.get(i)<5) {
				acc++;
			}
		}
		return acc;
	}

    private static void esborrarVendes() {
        scan.nextLine();
		System.out.println("Estàs segur? S/N");
		String resposta = scan.nextLine();
		if(resposta.equals("S")){
			llistaDonuts.clear();
		}
	}
	
	public static void llistaNumerada() {
    int num = 1;
    for(int i = 0; i<llistaDonuts.size(); i++) {
    	System.out.println("Venda número " + num + ": " + llistaDonuts.get(i)+ " donuts. ");
    	num++;
    }
    System.out.println();
	}
	
	public static int paquetsGrans() {
		int acc=0;
		for(int i = 0; i<llistaDonuts.size(); i++) {
			if(llistaDonuts.get(i)>20) {
				acc++;
			}
		}
		return acc;
	}
	
	public static double importTotal() {
		return totalDonuts() * preuDonut;
	}
	
	
	
	
	
}
