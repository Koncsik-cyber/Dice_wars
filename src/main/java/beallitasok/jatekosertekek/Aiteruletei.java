package main.java.beallitasok.jatekosertekek;

import main.java.gepiellenfel.AiTerulete;
import main.java.jatekmenet.JatekbanVanEllenorzes;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.hatszogracs.Hatszogracs;
import main.java.palya.negyszogracs.Negyszogracs;
import main.java.palya.palyaelem.PalyaElem;

public class Aiteruletei extends AIEmberTeruletek {


    public void aiteruletei(PalyaElem[][][] palyaTipus) {
        int negyPerHat;
        if (FoMenuBeallitas.isPalyaTipus()) {
            negyPerHat = 1;
        }
            else negyPerHat = 2;
        int tomb = FoMenuBeallitas.getGepiEllenfel() + 2;
        teruletekSzama = new int[tomb];
        teruletei = new AiTerulete[tomb][FoMenuBeallitas.getPalyaMeretM() * FoMenuBeallitas.getPalyaMeretN()];
        for (int x = 0; x < FoMenuBeallitas.getPalyaMeretN(); x++) {
            for (int y = 0; y < FoMenuBeallitas.getPalyaMeretM(); y++) {
                    for (int z = 0; z < negyPerHat; z++) {
                    if (!(palyaTipus[x][y][z].kie == 0)) {
                        int kovetkezo = 0;
                        for (int i = 0; i <= FoMenuBeallitas.getPalyaMeretM() * FoMenuBeallitas.getPalyaMeretN(); i++) {
                            if (teruletei[palyaTipus[x][y][z].kie][i] == null) {
                                kovetkezo = i;
                                break;
                            }
                        }
                        teruletei[palyaTipus[x][y][z].kie][kovetkezo] = new AiTerulete(x, y, z, teruletekSzama[palyaTipus[x][y][z].kie], palyaTipus[x][y][z].kie);
                        if (FoMenuBeallitas.isPalyaTipus()) teruletekSzama[Negyszogracs.palya[x][y][z].kie]++;
                        else teruletekSzama[Hatszogracs.palya[x][y][z].kie]++;
                    }
                }
            }
            new Ellenfelek();
           }
    }
}
