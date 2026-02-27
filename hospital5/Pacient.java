package hospital5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Pacient extends Persona {

	private double diners;
	private int edat;
	private Sexe sexe;
	private Gravetat gravetat;
	private Planta planta;
    private HashMap<Organs,Boolean> mapaOrgans = new HashMap<>();
	private ArrayList<Simptoma> simptomes = new ArrayList<Simptoma>();

	public void setDiners(double diners) {
		this.diners = diners;
	}

	public double getDiners() {
		return this.diners;
	}

	public int getEdat() {
		return this.edat;
	}
	
	public Sexe getSexe() {
		return this.sexe;
	}

	public Planta getPlanta(){
		return this.planta;
	}

	public void setEdat(int edat) {
		if (edat < 0) {
			this.edat = 0;
		} else if (edat > 150) {
			this.edat = 150;
		} else {
			this.edat = edat;
		}
	}

	public Gravetat getGravetat() {
		return gravetat;
	}

	public void setGravetat(Gravetat gravetat) {
		this.gravetat = gravetat;
	}


	public ArrayList<Simptoma> getSimptomes() {
		return simptomes;
	}

	public void setSimptomes(ArrayList<Simptoma> simptomes) {
		this.simptomes = simptomes;
	}

	private void construirMapaOrgans() {	
		Random random = new Random();		
		for(Organs organ : Organs.values()) {
			int limite = 0;
			if(this.planta == Planta.NEONATAL) {
				limite = 5;
			}else if(this.planta == Planta.PEDIATRIA) {
				limite = 15;
			}else if(this.planta == Planta.GENERAL) {
				limite = 35;
			}else {
				limite = 60;
			}
			
			this.mapaOrgans.put(organ, random.nextInt(100) <= limite);
			
		}
	}
	
	public void setOrgan(Organs organNou, Boolean nouEstat) {
		this.mapaOrgans.put(organNou, nouEstat);
		}
	
	
	public HashMap<Organs, Boolean> getMapaOrgans(){
     return this.mapaOrgans;
	
	}
	
	public Pacient(String nom, int edat, Sexe sexe) {
		super(nom);
		this.edat = edat;
		this.diners = 1000;
		this.sexe = sexe;
	}

	public Pacient(String nom, int edat, double diners, Gravetat gravetat, Sexe sexe) {
		super(nom);
		this.diners = diners;
		this.gravetat = gravetat;
		this.sexe = sexe;
		construirMapaOrgans();
		if (edat < 0) {
			this.edat = 0;
		} else if (edat > 150) {
			this.edat = 150;
		} else {
			this.edat = edat;
		}
		if (edat <= 1) {
			this.planta = Planta.NEONATAL;
		} else if (edat > 1 && edat <= 18) {
			this.planta = Planta.PEDIATRIA;
		} else if (edat > 18 && edat <= 74) {
			this.planta = Planta.GENERAL;
		} else {
			this.planta = Planta.GERIATRIA;
		}
	}


	public void afegirSimptoma(Simptoma s) {
		simptomes.add(s);
	    
		if(this.gravetat.equals("")) {
			this.gravetat = s.getGravetat();
		}else if(s.getGravetat() == Gravetat.MODERADA && this.gravetat == Gravetat.LLEU) {
			this.gravetat = s.getGravetat();
		}else if(s.getGravetat() == Gravetat.GREU && (this.gravetat == Gravetat.LLEU || this.gravetat == Gravetat.MODERADA)) {
			this.gravetat = s.getGravetat();
		}else if(s.getGravetat() == Gravetat.CRITICA &&(this.gravetat == Gravetat.LLEU || this.gravetat == Gravetat.MODERADA || this.gravetat == Gravetat.GREU)) {
			this.gravetat = s.getGravetat();
		}
		

	}

	public PacientHospitalitzat hospitaliztar(Diagnosti diagnosti, Tractament tractament) {
		if (!(this instanceof PacientHospitalitzat)) {
			return new PacientHospitalitzat(this, diagnosti, tractament);
		} else {
			System.out.println("Aquest pacient ja està hospitalitzat");

		}
		return (PacientHospitalitzat) this;
	}

		@Override
	public String toString() {
		return "Pacient [nom=" + this.getNom() +
				", diners=" + this.getDiners() +
				", edat=" + this.getEdat() +
				", sexe=" + this.getSexe() +
				", gravetat=" + this.getGravetat() +
				", planta=" + this.getPlanta() + "]";
	}

}
