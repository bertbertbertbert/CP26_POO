package hospital5;

public class Transplament {
	
	private Organs organ;
	private Pacient pacientDonant;
	private Pacient pacientReceptor;
	
	public void realitzarTrasplantament() {
		this.pacientDonant.setOrgan(organ, false);
		this.pacientReceptor.setOrgan(organ, true);
	}
	
	public Transplament(Organs organ, Pacient pacientDonant, Pacient pacientReceptor) {
		this.organ = organ; this.pacientDonant = pacientDonant; this.pacientReceptor = pacientReceptor;
		realitzarTrasplantament();
	}

}
