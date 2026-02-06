package hospital;



public class Pacient {
String nom;
double diners;
int edat;
Gravetat gravetat;
Planta planta;


public Pacient(String nom, double diners, int edat, Gravetat gravetat) {
	this.nom = nom; this.diners = diners;this.gravetat = gravetat;
	
	if(edat	< 0) {
		this.edat = 0;
	}else if(edat > 150){
		this.edat = 150;
	}else {
		this.edat = edat;
	}
	
	if(edat <= 1) {
	  this.planta = Planta.NEONATAL;
	}else if(edat>1 && edat<=18) {
		  this.planta = Planta.PEDIATRIA;		
	}else if(edat>18 && edat<=74) {
		  this.planta = Planta.GENERAL;		
	}else {
		  this.planta = Planta.GERIATRIA;			
	}
}

public Pacient(String nom, int edat) {
	 this(nom, 0.0, edat, Gravetat.LLEU);
	this.nom = nom; this.edat = edat;
	this.diners = 0;
	this.gravetat = Gravetat.LLEU;
}



public void diguesNom() {
	System.out.println(this.nom);
}
}