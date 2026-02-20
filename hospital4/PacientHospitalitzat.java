package hospital4;

import hospital.Gravetat;
import java.util.ArrayList;

public class PacientHospitalitzat extends Pacient {

	private int diesHospitalitzat;
	private ArrayList<Tractament> tractamentsActuals = new ArrayList<>();
	private static ArrayList<PacientHospitalitzat> hospitalitzats = new ArrayList<>();
	private Diagnosti diagnosti;
	private static int nombrePacientsHospitalitzats = 0;
    private Intervencio intervencioAssignada;
    
    
	public ArrayList<Tractament> getTractamentActual() {
		return tractamentsActuals;
	}

	public Diagnosti getDiagnosti() {
		return this.diagnosti;
	}

	public int getDiesHospitalitzat() {
		return diesHospitalitzat;
	}

	public static int getNombrePacientsHospitalitzats() {
		return nombrePacientsHospitalitzats;
	}

	public void setDiesHospitalitzat(int diesHospitalitzat) {
		if (diesHospitalitzat >= this.diesHospitalitzat) {
			this.diesHospitalitzat = diesHospitalitzat;
		}
	}

	public PacientHospitalitzat(String nom, int edat) {
		super(nom, edat);
		/* this.tractamentsActuals.add(new Tractament("oberservació")); */
		nombrePacientsHospitalitzats++;
	}

	public Intervencio getIntervencioAssignada() {
		return this.intervencioAssignada;
	}
	
	public void setIntervencioAssignada(Intervencio intA) {
		this.intervencioAssignada = intA;
	}
	
	public PacientHospitalitzat(Pacient p, Diagnosti diagnosti, Tractament tractamentActual) {
		super(p.getNom(), p.getEdat());
		this.setGravetat(p.getGravetat());
		this.setDiners(p.getDiners());
		this.diagnosti = diagnosti;
		this.tractamentsActuals.add(tractamentActual);
		this.diesHospitalitzat = 0;
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

	public void reduirGravetat() {
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

	public void augmentarGravetat() {
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

	public void administrarTractament(Tractament tractament) {

		if (tractamentsActuals.contains(tractament)) {
			tractament.administrar(this);
		} else {
			System.out.println("El pacient no té aquest tractament assignat");
		}
	}

	@Override
	public String toString() {
		return "Pacient [nom=" + this.getNom() +
				", diners=" + this.getDiners() +
				", edat=" + this.getEdat() +
				", gravetat=" + this.getGravetat() +
				", planta=" + this.getPlanta() +
				/* ", tractament Actual=" + this.getTractamentActual() + */
				", dies hopsitalitzat =" + this.getDiesHospitalitzat() + "]";
	}

}
