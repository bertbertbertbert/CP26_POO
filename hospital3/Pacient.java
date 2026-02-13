package hospital3;

import java.util.ArrayList;
import hospital.Gravetat;

public class Pacient extends Persona {
	@Override
	public String toString() {
		return "Pacient [diners=" + diners + ", edat=" + edat + ", gravetat=" + gravetat + ", gravetatPacient="
				+ gravetatPacient + ", simptomes=" + simptomes + "]";
	}

	private double diners;
	public int edat;
	private Gravetat gravetat;
	private int gravetatPacient;
	private ArrayList <Simptoma> simptomes = new ArrayList <Simptoma>();


	public void setDiners(double diners) {
		this.diners = diners;
	}


	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public Gravetat getGravetat() {
		return gravetat;
	}

	public void setGravetat(Gravetat gravetat) {
		this.gravetat = gravetat;
	}

	public int getGravetatPacient() {
		return gravetatPacient;
	}


	public ArrayList<Simptoma> getSimptomes() {
		return simptomes;
	}

	public void setSimptomes(ArrayList<Simptoma> simptomes) {
		this.simptomes = simptomes;
	}

	public Pacient(String nom, int edat) {
		super(nom);
		this.edat = edat;
		this.diners = 1000;

	}

	public Pacient(String nom, int edat, Gravetat gravetat) {
		super(nom);
		this.edat = edat;
		this.gravetat = gravetat;
	}
	
	private int gravetatANum(Gravetat gravetat){
		gravetat = this.gravetat;
		
		if(this.gravetat == Gravetat.LLEU) {
			gravetatPacient = 1;
		}else if(this.gravetat == Gravetat.MODERADA) {
			gravetatPacient = 2;
		}else if(this.gravetat == Gravetat.GREU) {
			gravetatPacient = 3;
		}else if(this.gravetat == Gravetat.CRITICA) {
			gravetatPacient = 4;
		}
		return gravetatPacient;
	}
	
	public void afegirSimptoma(Simptoma s) {
		simptomes.add(s);
		
		//cridem a la funcio que ens dona el numero de la gravetat del pacient per comparar amb la gravetat del simptoma
		gravetatPacient = gravetatANum(this.gravetat);
		int tipusGravetatSimptoma = 0;
		if(s.gravetat == Gravetat.LLEU) {
			tipusGravetatSimptoma = 1;
		}else if(s.gravetat == Gravetat.MODERADA) {
			tipusGravetatSimptoma = 2;
		}else if(s.gravetat == Gravetat.GREU) {
			tipusGravetatSimptoma = 3;
		}else if(s.gravetat == Gravetat.CRITICA) {
			tipusGravetatSimptoma = 4;
		}
		
		if(tipusGravetatSimptoma > gravetatPacient) {
			this.gravetat = s.gravetat;
		}
	}
	
	public PacientHospitalitzat hospitaliztar(String tractament) {
		if(!(this instanceof PacientHospitalitzat)) {
		new PacientHospitalitzat(getNom(), getEdat(), tractament);
		}else {
			System.out.println("Aquest pacient ja està hospitalitzat");
			
		}
		return (PacientHospitalitzat) this;
	}
}
