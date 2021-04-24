package main.java.menu.beallitas;

import main.java.beallitasok.jatekosertekek.AIEmberTeruletek;
import main.java.menu.FoMenu;
import main.java.menu.JatekMenuBetoltes;
import main.java.palya.Palya;
import main.java.palya.TeruletElosztas;
import main.java.palya.hatszogracs.Hatszogracs;
import main.java.palya.negyszogracs.Negyszogracs;

public class Indit extends FoMenuBeallitas {
    public Indit(int valaszt){
        switch (valaszt){
        case 1:
            System.out.println("Játék inditása");
            TeruletElosztas.elosztahotterulet();
            new Palya(palyaMeretN, palyaMeretM, palyaTipus);
            AIEmberTeruletek terulet = new AIEmberTeruletek();
            if (palyaTipus) terulet.aiteruletei(Negyszogracs.palya);
            else terulet.aiteruletei(Hatszogracs.palya);
            if (!FoMenu.beVanAllitva) {
                FoMenu gep = new FoMenu();
                gep.gepiEllenfel(true);
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
