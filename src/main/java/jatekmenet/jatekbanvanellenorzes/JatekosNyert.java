package main.java.jatekmenet.jatekbanvanellenorzes;

import main.java.Main;
import main.java.beallitasok.jatekosertekek.AIEmberTeruletek;
import main.java.beallitasok.jatekosertekek.Ellenfelek;
import main.java.mentesbetoltes.MentesAdatKezeles;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.palyaelem.PalyaElem;

/**
 * Ellenörzi, hogy a játkos nyert-e
 * @author Koncsik Benedek (G7KJC7)
 */
public class JatekosNyert {
    public JatekosNyert(PalyaElem[][] palya) {
        for (int i = 1; i < FoMenuBeallitas.getGepiEllenfel() + 2; i++) {
            if (AIEmberTeruletek.teruletekSzama[i] == 0) {
                Ellenfelek.ellenfelekTomb.add(i, (-1 * i));
            }
        }
        for (int i = 1; i < FoMenuBeallitas.getGepiEllenfel() + 1; i++) {
            if (Ellenfelek.ellenfelekTomb.get(i) <= 0) {
                System.out.println(new MentesAdatKezeles().MentesString("A játékos nyert"));
                System.out.println(new MentesAdatKezeles().MentesString("<================ :) ================>"));
                System.out.println("Új játék?");
                Main.beallitas();
            }
        }
    }

}
