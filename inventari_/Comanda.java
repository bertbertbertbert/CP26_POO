package probes;

import java.util.ArrayList;

class Comanda{

	final protected String dni;
	protected Producte producte;
	protected int quantitat;
	protected double preuTotal;
	public static ArrayList<Comanda> comandes = new ArrayList<Comanda>();

	public Comanda(String dni, Producte producte, int quantitat) {
		this.dni = dni;
		this.producte = producte;
		this.quantitat = quantitat;
		this.preuTotal = quantitat * producte.preu;
		comandes.add(this);
	}

	static public void veureComandes() {
		for (Comanda comanda : comandes) {
			System.out.println("DNI: " + comanda.dni);
			System.out.println("Producte: " + comanda.producte.nom);
			System.out.println("Quantitat: " + comanda.quantitat);
			System.out.println("Preu Total: " + comanda.preuTotal);
			System.out.println("------------------------");
		}
	}

}
