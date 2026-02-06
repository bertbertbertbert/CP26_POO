package inventari;
import java.util.ArrayList;

class Comanda {
	
		private String dni;
		private Producte producte;
		private int quantitat;
		private static ArrayList<Comanda>comandes = new ArrayList<Comanda>();
		
	static public void veureComandes() {
        for(Comanda comanda:comandes) {
      	  System.out.println("DNI: " + comanda.dni);
      	  System.out.println("Producte: " + comanda.producte.nom);
      	  System.out.println("Quantitat: " + comanda.quantitat);
      	
      	  System.out.println("------------------------");
        }
	}
		
	public Comanda(String dni, Producte producte, int quantitat) {
		this.dni = dni;
		this.producte = producte;
		this.quantitat = quantitat;
		comandes.add(this);
	 }	
	    public Comanda() {
	
	}

		public void getTotal() {
		double preuTotal = this.quantitat * this.producte.preu;
		System.out.println("Preu Total: " + preuTotal);
	}
	}

