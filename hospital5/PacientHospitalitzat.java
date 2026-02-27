package hospital5;

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

	public PacientHospitalitzat(String nom, int edat, Sexe sexe) {
		super(nom, edat, sexe);
		nombrePacientsHospitalitzats++;
	}

	public Intervencio getIntervencioAssignada() {
		return this.intervencioAssignada;
	}
	
	public void setIntervencioAssignada(Intervencio intA) {
		this.intervencioAssignada = intA;
	}
	
	public PacientHospitalitzat(Pacient p, Diagnosti diagnosti, Tractament tractamentActual) {
		super(p.getNom(), p.getEdat(), p.getSexe());
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
	
	public boolean esCompatible(Organs organ, PacientHospitalitzat receptor, PacientHospitalitzat donant) {
		boolean compatible = false;
		if(!receptor.getMapaOrgans().get(organ) && receptor.getMapaOrgans().get(organ)) {
			if(receptor.getGravetat() != Gravetat.CRITICA){
				if(receptor.getSexe().equals(donant.getSexe())){
					compatible = true;
				}
			}
		}
		return compatible;
	}
	
	 public Transplament solicitarTrasplantament(PacientHospitalitzat pacient, Organs organ) throws Exception {
		 PacientHospitalitzat donant = null;
		 if(esCompatible(organ, this, pacient)) {
	      donant = pacient;
		 }
		 if(donant == null) {
			 throw new DonantNoCompatibleException("El donant no és compatible");
		 }else {
			 return new Transplament(organ, this, donant);
		 }
	 }

	@Override
	public String toString() {
		return "Pacient [nom=" + this.getNom() +
				", diners=" + this.getDiners() +
				", edat=" + this.getEdat() +
				", gravetat=" + this.getGravetat() +
				", planta=" + this.getPlanta() +
				", dies hopsitalitzat =" + this.getDiesHospitalitzat() + "]";
	}

}
