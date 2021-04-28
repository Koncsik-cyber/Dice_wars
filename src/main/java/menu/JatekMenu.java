package main.java.menu;
import main.java.gepiellenfel.AiViselkedes;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.menu.beallitas.JatekMenuEmber;

/**
 * A játék menete közben megjelenö menü
 * @author Koncsik Benedek (G7KJC7)
 */
public class JatekMenu {
    public static int kineltart;
    public JatekMenu(int kineltart){
        this.kineltart=kineltart;
        kineltartEllenoriz();
        emberPerGep();
    }
    public JatekMenu(){
        kineltartEllenoriz();
        emberPerGep();
    }
    /**
     * Ha a kineltartEllenoriz nézzi, hogy ha a kinéltart szám nagyobb mint a gépiellenfelek száma plusz a játékos száa akkor ellöröl kezdi a számolást
     */
    private void kineltartEllenoriz(){
        if (kineltart > FoMenuBeallitas.getGepiEllenfel()+1){
            kineltart=1;
        }
    }
    /**
     * emberPerGep metodus dönti el, hogy emberi vagy gépi játékos jön, Asszerint készit egy uj @see JatekMenuEmber / $see AiViselkedes osztályt
     */
    private void emberPerGep(){
        if (kineltart == 1) {
            new JatekMenuEmber();
        }else {
           new AiViselkedes(kineltart);
        }
    }
}

