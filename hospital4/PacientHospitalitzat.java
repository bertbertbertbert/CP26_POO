package hospital4;

import hospital.Gravetat;
import java.util.ArrayList;
public class PacientHospitalitzat extends Pacient {

	private int diesHospitalitzat;
	private ArrayList <Tractament> tractamentsActuals = new ArrayList<>();
	private static int nombrePacientsHospitalitzats = 0;
	private static ArrayList<PacientHospitalitzat> hospitalitzats = new ArrayList<>();
	private Diagnosti diagnosti;

	public ArrayList getTractamentActual() {
		return tractamentsActuals;
	}

    public Diagnosti getDiagnosti(){
		return this.diagnosti;
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
		/* this.tractamentsActuals.add(new Tractament("oberservació")); */
		this.diesHospitalitzat = 0;
		nombrePacientsHospitalitzats++;
	}

	public PacientHospitalitzat(String nom, int edat, Tractament tractamentActual) {
		super(nom, edat);
		this.tractamentsActuals.add(tractamentActual);
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

	public void reduirGravetat(){
		Gravetat gravetat = this.getGravetat();
		switch (gravetat) {
			case Gravetat.CRITICA:
					this.setGravetat(Gravetat.GREU);
				break;
		    case Gravetat.GREU:
					this.setGravetat(Gravetat.MODERADA);
				break;
			case Gravetat.MODERADA:
					this.setGravetat(Gravetat.LLEU);
				break;
	}
	}
	public void augmentarGravetat(){
		Gravetat gravetat = this.getGravetat();
		switch (gravetat) {
			case Gravetat.LLEU:
					this.setGravetat(Gravetat.MODERADA);
				break;
		    case Gravetat.MODERADA:
					this.setGravetat(Gravetat.GREU);
				break;
			case Gravetat.GREU:
					this.setGravetat(Gravetat.CRITICA);
				break;
	}
	}

		@Override
	public String toString() {
		return "Pacient [nom=" + this.getNom() +
				", diners=" + this.getDiners() +
				", edat=" + this.getEdat() +
				", gravetat=" + this.getGravetat() +
				", planta=" + this.getPlanta() +
/* 				", tractament Actual=" + this.getTractamentActual() + */
				", dies hopsitalitzat =" + this.getDiesHospitalitzat() + "]";
	}

}
