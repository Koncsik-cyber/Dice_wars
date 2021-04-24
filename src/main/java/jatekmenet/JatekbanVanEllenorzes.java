package main.java.jatekmenet;

import main.java.jatekmenet.jatekbanvanellenorzes.JatekosNyert;
import main.java.jatekmenet.jatekbanvanellenorzes.JatekosVesztesEgyseTipus;
import main.java.jatekmenet.jatekbanvanellenorzes.JatekosVesztesKettesTipus;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.hatszogracs.Hatszogracs;
import main.java.palya.negyszogracs.Negyszogracs;
import main.java.palya.palyaelem.PalyaElem;
public class JatekbanVanEllenorzes {

    protected PalyaElem[][][] palya;
    protected  int gepiEllenfelek = 0;
    protected int zMax;
    public JatekbanVanEllenorzes(){
        if (FoMenuBeallitas.isPalyaTipus()) {
            palya = Negyszogracs.palya;
            zMax = 1;
        }
        else {
            palya = Hatszogracs.palya;
            zMax = 2;
        }
        new JatekosNyert();
        new JatekosVesztesEgyseTipus();
        new JatekosVesztesKettesTipus();
    }
}
