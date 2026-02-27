package hospital4;

public class Simptoma {
String nomSimptoma;
Gravetat gravetat;

public Simptoma(String nomSimptoma, Gravetat gravetat) {
	this.nomSimptoma = nomSimptoma;
	this.gravetat = gravetat;
}
public Gravetat getGravetat() {
	return gravetat;
}
public void setGravetat(Gravetat gravetat) {
	this.gravetat = gravetat;
}	
}
