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
	    Metge house = new Metge("House");
	    System.out.println(house.nom+" "+house.sou);
	    Metge wilson = new Metge("Wilson", 10);  
	    System.out.println(wilson.nom+" "+wilson.anysTreballats);
	}

}
