package main.java.jatekmenet.jatekbanvanellenorzes;

import main.java.Main;
import main.java.beallitasok.jatekosertekek.AIEmberTeruletek;
import main.java.beallitasok.jatekosertekek.Ellenfelek;
import main.java.jatekmenet.JatekbanVanEllenorzes;
import main.java.mentesbetoltes.MentesAdatKezeles;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.palyaelem.PalyaElem;

/**
 * Ellenörzi, hogy a játkos nyert-e
 * @author Koncsik Benedek (G7KJC7)
 */
public class JatekosNyert extends JatekbanVanEllenorzes {
    public JatekosNyert(){
        for (int i = 1; i < FoMenuBeallitas.getGepiEllenfel() + 2; i++) {
            if (AIEmberTeruletek.teruletekSzama[i] == 0) {
                Ellenfelek.ellenfelekTomb.add(i, (-1 * i));
            }
        }
        for (int i = 1; i < FoMenuBeallitas.getGepiEllenfel() + 1; i++) {
            if (Ellenfelek.ellenfelekTomb.get(i) <= 0) {
                System.out.println("A játékos nyert!");
                System.out.println("<================ :) ================>");
                System.out.println("Új játék?");
                new MentesAdatKezeles().MentesString("A játékos vesztett");
                new MentesAdatKezeles().MentesString("<================ :) ================>");
                //Main.beallitas();
            }
        }

        for (int i = 0; i < palya.length; i++) {
            for (int x = 0; x < palya[i].length; x++) {
                for (int z = 0; z < zMax; z++) {
                    if (palya[i][x][z].kie < 2) {
                        gepiEllenfelek++;
                    }
                }
            }
        }
    }
}
