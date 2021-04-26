package main.java.jatekmenet;

import main.java.jatekmenet.jatekbanvanellenorzes.JatekosNyert;
import main.java.jatekmenet.jatekbanvanellenorzes.JatekosVesztesEgyseTipus;
import main.java.jatekmenet.jatekbanvanellenorzes.JatekosVesztesKettesTipus;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.hatszogracs.Hatszogracs;
import main.java.palya.negyszogracs.Negyszogracs;
import main.java.palya.palyaelem.PalyaElem;

/**
 * Ellenörzi, hogy a gép/játékos, játékban van e vagy kiesett
 * @author Koncsik Benedek (G7KJC7)
 */
public class JatekbanVanEllenorzes {

    protected PalyaElem[][] palya;
    protected  int gepiEllenfelek = 0;
    public JatekbanVanEllenorzes(){
        if (FoMenuBeallitas.isPalyaTipus()) {
            palya = Negyszogracs.palya;
        }
        else {
            palya = Hatszogracs.palya;
        }
        for (int i = 0; i < palya.length; i++) {
            for (int x = 0; x < palya[i].length; x++) {
                    if (palya[i][x].kie < 2) {
                        gepiEllenfelek++;
                    }
            }
        }
        new JatekosNyert(palya);
        new JatekosVesztesEgyseTipus(gepiEllenfelek);
        new JatekosVesztesKettesTipus(palya);
    }
}
