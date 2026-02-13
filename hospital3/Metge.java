package hospital3;

import java.util.ArrayList;

import hospital.Categoria;
import hospital.Gravetat;
import hospital.Pacient;

public class Metge extends Persona {
	
	private String nom;
	private String departament ="Sense departament";
	private int anysTreballats;
	private double souInicial;
	private double sou;
	private static Categoria cat;
	public String getNom() {
		return nom;
	}


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


	public static Categoria getCat() {
		return cat;
	}

	public static void setCat(Categoria cat) {
         if((Metge.cat == Categoria.RESIDENT || Metge.cat == Categoria.ESPECIALISTA) && cat == Categoria.INTERN) {
			System.out.println("Un resident o especialista no pot pasar a ser intern");
		}else {
			Metge.cat = cat;
		}
		
	}

	
	private ArrayList<Pacient> pacientsAssingnats = new ArrayList<Pacient>();
	public Metge() {};
	
	public Metge(String nom, Categoria cat) {
		this.nom = nom;
		this.anysTreballats = 0;
		this.sou = 1000.0;
		this.cat = cat;
	}
	
	public Metge(String nom, int anysTreballats) {
		this(nom, cat);
		for(int i = 0; i < anysTreballats; i++) {
			this.augmentarAnys();
		}
	}
	
	public Metge(String nom, int anysTreballats, String departament) {
		this(nom, cat);
		for(int i = 0; i < anysTreballats; i++) {
			this.augmentarAnys();
		}
		this.departament = departament;
	}
	
	public Metge(String nom, String departament, double souInicial, int anysTreballats) {	
		this.nom = nom; this.departament = departament; this.souInicial = souInicial; this.anysTreballats = anysTreballats;
	}
	
	public void diguesNom() {
		System.out.println(this.nom);
	}
	
	public void augmentarAnys() {
		this.anysTreballats++;
		this.sou *= 1.02;
		if(this.sou%6==0){
			this.sou *= 1.05;
		}
	}

	public void afegirPacient(Pacient pac) {
		pacientsAssingnats.add(pac);
	}
	
	
	public static double calcularPreuConsulta(int edat, Gravetat gravetat, Categoria categoria){
		double preuBase = 10;
		if(cat == Categoria.RESIDENT) {
			preuBase *= 2;
		}else if(cat == Categoria.ESPECIALISTA) {
			preuBase *= 3;
		}
		if(edat < 15 || gravetat == Gravetat.CRITICA) {
			preuBase = 0;
		}
		double preuFinal = preuBase;
		return preuFinal;
	}
	
	
	@Override
	public String toString() {
		return "Metge [nom=" + nom + ", departament=" + departament + ", anysTreballats=" + anysTreballats
				+ ", souInicial=" + souInicial + ", sou=" + sou + ", pacientsAssingnats=" + pacientsAssingnats + "]";
	}


	public boolean consulta(Pacient pac) {
		double preuFinal = calcularPreuConsulta(pac.edat, pac.gravetat, this.cat);
		if(pac.diners >= preuFinal) {
			pacientsAssingnats.add(pac);
			return true;
		}else {
			return false;
		}
	}
	
	public void veurePacients() {
		for(Pacient p : pacientsAssingnats) {
			System.out.println(p.nom);
		}
	}
}
