package hospital4;

public class test {

	public static void main (String[] args) {
		
		Pacient alberto = new Pacient("Alberto", 39);
		Pacient marc = new Pacient("Marc",30);
        
       /*  marc.hospitaliztar(new Tractament("observació"));
		pacientHospitalitzatStatic(alberto, new Tractament("observació")); */
       
		 PacientHospitalitzat.veureHopsitalitzats();
	}

	private static PacientHospitalitzat pacientHospitalitzatStatic(Pacient p, Tractament tractament) {
		if(!(p instanceof PacientHospitalitzat)) {
		return new PacientHospitalitzat(p.getNom(), p.getEdat(), tractament);
		}else {
			System.out.println("Aquest pacient ja està hospitalitzat");
			
		}
		return (PacientHospitalitzat) p;
	}
	
}
