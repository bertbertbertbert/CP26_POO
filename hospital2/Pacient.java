package hospital2;

import java.util.ArrayList;
import hospital.Gravetat;

public class Pacient extends Persona {
	int edat;
	Gravetat gravetat;
	int gravetatPacient;
	ArrayList <Simptoma> simptomes = new ArrayList <Simptoma>();
	public Pacient(String nom, int edat) {
		super(nom);
		this.edat = edat;
	}

	public Pacient(String nom, int edat, Gravetat gravetat) {
		super(nom);
		this.edat = edat;
		this.gravetat = gravetat;
	}
	
	private int gravetatANum(){
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
		gravetatPacient = gravetatANum();
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
			 return new PacientHospitalitzat(this, tractament);
		}else {
			System.out.println("Aquest pacient ja està hospitalitzat");
			
		}
		return (PacientHospitalitzat) this;
	}
}
