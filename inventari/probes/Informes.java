package probes;

public class Informes {

    public static void veurePorducteSotaMinims() {
        System.err.println("Producte sota minims: ");
        for (Producte p : Producte.productes) {
            if (p.estoc < 5) {
                System.out.println("Nom producte: " + p.nom + ", quantitat: " + p.estoc);
            }
        }

    }

    public static void veureTotalVendes() {
        int totalVendes = 0;
        double totalFacturat = 0;
        for (Comanda c : Comanda.comandes) {
            totalVendes += c.quantitat;
            totalFacturat += c.preuTotal;
        }
        System.err.println("Total facturat: " + totalFacturat + "\n" + "Vendes totals: " + totalVendes);
    }

    // funcio per retornar la quiantitat i el nom del producte més venut
    public static void veurePorducteMesVenut() {
        String producteMesVenut = " ";
        int mesVenutQuantitat = 0;
        for (int i = 0; i < Comanda.comandes.size(); i++) {
            if (mesVenutQuantitat < Comanda.comandes.get(i).quantitat) {
                mesVenutQuantitat = Comanda.comandes.get(i).quantitat;
                producteMesVenut = Comanda.comandes.get(i).producte.nom;
            }
        }

        System.err.println("Nom producte més venut: " + producteMesVenut + "\n" + "Vendes totals del producte: "
                + mesVenutQuantitat);

    }

}