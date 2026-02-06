package absolute_cinema;

import java.util.ArrayList;

public class Pelicula {
	public static ArrayList<Pelicula> pelicules = new ArrayList<Pelicula>();
	int codi;
	String titol;
	int durada;
	float preu_entrada;
	
	Pelicula(int codi, String titol, int durada, float preu_entrada){
		this.codi = codi; this.titol=titol; this.durada = durada; this.preu_entrada = preu_entrada;
		pelicules.add(this);
	}

}
