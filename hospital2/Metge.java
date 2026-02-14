package hospital2;

import java.util.ArrayList;

import hospital.Categoria;
import hospital.Gravetat;
import hospital.Pacient;

public class Metge extends Persona {
	
   String departament ="Sense departament";
	int anysTreballats;
	double souInicial;
	double sou;
	Categoria cat;
	public ArrayList<Pacient> pacientsAssingnats = new ArrayList<Pacient>();
	public Metge() {}
	
	public Metge(String nom, Categoria cat) {
		super(nom);
		this.anysTreballats = 0;
		this.sou = 1000.0;
		this.cat = cat;
	}
	
	public Metge(String nom, int anysTreballats) {
		super(nom);
		for(int i = 0; i < anysTreballats; i++) {
			this.augmentarAnys();
		}
	}
	
	public Metge(String nom, int anysTreballats, String departament) {
		super(nom);
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
		if(this.anysTreballats%6==0){
			this.sou *= 1.05;
		}
	}
	
	public void afegirPacient(Pacient pac) {
		pacientsAssingnats.add(pac);
	}
	
	public boolean consulta(Pacient pac) {
		double preu = 10;
		if(cat == Categoria.RESIDENT) {
			preu *= 2;
		}else if(cat == Categoria.ESPECIALISTA) {
			preu*= 3;
		}
		if(pac.edat < 15 || pac.gravetat == Gravetat.CRITICA) {
			preu = 0;
		}
		if(pac.diners >= preu) {
			pac.diners -= preu;
			afegirPacient(pac);
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
