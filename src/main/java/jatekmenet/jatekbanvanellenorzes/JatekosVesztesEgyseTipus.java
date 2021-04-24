package main.java.jatekmenet.jatekbanvanellenorzes;

import main.java.Main;
import main.java.jatekmenet.JatekbanVanEllenorzes;
import main.java.mentesbetoltes.MentesAdatKezeles;

public class JatekosVesztesEgyseTipus extends JatekbanVanEllenorzes {
    public JatekosVesztesEgyseTipus(){
        if (gepiEllenfelek == 0) {
            System.out.println("A játékos nyert!");
            System.out.println("<================ :) ================>");
            System.out.println("Uj játék?");
            new MentesAdatKezeles().MentesString("A játékos nyert");
            new MentesAdatKezeles().MentesString("<================ :) ================>");
            Main.beallitas();
        }
    }
}
