package hospital3;

public class PacientHospitalitzat extends Pacient {
	@Override
	public String toString() {
		return "PacientHospitalitzat [tractamentActual=" + tractamentActual + ", diesHospitalitzat=" + diesHospitalitzat
				+ "]";
	}

	public String tractamentActual;
	private int diesHospitalitzat;
	private static int nombrePacientsHospitalitzats = 0;
	
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
		this.diesHospitalitzat = diesHospitalitzat;
	}

	public PacientHospitalitzat(String nom, int edat) {
		super(nom, edat);
		this.tractamentActual="Observació";
		this.diesHospitalitzat = 0;
		nombrePacientsHospitalitzats ++;
	}

	public PacientHospitalitzat(String nom, int edat, String tractamentActual) {
		super(nom, edat);
		this.tractamentActual = tractamentActual;
		nombrePacientsHospitalitzats ++;
	}

	public void afegirSimptoma(Simptoma s, int diesHospital) {
		super.afegirSimptoma(s);
		this.diesHospitalitzat = diesHospital;
	}

}
