package hospital3;

public class test {

	public static void main (String[] args) {
		PacientHospitalitzat dani = new PacientHospitalitzat("Dani", 35);
		Pacient alberto = new Pacient("Alberto", 39);
		PacientHospitalitzat montse = new PacientHospitalitzat(alberto.getNom(), alberto.getEdat(), "Millorant");		
		System.out.println("Nom "+ montse.getNom()+ " edat " + montse.getEdat() + " estat " + montse.getTractamentActual());
	}
	
	public static PacientHospitalitzat hospitaliztar(Pacient p, String tractament) {
		if(!(p instanceof PacientHospitalitzat)) {
		new PacientHospitalitzat(p.getNom(), p.getEdat(), tractament);
		}else {
			System.out.println("Aquest pacient ja està hospitalitzat");
			
		}
		return (PacientHospitalitzat) p;
	}
	
}
