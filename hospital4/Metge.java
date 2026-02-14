package hospital4;

import java.util.ArrayList;

import hospital.Categoria;
import hospital.Gravetat;

public class Metge extends Persona {

	private String departament = "Sense departament";
	private int anysTreballats;
	private double souInicial;
	private double sou;
	private Categoria cat;
	private ArrayList<Pacient> pacientsAssingnats = new ArrayList<Pacient>();

	public String getDepartament() {
		return departament;
	}

	public void setDepartament(String departament) {
		this.departament = departament;
	}

	public int getAnysTreballats() {
		return anysTreballats;
	}

	public double getSou() {
		return sou;
	}

	public Categoria getCat() {
		return cat;
	}

	public void setCat(Categoria cat) {
		if ((this.cat == Categoria.RESIDENT || this.cat == Categoria.ESPECIALISTA) && cat == Categoria.INTERN) {
			System.out.println("Un resident o especialista no pot pasar a ser intern");
		} else {
			this.cat = cat;
		}

	}

	public Metge() {
	};

	public Metge(String nom, Categoria cat) {
		super(nom);
		this.anysTreballats = 0;
		this.sou = 1000.0;
		this.cat = cat;
	}

	public Metge(String nom, int anysTreballats) {
		super(nom);
		for (int i = 0; i < anysTreballats; i++) {
			this.augmentarAnys();
		}
	}

	public Metge(String nom, int anysTreballats, String departament) {
		super(nom);
		for (int i = 0; i < anysTreballats; i++) {
			this.augmentarAnys();
		}
		this.departament = departament;
	}

	public Metge(String nom, String departament, double sou, int anysTreballats, Categoria cat) {
		this.nom = nom;
		this.departament = departament;
		this.sou = sou;
		this.anysTreballats = anysTreballats;
		this.cat = cat;
	}

	public void augmentarAnys() {
		this.anysTreballats++;
		this.sou *= 1.02;
		if (this.anysTreballats % 6 == 0) {
			this.sou *= 1.05;
		}
	}

	public void afegirPacient(Pacient pac) {
		pacientsAssingnats.add(pac);
	}

	public double calcularPreuConsulta(int edat, Gravetat gravetat, Categoria categoria) {
		double preuBase = 10;
		if (cat == Categoria.RESIDENT) {
			preuBase *= 2;
		} else if (cat == Categoria.ESPECIALISTA) {
			preuBase *= 3;
		}
		if (edat < 15 || gravetat == Gravetat.CRITICA) {
			preuBase = 0;
		}
		double preuFinal = preuBase;
		return preuFinal;
	}

	public boolean consulta(Pacient pac) {
		double preuFinal = calcularPreuConsulta(pac.getEdat(), pac.getGravetat(), this.cat);
		if (pac.getDiners() >= preuFinal) {	
			pac.setDiners(pac.getDiners() - preuFinal);
			afegirPacient(pac);
			System.out.println("Nom pacient " + pac.nom + " Nom Metge " + this.getNom() + " Preu consulta " + preuFinal + 
			" Gravetat pacient " + pac.getGravetat() + " diners pacient " + pac.getDiners());
			return true;
		} else {
			return false;
		}
	}

	public void veurePacients() {
		for (Pacient p : pacientsAssingnats) {
			System.out.println(p.nom);
		}
	}

	@Override
	public String toString() {
		return "Metge [nom=" + getNom() +
				", departament=" + getDepartament() +
				", anysTreballats=" + getAnysTreballats() +
				", sou=" + getSou() +
				", categoria=" + getCat() +
				"]";
	}

}
