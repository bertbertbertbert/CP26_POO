package hospital2;

public class Persona {
String nom;

public Persona() {};

public Persona(String nom) {
	this.nom = nom;
}

public void diguesNom() {
	System.out.println(this.nom);
}
}
