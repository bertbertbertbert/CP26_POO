package hospital5;


public class test {

	public static void main(String[] args) {

		Pacient alberto = new Pacient("Alberto", 39, 5000, Gravetat.LLEU, Sexe.MASCULI);
		Simptoma anginas = new Simptoma("anginas", Gravetat.CRITICA);
		PacientHospitalitzat albertoH = alberto.hospitaliztar(Diagnosti.ANSIETAT, new Medicament("Ansiolitic", TipusMedicament.ANSIOLÍTIC));
		PacientHospitalitzat marc = alberto.hospitaliztar(Diagnosti.ANSIETAT, new Medicament("Ansiolitic", TipusMedicament.ANSIOLÍTIC));
	
	    for(Organs organ : albertoH.getMapaOrgans().keySet()) {
	    	Boolean value = albertoH.getMapaOrgans().get(organ);
	    	System.out.println(organ + ":" + value);
	    	
	    }
	    
	    System.out.println(alberto.getMapaOrgans());
	    System.out.println(albertoH.getMapaOrgans());
	    
        try {
	    Transplament fetge = albertoH.solicitarTrasplantament(marc, Organs.FETGE);
		  System.out.println("Hem trobat donant! Codi de trasplantament " + fetge);
        }catch(Exception e) {
        	 System.out.println("Transplants no posible");
        }finally {
      		  System.out.println(albertoH.getNom() + " segueix hospitalitzat");
        }
	}

	private static PacientHospitalitzat pacientHospitalitzatStatic(Pacient p, Diagnosti diagnosti, Tractament tractament) {
		if (!(p instanceof PacientHospitalitzat)) {
			PacientHospitalitzat pH = p.hospitaliztar(diagnosti, tractament);
			return pH;
		} else {
			System.out.println("Aquest pacient ja està hospitalitzat");
			return (PacientHospitalitzat) p;
		}
	}

}
