package hospital;

public class Metge {
	
	String nom;
	String departament ="Sense departament";
	int anysTreballats;
	double souInicial;
	double sou;
	static Categoria cat;
	
	public Metge() {}
	
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
	
}
