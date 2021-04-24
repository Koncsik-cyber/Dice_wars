package main.java.palya.megjelenites;

import main.java.beallitasok.jatekosertekek.Ellenfelek;
import main.java.mentesbetoltes.MentesAdatKezeles;

/**
 * A játék közbeni területekeit írja ki
 * @author Koncsik Benedek (G7KJC7)
 */
public class PalyaEmberTeruletSzam {
    public PalyaEmberTeruletSzam(){
        for (int i = 0; i < Ellenfelek.ellenfelekTomb.size(); i++)
            System.out.println(new MentesAdatKezeles().MentesString(((i == 0) ? "A jatékos" : "A "+ i +". gépiellenfél") + " terület/i-nek száma: " + Ellenfelek.ellenfelekTomb.get(i)));
        }
    }