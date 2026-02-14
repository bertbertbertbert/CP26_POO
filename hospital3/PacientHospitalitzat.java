package hospital3;

import java.util.ArrayList;

public class PacientHospitalitzat extends Pacient {
	@Override
	public String toString() {
		return "Pacient [nom=" + this.getNom() +
				", diners=" + this.getDiners() +
				", edat=" + this.getEdat() +
				", gravetat=" + this.getGravetat() +
				", planta=" + this.getPlanta() +
				", tractament Actual=" + this.getTractamentActual() +
				", dies hopsitalitzat =" + this.getDiesHospitalitzat() + "]";
	}

	public String tractamentActual;
	private int diesHospitalitzat;
	private static int nombrePacientsHospitalitzats = 0;
	private static ArrayList<PacientHospitalitzat> hospitalitzats = new ArrayList<>();

	public String getTractamentActual() {
		return tractamentActual;
	}

	public void setTractamentActual(String tractamentActual) {
		this.tractamentActual = tractamentActual;
	}

	public int getDiesHospitalitzat() {
		return diesHospitalitzat;
	}

	public void setDiesHospitalitzat(int diesHospitalitzat) {
		if (diesHospitalitzat >= this.diesHospitalitzat) {
			this.diesHospitalitzat = diesHospitalitzat;
		}
	}

	public PacientHospitalitzat(String nom, int edat) {
		super(nom, edat);
		this.tractamentActual = "Observació";
		this.diesHospitalitzat = 0;
		nombrePacientsHospitalitzats++;
	}

	public PacientHospitalitzat(String nom, int edat, String tractamentActual) {
		super(nom, edat);
		this.tractamentActual = tractamentActual;
		nombrePacientsHospitalitzats++;
		hospitalitzats.add(this);
	}

	public void afegirSimptoma(Simptoma s, int diesHospital) {
		super.afegirSimptoma(s);
		this.diesHospitalitzat = diesHospital;
	}

	public static void veureHopsitalitzats() {
		for (PacientHospitalitzat pacient : hospitalitzats) {
			System.out.println("nom " + pacient.getNom() + " edad " + pacient.getEdat());
		}
	}

}
