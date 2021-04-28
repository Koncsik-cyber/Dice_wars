package main.java.beallitasok.jatekosertekek;

import main.java.gepiellenfel.AiTerulete;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.hatszogracs.Hatszogracs;
import main.java.palya.negyszogracs.Negyszogracs;
import main.java.palya.palyaelem.PalyaElem;
/*
public class Aiteruletei {
    public void aiteruletei(PalyaElem[][] palyaTipus,  AiTerulete[][] teruletei, int[] teruletekSzama) {
        int tomb = FoMenuBeallitas.getGepiEllenfel() + 2;
        teruletekSzama = new int[tomb];
        teruletei = new AiTerulete[tomb][FoMenuBeallitas.getPalyaMeretM() * FoMenuBeallitas.getPalyaMeretN()];
        for (int x = 0; x < FoMenuBeallitas.getPalyaMeretN(); x++) {
            for (int y = 0; y < FoMenuBeallitas.getPalyaMeretM(); y++) {
                    if (!(palyaTipus[x][y].kie == 0)) {
                        int kovetkezo = 0;
                        for (int i = 0; i <= FoMenuBeallitas.getPalyaMeretM() * FoMenuBeallitas.getPalyaMeretN(); i++) {
                            if (teruletei[palyaTipus[x][y].kie][i] == null) {
                                kovetkezo = i;
                                break;
                            }

                        teruletei[palyaTipus[x][y].kie][kovetkezo] = new AiTerulete(x, y, teruletekSzama[palyaTipus[x][y].kie], palyaTipus[x][y].kie);
                        if (FoMenuBeallitas.isPalyaTipus()) teruletekSzama[Negyszogracs.palya[x][y].kie]++;
                        else teruletekSzama[Hatszogracs.palya[x][y].kie]++;
                    }
                }
            }
            new Ellenfelek();
           }
        AIEmberTeruletek.setTeruletei(teruletei);
        AIEmberTeruletek.setTeruletekSzama(teruletekSzama);
    }

}
*/