package absolute_cinema;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {
	
	static Scanner scan = new Scanner(System.in);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean sortir = false;
		while(!sortir) {
			
			System.out.println("1.Afegir película.");
			System.out.println("2.Crear Sessió");
			System.out.println("3.Vendre Entrades");
			System.out.println("4.Mostrar Sessions d'una Película");
			System.out.println("5.Calcular recaptació d'una sala");
			System.out.println("6.Mostrar Sessions Nocturnes");
			System.out.println("7.Mostrar Sessions Disponibles");
			System.out.println("8.Sortir");
			System.out.println("-----------");
			System.out.println("ESCULL OPCIO:");
			int opcio = scan.nextInt();
			switch(opcio) {
			case 1:
			    System.out.println("Introdueix el codi de la película");
			    int codi = scan.nextInt();
			    scan.nextLine();
			    System.out.println("Introdueix el titol de la película");
			    String titol = scan.nextLine();
			    System.out.println("Introdueix la durada de la película en minuts");
			    int durada = scan.nextInt();
			    System.out.println("Introdueix el preu de la película");
			    float preu_entrada = scan.nextFloat();
				afegir_pelicula(codi, titol, durada, preu_entrada);
				break;
			case 2: 
			    System.out.println("Introdueix el codi de la sessió");
			    int codi_sessio = scan.nextInt();
			    scan.nextLine();      
			    System.out.println("Introdueix el nom de la película");
			    String nomPeli = scan.nextLine(); 			    
			    System.out.println("Introdueix la hora de la película (hora)");
			    int hora = scan.nextInt();
			    System.out.println("Introdueix els minuts de la película(hora)");
			    int min = scan.nextInt();
			    System.out.println("Introdueix la sala de la sessió");
			    int sala = scan.nextInt();
			    System.out.println("Introdueix el total d'entrades");
			    int entrades_totals = scan.nextInt();
			    crear_sessio(codi_sessio, nomPeli, hora, min, sala, entrades_totals);

				break;
			case 3:
			    System.out.println("Introdueix el codi de la sessió");
			    codi_sessio = scan.nextInt();
			    System.out.println("Introdueix la quantitat d'entrades que vols comprar");
			    int quantitat = scan.nextInt();
                vendre_entrades(codi_sessio, quantitat);
				break;
			case 4:
				System.out.println("Introdueix el nom de la pelicula");
                int codi_pelicula = scan.nextInt();
                buscar_sessions(codi_pelicula);
				break;
			case 5: 
				System.out.println("Introdueix el nom de la sala");
                int num_sala = scan.nextInt();
				recaptacio_sala(num_sala);
				break;
			case 6:
				sessions_nocturnes();
				break;
			case 7:
				sessions_amb_entrades();
				break;
			case 8: 
				sortir=true;
				System.out.println("Has sortit" + "\n");
				break;
			default:
				System.out.println("Opció incorrecta" + "\n");
			break;
			}
		}

	}
	
	    public static boolean afegir_pelicula(int codi, String titol, int durada, float preu_entrada) {
		//Retorna True si s'ha afegit, False si el codi ja existeix
		new Pelicula(codi, titol, durada, preu_entrada);
		return false;
	}
	
	public static boolean crear_sessio(int codi_sessio, String nomPeli, int hora, int min, int sala, int entrades_totals) {
		//Crea una sessió assignant la pel·lícula corresponent
		//Retorna False si la pel·lícula no existeix o el codi de sessió ja existeix	
		boolean sessioValida = true;
	    Pelicula p = Validacions.validacioTrobarPeli(nomPeli);
	    if(p == null) {
	    	System.out.println("Pelicula no trobada");
	    sessioValida = false;
	    }
	    
	    if(!Validacions.validacioCodiSessioRepetit(codi_sessio)) {
	    	System.out.println("Codi de Sessió repetit");
	    	sessioValida = false;
	    }
	    if(sessioValida) {
	    	new Sessio(codi_sessio, p, hora, min, sala, entrades_totals);
	    }
		return sessioValida;
	}
	
	public static float vendre_entrades(int codi_sessio, int quantitat) {
		//Retorna l'import total o -1 si no hi ha prou entrades
		//Actualitza entrades_disponibles i entrades_venudes
		boolean sessioValida = true;
		if(Validacions.codiSessioExisteix(codi_sessio)){
			sessioValida = false;
		}if(!Validacions.validacioEntradesSuficients(codi_sessio, quantitat)) {
			sessioValida = false;
		}
		float retorn= 0;
		//actualitzar entrades disponibles
		if(sessioValida) {
			for(Sessio s : Sessio.sessions) {
				 if(s.codi_sessio == codi_sessio) {
                    s.entrades_disponibles -= quantitat;
                    retorn = s.entrades_disponibles;
				 }
			 }
			
			return retorn;
		}else{
			retorn = -1;
		}		
		return retorn;
	}
	
	public static ArrayList<Sessio> buscar_sessions(int codi_pelicula){
		//Retorna la llista de sessions d'aquella pel·lícula
		ArrayList <Sessio> sessionsDisponibles = Sessio.sessions;
		for(Sessio s : Sessio.sessions) {
			if(s.pelicula.codi == codi_pelicula) {
				sessionsDisponibles.add(s);
			}
		}
		return sessionsDisponibles;
	}
	
	public static float recaptacio_sala(float num_sala) {
		float recapatacio = 0;
		for(Sessio s : Sessio.sessions) {
			if(s.sala == num_sala) {
				recapatacio = s.entrades_venudes * s.pelicula.preu_entrada;
			}
		}
		return recapatacio;
	}
	
	public static ArrayList<Sessio> sessions_nocturnes(){
		//Retorna sessions que comencen a partir de les 22:00
		ArrayList <Sessio> sessionNocturnes = Sessio.sessions;
		for(Sessio s : Sessio.sessions) {
			if(s.hora == 22 && s.min == 00) {
				sessionNocturnes.add(s);
			}
		}
		return sessionNocturnes;
	}
    
	public static ArrayList<Sessio> sessions_amb_entrades(){
		//Retorna sessions que encara tenen entrades disponibles
		ArrayList <Sessio> sessionsAmbEntrades = Sessio.sessions;
		for(Sessio s : Sessio.sessions) {
			if(s.entrades_disponibles > 0) {
				sessionsAmbEntrades.add(s);
			}
		}
		return sessionsAmbEntrades;
	}
	
	}

