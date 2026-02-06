package inventari;
import java.util.ArrayList;

public class Producte {
	protected int codi; 
	protected String nom; 
	protected double preu; 
	protected int estoc;
	private static ArrayList<Producte>productes = new ArrayList<Producte>();
	
	public static void veureProductes() {
          for(Producte producte:productes) {
        	  System.out.println("Nom: " + producte.nom);
        	  System.out.println("Codi: " + producte.codi);
        	  System.out.println("Preu: " + producte.preu);
        	  System.out.println("estoc: " + producte.estoc);
        	  System.out.println("------------------------");
          }
	}

	public Producte(int codi, String nom, double preu, int estoc){
		this.codi = codi;
		this.nom = nom;
		this.preu = preu;
		this.estoc = estoc;
		productes.add(this);
	}

	public Producte() {
		
	}

	public static ArrayList<Producte> retornaLlista(){
		return productes;
	} 

}
