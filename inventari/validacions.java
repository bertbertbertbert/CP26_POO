package probes;

public class validacions {
	// FUNCIÓ PER VALIDAR EL CODI
	public static boolean validacioCodi(int codi) {
		boolean repetit = false;
		for (Producte producte : Producte.productes) {
			if (producte.codi == codi) {
				repetit = true;
			}
		}
		return ((codi > 999 && codi < 10000) && !repetit) ? true : false;
	}

	// FUNCIÓ VALIDACIO DNI CLIENT
	public static boolean validacioDNI(String dni) {
		boolean repetit = false;
		for (Comanda comanda : Comanda.comandes) {
			if (comanda.dni.equals(dni)) {
				repetit = true;
			}
		}
		return (dni.matches("^[0-9]{8}[A-HJ-NP-TV-Z]$") && !repetit) ? true : false;
	}

	// FUNCIO VALIDACIO PREU
	public static boolean validacioPreu(double preu) {
		return (preu > 0) ? true : false;
	}

	// FUNCIO VALIACIO CUANTITAT, MIRA QUE LA CUANTITAT SIGUI MAYOT QUE CERO I QUE
	// HI HAGI SUFICIENT STOCK, RESTA LA QUANTITAT AL STOCK
	public static boolean validacioQuantitat(int quantitat, int codi) {
		Producte producte = null;
		boolean existeix = false;
		for (Producte p : Producte.productes) {
			if (p.codi == codi) {
				producte = p;
				existeix = true;
			}
		}
		if (quantitat > 0 && existeix && producte.estoc > quantitat) {
			producte.estoc = producte.estoc - quantitat;
			return true;
		} else {
			return false;
		}

	}
}
