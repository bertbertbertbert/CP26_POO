package hospital;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Metge marc = new Metge();
		
		marc.nom = "Marc";
		marc.diguesNom();
	
		Metge faustino = new Metge();
        faustino.nom = "Dr. Faustino";       
        faustino.sou = 1000;
        faustino.augmentarAnys();
        faustino.augmentarAnys();
        faustino.augmentarAnys();
        faustino.augmentarAnys();
        faustino.augmentarAnys();
        faustino.augmentarAnys();
		System.out.println(faustino.sou);
		Metge perDefecte = new Metge();
	    System.out.println(perDefecte.nom);
	    Metge house = new Metge("House", Categoria.INTERN);
	    System.out.println(house.nom+" "+house.sou);
	    Metge wilson = new Metge("Wilson", 10);  
	    System.out.println(wilson.nom+" "+wilson.anysTreballats);
	    Metge alberto = new Metge("Alberto", Categoria.ESPECIALISTA);
	    if(alberto.cat == Categoria.ESPECIALISTA) {
	    	System.out.println("La categoria de Alberto es Especialista");
	    }
	
	    Pacient pacient1 = new Pacient("pepe", 10, 24, Gravetat.LLEU);
	    Pacient pacient2 = new Pacient("jose", 15, 20, Gravetat.LLEU);

	    faustino.afegirPacient(pacient1);
	    faustino.afegirPacient(pacient2);
	    
	    faustino.veurePacients();
	}

}
