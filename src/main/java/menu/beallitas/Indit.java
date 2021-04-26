package main.java.menu.beallitas;

import main.java.beallitasok.jatekosertekek.AIEmberTeruletek;
import main.java.gepiellenfel.aibealitasa.AutoBeallitas;
import main.java.menu.FoMenu;
import main.java.menu.JatekMenuBetoltes;
import main.java.palya.Palya;
import main.java.palya.TeruletElosztas;
import main.java.palya.hatszogracs.Hatszogracs;
import main.java.palya.negyszogracs.Negyszogracs;

/**
 * Ez a indit osztály hivja meg a palya osztályt ami majd generálja a kiválasztott pálya tipust
 * @author Koncsik Benedek (G7KJC7)
 *A FoMenu.beVanÉllitva staticus boolean érték tárolja, azt, hogy a ember külön végig ment a gépi ellenfelek beéllitásán vagy nem.
 * Ha nem akkor meghívja a gepiEllenfél automatikus beállitását
 */
public class Indit {
    public Indit(int valaszt, int palyaMeretN, int palyaMeretM, boolean palyaTipus){
        switch (valaszt){
        case 1:
            System.out.println("Játék inditása");
            TeruletElosztas.elosztahotterulet();
            new Palya(palyaMeretN, palyaMeretM, palyaTipus);
            AIEmberTeruletek terulet = new AIEmberTeruletek();
            if (palyaTipus) terulet.aiteruletei(Negyszogracs.palya);
            else terulet.aiteruletei(Hatszogracs.palya);
            if (!FoMenu.beVanAllitva) {
                new AutoBeallitas();
            }
            break;
        case 2:
            System.out.println("játék betőltése");
            new JatekMenuBetoltes();
            break;
        default:
            System.err.println("Kérem egyes vagy kettes számott írjon!");
    }
    }
}
