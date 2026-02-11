package hospital2;

public class PacientHospitalitzat extends Pacient {
String tractamentActual;
int diesHospitalitzat;
	public PacientHospitalitzat(String nom, int edat) {
		super(nom, edat);
		this.tractamentActual="Observació";
		this.diesHospitalitzat = 0;
		
	}

	public PacientHospitalitzat(String nom, int edat, String tractamentActual) {
		super(nom, edat);
		this.tractamentActual = tractamentActual;
	}

	public void afegirSimptoma(Simptoma s, int diesHospital) {
		super.afegirSimptoma(s);
		this.diesHospitalitzat = diesHospital;
	}

	public static PacientHospitalitzat hospitaliztar(Pacient p, String tractament) {
		if(!(p instanceof PacientHospitalitzat)) {
		new PacientHospitalitzat(p.nom, p.edat, tractament);
		}else {
			System.out.println("Aquest pacient ja està hospitalitzat");
			
		}
		return (PacientHospitalitzat) p;
	}
	
}
