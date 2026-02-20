package hospital4;

import hospital.Gravetat;

public interface Intervencio {
	
	public abstract void assignar(PacientHospitalitzat p);
	
	public abstract void realitzar(PacientHospitalitzat p);
	
	public default boolean potAssignar(PacientHospitalitzat pac){
			return pac.getIntervencioAssignada() == null && pac.getGravetat() == Gravetat.CRITICA;
		}
	public default boolean intervencioMalAplicada(PacientHospitalitzat pac) {
		boolean retornar = true;
		
		for(Tractament t : pac.getTractamentActual()) {	
			if(t instanceof Intervencio) {
				retornar = false;
			}
		}
		
		return retornar;	 
	}
	
}

