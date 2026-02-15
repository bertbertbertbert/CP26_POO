package hospital3;

public class test {

	public static void main (String[] args) {
		
		Pacient alberto = new Pacient("Alberto", 39);
		Pacient marc = new Pacient("Marc",30);
        
        marc.hospitaliztar("sopita");
		pacientHospitalitzatStatic(alberto, "aguita");
       
		 PacientHospitalitzat.veureHopsitalitzats();
	}

	private static PacientHospitalitzat pacientHospitalitzatStatic(Pacient p, String tractament) {
		if(!(p instanceof PacientHospitalitzat)) {
		return new PacientHospitalitzat(p, tractament);
		}else {
			System.out.println("Aquest pacient ja està hospitalitzat");
			
		}
		return (PacientHospitalitzat) p;
	}
	
}
