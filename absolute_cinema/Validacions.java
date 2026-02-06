package absolute_cinema;
import java.util.ArrayList;
public class Validacions {
 
	 static public Pelicula validacioTrobarPeli(String nom_pelicula) {
		  Pelicula pCercada = null;
		 for(Pelicula p : Pelicula.pelicules) {
			 if(p.titol.equals(nom_pelicula)) {
				 pCercada = p;
			 }
		 }	 
		 return pCercada;

	 }

	 static public boolean validacioCodiSessioRepetit(int codiSessio) {
		 boolean valid = true;
		 for(Sessio s : Sessio.sessions) {
			 if(s.codi_sessio == codiSessio) {
				 valid = false;
			 }
		 }
		 return valid;
	 }
	 
	 static public boolean codiSessioExisteix(int codiSessio) {
		 boolean valid = false;
		 for(Sessio s : Sessio.sessions) {
			 if(s.codi_sessio != codiSessio) {
				 valid = true;
			 }
		 }
		 return valid;
	 }
	 
	 static public boolean validacioEntradesSuficients(int codiSessio, int quantitat) {
		 boolean valid = false;
		 for(Sessio s : Sessio.sessions) {
			 if(s.codi_sessio == codiSessio) {
				 if(s.entrades_totals > quantitat) {
					 valid = true;
				 }
			 }
		 }
		 return valid;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
}
