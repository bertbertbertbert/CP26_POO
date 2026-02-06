package probes;

import java.util.ArrayList;

public class Producte {

    final int codi;
    protected String nom;
    protected double preu;
    protected int estoc;
    public static ArrayList<Producte> productes = new ArrayList<Producte>();

    public Producte(int codi, String nom, double preu, int estoc) {
        this.codi = codi;
        this.nom = nom;
        this.preu = preu;
        this.estoc = estoc;
        productes.add(this);
    }

    public static void veureProductes() {
        for (Producte producte : productes) {
            System.out.println("Nom: " + producte.nom);
            System.out.println("Codi: " + producte.codi);
            System.out.println("Preu: " + producte.preu);
            System.out.println("estoc: " + producte.estoc);
            System.out.println("------------------------");
        }
    }
}
