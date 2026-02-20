package hospital4;

import java.util.Random;

import hospital.Gravetat;

public class Cirugia extends Tractament implements Intervencio {

	private boolean exitosa;
	
	public Cirugia(String nom) {
		super(nom);
		Random random = new Random();
		int nunmeroRandom = random.nextInt(2);
		exitosa = (nunmeroRandom == 1)? this.exitosa : !this.exitosa;
	}

	public boolean getExitosa() {
		return this.exitosa;
	}

	public void administrar(PacientHospitalitzat p) {
		this.assignar(p);
	}
	
	public void assignar(PacientHospitalitzat p) {
		p.setIntervencioAssignada(this);
	}
	
	public void realitzar(PacientHospitalitzat p) {
		if(p.getIntervencioAssignada() == this) {
		if(this.exitosa) {
			p.setGravetat(Gravetat.MODERADA);
		}
		if(p.getIntervencioAssignada() == this) {
			p.setIntervencioAssignada(null);
		}
		}else {
			System.out.println("Aquest pacient no te asignada aquesta cirurgia");
		}
	}
	
}
