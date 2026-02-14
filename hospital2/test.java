package hospital2;

public class test {

	public static void main (String[] args) {
		PacientHospitalitzat dani = new PacientHospitalitzat("Dani", 35);
		Pacient alberto = new Pacient("Alberto", 39);
		Pacient montse = new Pacient("Montse", 43);		
		

		montse.hospitaliztar("aguita");
        pacientHospitalitzatStatic(alberto, "aguita");
       
	}
	

	private static PacientHospitalitzat pacientHospitalitzatStatic(Pacient p, String tractament) {
		if(!(p instanceof PacientHospitalitzat)) {
		return new PacientHospitalitzat(p.nom, p.edat, tractament);
		}else {
			System.out.println("Aquest pacient ja està hospitalitzat");
			
		}
		return (PacientHospitalitzat) p;
	}
}
