package hospital4;

public class Persona {
	public String nom;

	public String getNom() {
		return nom;
	}

	public Persona() {
	};

	public Persona(String nom) {
		this.nom = nom;
	}

	public void diguesNom() {
		System.out.println(this.nom);
	}

	@Override
	public String toString() {
		return "Persona [nom=" + getNom() + "]";
	}
}
