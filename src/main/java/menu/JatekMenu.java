package main.java.menu;
import main.java.gepiellenfel.AiViselkedes;
import main.java.jatekmenet.KovetkezoKorDobokockaElosztas;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.menu.beallitas.JatekMenuEmber;
public class JatekMenu {
    public static int kineltart;
    public JatekMenu(int kineltart){
        this.kineltart=kineltart;
        kineltartEllenoriz();
        emberPerGep();
    }
    public JatekMenu(){}
     public void tovabbLep(){
        System.out.println("A következő játékos jön!");
        new KovetkezoKorDobokockaElosztas(kineltart);
        kineltart++;
        new JatekMenu(kineltart);
    }
    private void kineltartEllenoriz(){
        if (kineltart > FoMenuBeallitas.getGepiEllenfel()+1){
            kineltart=1;
        }
    }
    private void emberPerGep(){
        if (kineltart == 1) {
            new JatekMenuEmber();
        }else {
           new AiViselkedes(kineltart);
        }
    }
}

