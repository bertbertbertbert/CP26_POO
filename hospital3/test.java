package hospital3;

public class test {

	public static void main (String[] args) {
		
		Pacient alberto = new Pacient("Alberto", 39);
		Pacient marc = new Pacient("Marc",30);
        
        marc.hospitaliztar("sopita");
		alberto.hospitaliztar("sopita");
       
		 PacientHospitalitzat.veureHopsitalitzats();
	}
	
}
