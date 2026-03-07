package hospital5;


public class test {

	public static void main(String[] args) {
;
		Pacient alberto = new Pacient("Alberto", 39, 5000, Gravetat.LLEU, Sexe.MASCULI);
		Pacient marc = new Pacient("Marc", 40, 5000, Gravetat.MODERADA, Sexe.MASCULI);
		Pacient neus  = new Pacient("Neus", 33, 5000, Gravetat.LLEU, Sexe.FEMENI);
		Pacient fernando = new Pacient("Fernando", 20, 5000, Gravetat.GREU, Sexe.MASCULI);
		PacientHospitalitzat albertoH = new PacientHospitalitzat (alberto, Diagnosti.ANSIETAT, new Medicament("Ansiolitic", TipusMedicament.ANSIOLÍTIC));
		PacientHospitalitzat marcA = new PacientHospitalitzat (marc, Diagnosti.ALERGIA, new Medicament("Ansiolitic", TipusMedicament.ANALGÈSIC));
		PacientHospitalitzat neusR = new PacientHospitalitzat (neus, Diagnosti.ESGUINC, new Medicament("Ansiolitic", TipusMedicament.ANALGÈSIC));
		PacientHospitalitzat fernandoN = new PacientHospitalitzat (fernando, Diagnosti.RESTRENYIMENT, new Medicament("Ansiolitic", TipusMedicament.ANTIDIABETIC));
		
		try {	
	    Transplament fetge = albertoH.solicitarTrasplantament(marcA, Organs.FETGE);
		 System.out.println("Hem trobat donant! Codi de trasplantament " + fetge);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
    		  System.out.println(albertoH.getNom() + " segueix hospitalitzat");
      }
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

}
