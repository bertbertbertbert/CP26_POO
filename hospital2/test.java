package hospital2;

public class test {

	public static void main (String[] args) {
		PacientHospitalitzat dani = new PacientHospitalitzat("Dani", 35);
		Pacient alberto = new Pacient("Alberto", 39);
		PacientHospitalitzat montse = new PacientHospitalitzat(alberto.nom, alberto.edat, "Millorant");		
		System.out.println("Nom "+ montse.nom+ " edat " + montse.edat + " estat " + montse.tractamentActual);

 
	}
	

	private static PacientHospitalitzat PacientHospitalitzat(Pacient alberto, String tractament) {
		if(!(alberto instanceof PacientHospitalitzat)) {
		new PacientHospitalitzat(alberto.nom, alberto.edat, tractament);
		}else {
			System.out.println("Aquest pacient ja està hospitalitzat");
			
		}
		return (PacientHospitalitzat) alberto;
	}
}
