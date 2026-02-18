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

         if((this.tipusM == TipusMedicament.ANTIBIOTIC && p.getDiagnosti() == Diagnosti.IBACTERIANA)
         || (this.tipusM == TipusMedicament.ANSIOLÍTIC && p.getDiagnosti() == Diagnosti.ANSIETAT)
         || (this.tipusM == TipusMedicament.ANTITUSIU && p.getDiagnosti() == Diagnosti.TOS)
         || (this.tipusM == TipusMedicament.ANTIDIABETIC && p.getDiagnosti() == Diagnosti.DIABETIS)
         || (this.tipusM == TipusMedicament.ANTIHISTAMINIC && p.getDiagnosti() == Diagnosti.ALERGIA)) {

            if(numRandom <= 90) {
               p.reduirGravetat();
            }else {
               p.augmentarGravetat();
            }

        }else if(this.tipusM == TipusMedicament.ANALGÈSIC && p.getDiagnosti() == Diagnosti.ESGUINC) {

         if (numRandom <= 55) {
            p.reduirGravetat();
        }else{
           p.augmentarGravetat();
        }

       }else{
         p.augmentarGravetat();
       }
   }
}
