package main.java.jatekmenet.jatekbanvanellenorzes;

import main.java.Main;
import main.java.jatekmenet.JatekbanVanEllenorzes;
import main.java.mentesbetoltes.MentesAdatKezeles;
/**
 * Játlkost nézi, hogy játékban van-e. Egyes tipus azt nézi, hogy van e más gépi ellenfél.
 * @author Koncsik Benedek (G7KJC7)
 */
public class JatekosVesztesEgyseTipus extends JatekbanVanEllenorzes {
    public JatekosVesztesEgyseTipus(){
        if (gepiEllenfelek == 0) {
            System.out.println(new MentesAdatKezeles().MentesString("A játékos nyert"));
            System.out.println(new MentesAdatKezeles().MentesString("<================ :) ================>"));
            System.out.println("Uj játék?");
            Main.beallitas();
        }
    }
}
