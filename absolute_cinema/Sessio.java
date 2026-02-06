package absolute_cinema;

import java.util.ArrayList;

public class Sessio {
public static ArrayList<Sessio> sessions = new ArrayList<Sessio>();
int codi_sessio; 
Pelicula pelicula;
int hora;
int min;
int sala;
float entrades_totals;
int entrades_disponibles;
int entrades_venudes;

public Sessio(int codi_sessio, Pelicula pelicula, int hora, int min, int sala,float entrades_totals) {
	this.codi_sessio = codi_sessio; this.pelicula = pelicula; this.hora = hora; this.min = min; this.sala = sala; 
	this.entrades_totals = entrades_totals; 
	sessions.add(this);
 }

}