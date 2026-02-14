package hospital4;

import java.util.Random;

public class Medicament extends Tractament {
        TipusMedicament tipusM;

        public Medicament(String nom, TipusMedicament tipusM) {
                super(nom);
                this.tipusM = tipusM;
        }


        public void administrar(PacientHospitalitzat p) {
                
        if(!super.actualitzarQuantitat()){
                  System.out.println("Quantitat insuficient");
                  return;
        }

        Random random = new Random();
        int numRandom = random.nextInt(101);

        if (this.tipusM.equals("ANTIBIOTIC") && p.getDiagnosti().equals(Diagnosti.IBACTERIANA)
        || this.tipusM.equals("ANSIOLÍTIC") && p.getDiagnosti().equals(Diagnosti.ANSIETAT)
        || this.tipusM.equals("ANTITUSIU") && p.getDiagnosti().equals(Diagnosti.TOS)
        || this.tipusM.equals("ANTIDIABETIC") && p.getDiagnosti().equals(Diagnosti.DIABETIS)
        || this.tipusM.equals("ANTIHISTAMINIC") && p.getDiagnosti().equals(Diagnosti.ALERGIA)) {
                if(numRandom <= 90){
                        p.reduirGravetat();
                }else{
                        p.augmentarGravetat();
                }
         }else if (this.tipusM.equals("ANALGÈSIC ") && p.getDiagnosti().equals(Diagnosti.ESGUINC)) {
         if(numRandom <= 55){
                        p.reduirGravetat();
                }else{
                        p.augmentarGravetat();
                }
         }else{
                p.augmentarGravetat();
         }
   }
}
