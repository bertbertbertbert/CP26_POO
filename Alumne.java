import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Alumne {
	
	static ArrayList <Double> notes = new ArrayList();
	static ArrayList <String> noms = new ArrayList();
    static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean sortir = false;
		while(!sortir) {
			
			System.out.println("1.Regsitrar Alumne");
			System.out.println("2.Veure Mitjana notes");
			System.out.println("3.Veure aprovats");
			System.out.println("4.Veure Suspensos");
			System.out.println("5.Buscar alumne");
			System.out.println("6.Modificar nota");
			System.out.println("7.Mostrar estadístiques");
			System.out.println("8.Eliminar alumne");
			System.out.println("9.Ordenar alumnes notes");
			System.out.println("10.Ordenar alumnes alfabeticament");
			System.out.println("11.Sortir");
			System.out.println("-----------");
			System.out.println("ESCULL OPCIO:");
			int opcio = scan.nextInt();
			switch(opcio) {
			case 1:
				registrarAlumne();
				break;
			case 2: 
				double mitjana = calcularMitjana();
				System.out.println("La mitjana de notes es " + mitjana);
				break;
			case 3:
				System.out.println("Aprovats: ");
				 veureAprovats();
				 System.out.println();
				break;
			case 4: 
				System.out.println("Suspensos:");
				 veureSuspensos();
				System.out.println();
				break;
			case 5: 
				buscarAlumne();
				System.out.println();
				break;
			case 6: 
				ModificarNota();
				break;
			case 7: 
				mostraEstadistiques();
				break;
			case 8:
				eliminarAlumnes();
				break;
			case 9:
				 ordenarPerNotes();
				 break;
			case 10:
				ordenarAlfabeticament();
				break;
			case 11: 
				sortir=true;
				System.out.println("Has sortit" + "\n");
				break;
			default:
				System.out.println("Opció incorrecta" + "\n");
			break;
			}
		}

	}
	private static void registrarAlumne() {
		scan.nextLine();
		System.out.println("Nom alumne: ");
		String nomAlumne = scan.nextLine();
		if(!nomAlumne.isEmpty() && !noms.contains("nomAlumne")) {
			noms.add(nomAlumne);
			System.out.println("Nota alumne: ");
			double notaAlumne = scan.nextDouble();
			if(notaAlumne >= 0 && notaAlumne <= 10) {
				notes.add(notaAlumne);			
			}else {
				System.out.println("Nota incorrecte");
			}
			
		}else {
			System.out.println("Nom incorrecte o repetit");
		}

	}
	
	public static double calcularMitjana() {
		int acc = 0;
		for(int i = 0; i<notes.size(); i++) {
			acc += notes.get(i);
		}
		double mitjana = acc/notes.size();
		return mitjana;
	}
	
	public static void veureAprovats() {
		int acc=0;
		for(int i = 0; i<notes.size(); i++) {
			acc++;
			if(notes.get(i)>=5) {
				System.out.println("Nom: "+noms.get(i)+" Nota:"+notes.get(i));
			}
		}
		if(acc==0) {
			System.out.println("No hi ha aprovats");
		}
	}
	
	public static void veureSuspensos() {
		int acc=0;
		for(int i = 0; i<notes.size(); i++) {
			if(notes.get(i)<5) {
				acc++;
				System.out.println("Nom: "+noms.get(i)+" Nota:"+notes.get(i));
			}
		}
		if(acc==0) {
			System.out.println("No hi ha aprovats");
		}
	}
	
	public static void buscarAlumne() {
		scan.nextLine();
		System.out.println("Digues el nom de l'alumne que vols cercar");
		String nom = scan.nextLine();
		int index = -1;
		for(int i = 0; i < noms.size(); i++) {
			if(noms.get(i).equals(nom)) {
				index = i;
			}
		}
		if(index!=-1) {
		System.out.println("La nota de " + nom + " és " + notes.get(index));
		}else {
			System.out.println("No s'ha trobat l'alumne");
		}
	}
   public static void ModificarNota() {
		scan.nextLine();
		System.out.println("Digues el nom de l'alumne que vols modificar la nota:");
		String nom = scan.nextLine();
		for(int i = 0; i < noms.size(); i++) {
			if(noms.get(i).equals(nom)){
			System.out.println("Digues la nota nova:");
			double notaNova = scan.nextDouble();
			if(notaNova >= 0 && notaNova <= 10) {
				notes.set(i, notaNova);
			}else {
				System.out.println("Nota incorrecte");
			}
		}else {
			System.out.println("Nom no trobat");
		  }
		 }
		}
   public static void mostraEstadistiques() {
	   System.out.println("Estadístiques");
	   if(noms.size()>0) {
	   System.out.println("Número d'alumnes: " + noms.size());
	   int aprovats = 0;
	   double notaMax=-100;
	   double NotaMin=100;
		for(int i = 0; i<notes.size(); i++) {	
			if(notes.get(i)>notaMax) {
				notaMax = notes.get(i);
			}
			if(notes.get(i)<NotaMin) {
				NotaMin = notes.get(i);
			}
			if(notes.get(i)>=5) {
				aprovats++;
			}
		}
		double percentatge = (aprovats * 100.0) / notes.size();
		   System.out.println("El percentatge d'aprovats és: " + percentatge + "\n" +
				              "La nota més alta és: " + notaMax + "\n" + 
		                      "La nota més baixa és: " + NotaMin);
	   }else {
	   System.out.println("No hi ha alumnes");
	   }
   }
   
  private static void eliminarAlumnes() {
	  scan.nextLine();
	  System.out.println("Introdueix el nom del alumne que vols eliminar");
	  String nom = scan.nextLine();
	  int acc=0;
	  for(int i = 0; i < noms.size(); i++){
		  if(noms.get(i).equals(nom)) {
			  acc++;
		  noms.remove(i);
		  notes.remove(i);
		  }
		  if(acc==0) {
			  System.out.println("Alumne no trobat");
		  }
	  }
  }
  public static void ordenarPerNotes() {
	  Collections.sort(notes);
	  Collections.reverse(notes);
	  System.out.println(notes);
  }
  public static void ordenarAlfabeticament() {
	  Collections.sort(noms);
	  System.out.println(noms);
  }
   }
	
	


