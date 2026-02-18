package hospital3;

public class Persona {
	@Override
	public String toString() {
		return "Persona [nom=" + getNom() + "]";
	}

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
}
