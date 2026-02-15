package hospital2;

public class PacientHospitalitzat extends Pacient {
	String tractamentActual;
	int diesHospitalitzat;

	public PacientHospitalitzat(String nom, int edat) {
		super(nom, edat);
		this.tractamentActual = "Observació";
		this.diesHospitalitzat = 0;

	}

	public PacientHospitalitzat(String nom, int edat, String tractamentActual) {
		super(nom, edat);
		this.tractamentActual = tractamentActual;
	}

	@Override
	public void afegirSimptoma(Simptoma s) {
		super.afegirSimptoma(s);
		this.diesHospitalitzat++;
	}

	public PacientHospitalitzat(Pacient p, String tractament) {
		super(p.nom, p.edat, p.gravetat);
		this.tractamentActual = tractament;
		this.diesHospitalitzat = 0;
	}


}
