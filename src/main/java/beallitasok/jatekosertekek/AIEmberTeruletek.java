package main.java.beallitasok.jatekosertekek;
import main.java.debugger.Debugger;
import main.java.gepiellenfel.AiTerulete;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.hatszogracs.Hatszogracs;
import main.java.palya.negyszogracs.Negyszogracs;
import main.java.palya.palyaelem.PalyaElem;
public class AIEmberTeruletek {
    public static AiTerulete[][] teruletei;
    public static int[] teruletekSzama;

    public void  aiteruletei(PalyaElem[][] palya) {
        int tomb = FoMenuBeallitas.getGepiEllenfel() + 2;
        teruletekSzama = new int[tomb];
        teruletei = new AiTerulete[tomb][FoMenuBeallitas.getPalyaMeretM() * FoMenuBeallitas.getPalyaMeretN()];
        for (int x = 0; x < FoMenuBeallitas.getPalyaMeretN(); x++) {
            for (int y = 0; y < FoMenuBeallitas.getPalyaMeretM(); y++) {
                if (!(palya[x][y].kie == 0)) {
                    int kovetkezo = 0;
                    for (int i = 0; i <= FoMenuBeallitas.getPalyaMeretM() * FoMenuBeallitas.getPalyaMeretN(); i++) {
                        if (teruletei[palya[x][y].kie][i] == null) {
                            kovetkezo = i;
                            break;
                        }
                    }
                        teruletei[palya[x][y].kie][kovetkezo] = new AiTerulete(x, y, teruletekSzama[palya[x][y].kie], palya[x][y].kie);
                        teruletekSzama[palya[x][y].kie]++;

                    }
            }
            new Ellenfelek();
        }
        if (!(FoMenuBeallitas.argumantum.length == 0)) {
            for (int i = 0; i < FoMenuBeallitas.argumantum.length; i++) {
                if (FoMenuBeallitas.argumantum[i].equals("debuggMode") || FoMenuBeallitas.argumantum[i].equals("kinenHanyadikTerulet")) {
                   new Debugger();
                }
            }
        }
    }
}