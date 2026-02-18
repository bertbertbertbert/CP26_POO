package hospital4;

public abstract class Tractament {

    private String nom;
    protected int quantitat;

    public String getNom() {
        return this.nom;
    }

    public int getQuantitat() {
        return this.quantitat;
    }

    public Tractament(String nom) {
        this.nom = nom;
        this.quantitat = 1;
    }

    public void obtenir(int numTractaments) {
        quantitat += numTractaments;
    }

    public boolean actualitzarQuantitat() {
        this.quantitat -= 1;
        if (this.quantitat < 0) {
            return false;
        } else {
            return true;
        }
    }

    public abstract void administrar(PacientHospitalitzat p);
}
