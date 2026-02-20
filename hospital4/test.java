package hospital4;

import hospital.Categoria;
import hospital.Gravetat;

public class test {

	public static void main(String[] args) {

		Pacient alberto = new Pacient("Alberto", 39, 5000, Gravetat.GREU);
		Metge marc = new Metge("Marc", "General", 2000, 6, Categoria.ESPECIALISTA);
		System.out.println("Diners Alberto " + alberto.getDiners());
		marc.consulta(alberto);
		PacientHospitalitzat albertoH = alberto.hospitaliztar(Diagnosti.ANSIETAT, new Medicament("Ansiolitic", TipusMedicament.ANSIOLÍTIC));
		//albertoH.administrarTractament(albertoH.getTractamentActual().get(0));
        //PacientHospitalitzat.veureHopsitalitzats();
        //System.out.println(PacientHospitalitzat.getNombrePacientsHospitalitzats());
		//PacientHospitalitzat.veureHopsitalitzats();
		System.out.println(albertoH.getGravetat());
		
		//creo la cirugia		
		Cirugia cirugiaAlberto = new Cirugia("cirugia Alberto");
		System.out.println(cirugiaAlberto.getExitosa());
		
		//asigno y realizo la cirugia
		cirugiaAlberto.assignar(albertoH);
		cirugiaAlberto.realitzar(albertoH);
		System.out.println(albertoH.getGravetat());
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
