package hospital4;
import java.util.Random;
public class Terapia extends Tractament{

   TipusTerapia tipusT;
    
    public Terapia(String nom, TipusTerapia tipusT) {
        super(nom);
        this.tipusT = tipusT;
    }

        public void administrar(PacientHospitalitzat p) {

        if(!super.actualitzarQuantitat()){
        System.out.println("Quantitat insuficient");
        return;
        }

        Random random = new Random();
        int numRandom = random.nextInt(101);

        if (this.tipusT.equals("FISIO") && p.getDiagnosti().equals(Diagnosti.ESGUINC)
        || this.tipusT.equals("PSICO") && p.getDiagnosti().equals(Diagnosti.ANSIETAT)
        || this.tipusT.equals("NUTRICIONAL") && p.getDiagnosti().equals(Diagnosti.RESTRENYIMENT)
        || this.tipusT.equals("NUTRICIONAL") && p.getDiagnosti().equals(Diagnosti.DIABETIS)) {
                if(numRandom <= 90){
                        p.reduirGravetat();
                }else{
                        p.augmentarGravetat();
                }
         }else if (this.tipusT.equals("TIMO")) {
         p.augmentarGravetat();
        }
   
     }
}
