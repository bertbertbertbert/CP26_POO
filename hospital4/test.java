package hospital4;

import hospital.Categoria;
import hospital.Gravetat;

public class test {

	public static void main(String[] args) {

		Pacient alberto = new Pacient("Alberto", 39, 5000, Gravetat.GREU);
		Pacient Melissa = new Pacient("Melissa", 10, 5000, Gravetat.GREU);
		Metge marc = new Metge("Marc", "General", 2000, 6, Categoria.ESPECIALISTA);

		System.out.println("Diners Alberto " + alberto.getDiners());
		marc.consulta(alberto);
		marc.consulta(Melissa);
		PacientHospitalitzat albertoH = alberto.hospitaliztar(Diagnosti.ANSIETAT, new Medicament("Ansiolitic", TipusMedicament.ANSIOLÍTIC));
		albertoH.administrarTractament(albertoH.getTractamentActual().get(0));

		//HOPSITALITZAT AMB EL METODE ESTATIC DE TEST.JAVA
		PacientHospitalitzat melissaD = pacientHospitalitzatStatic(Melissa, Diagnosti.ESGUINC, new Terapia("Acupuntura", TipusTerapia.TIMO));

		PacientHospitalitzat.veureHopsitalitzats();
		System.out.println(albertoH.getGravetat());
		System.out.println(melissaD.getGravetat());

		System.out.println(PacientHospitalitzat.getNombrePacientsHospitalitzats());
		PacientHospitalitzat.veureHopsitalitzats();
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
