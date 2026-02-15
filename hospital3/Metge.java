package hospital3;

import java.util.ArrayList;

import hospital.Categoria;
import hospital.Gravetat;
import hospital.Pacient;

public class Metge extends Persona {

	private String departament = "Sense departament";
	private int anysTreballats;
	private double souInicial;
	private double sou;
	private Categoria cat;

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
		if (((this.cat == Categoria.RESIDENT || this.cat == Categoria.ESPECIALISTA) && cat == Categoria.INTERN) 
			|| (this.anysTreballats > 2 && cat == Categoria.INTERN)) {
			System.out.println("Un resident, especialista o treballador amb >2 anys treballats no pot pasar a ser intern");
		} else {
			this.cat = cat;
		}

	}

	private ArrayList<Pacient> pacientsAssingnats = new ArrayList<Pacient>();

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

	public Metge(String nom, String departament, double souInicial, int anysTreballats) {
		super(nom);
		this.departament = departament;
		this.souInicial = souInicial;
		this.anysTreballats = anysTreballats;
	}

	private void actualitzarSou() {
    this.sou *= 1.02;
    if (this.anysTreballats % 6 == 0) {
        this.sou *= 1.05;
    }
}

	public void augmentarAnys() {
		this.anysTreballats++;
        actualitzarSou();
	}

	public void afegirPacient(Pacient pac) {
		pacientsAssingnats.add(pac);
	}

	public static double calcularPreuConsulta(int edat, Gravetat gravetat, Categoria categoria) {
		double preuBase = 10;
		if (categoria == Categoria.RESIDENT) {
			preuBase *= 2;
		} else if (categoria == Categoria.ESPECIALISTA) {
			preuBase *= 3;
		}
		if (edat < 15 || gravetat == Gravetat.CRITICA) {
			preuBase = 0;
		}
		double preuFinal = preuBase;
		return preuFinal;
	}

	public boolean consulta(Pacient pac) {
		double preuFinal = calcularPreuConsulta(pac.edat, pac.gravetat, this.cat);
		if (pac.diners >= preuFinal) {
			pac.diners -= preuFinal;
			afegirPacient(pac);
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
