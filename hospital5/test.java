package hospital5;

public class test implements Comparable {

	public static void main(String[] args) {
;
		Pacient alberto = new Pacient("Alberto", 45, 5000, Gravetat.LLEU, Sexe.MASCULI);
		Pacient marc = new Pacient("Marc", 40, 5000, Gravetat.MODERADA, Sexe.MASCULI);
		Pacient neus  = new Pacient("Neus", 41, 5000, Gravetat.LLEU, Sexe.FEMENI);
		Pacient fernando = new Pacient("Fernando", 43, 5000, Gravetat.GREU, Sexe.MASCULI);
		PacientHospitalitzat albertoH = new PacientHospitalitzat (alberto, Diagnosti.ANSIETAT, new Medicament("Ansiolitic", TipusMedicament.ANSIOLÍTIC));
		PacientHospitalitzat marcA = new PacientHospitalitzat (marc, Diagnosti.ALERGIA, new Medicament("Ansiolitic", TipusMedicament.ANALGÈSIC));
		PacientHospitalitzat neusR = new PacientHospitalitzat (neus, Diagnosti.ESGUINC, new Medicament("Ansiolitic", TipusMedicament.ANALGÈSIC));
		PacientHospitalitzat fernandoN = new PacientHospitalitzat (fernando, Diagnosti.RESTRENYIMENT, new Medicament("Ansiolitic", TipusMedicament.ANTIDIABETIC));
		Metge house = new Metge();

		house.afegirPacient(alberto);
		house.afegirPacient(marc);
		house.afegirPacient(neus);
		house.afegirPacient(fernando);
		house.veurePacients();

	}

	private static PacientHospitalitzat pacientHospitalitzatStatic(Pacient p, Diagnosti diagnosti, Tractament tractament) throws PacientJaHospitalitzatException {
		if (!(p instanceof PacientHospitalitzat)) {
			PacientHospitalitzat pH = p.hospitaliztar(diagnosti, tractament);
			return pH;
		} else {
			System.out.println("Aquest pacient ja està hospitalitzat");
			return (PacientHospitalitzat) p;
		}
	}
	
	String num1 = "dos";
	String num2 = "tres";
	

	@Override
	public int compareTo(Object o) {
		
		return 0;
	}

}
