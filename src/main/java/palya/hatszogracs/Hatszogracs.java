package main.java.palya.hatszogracs;

import main.java.beallitasok.rendomszamgenerator.RandomSzamGenerator;
import main.java.debugger.Debugger;
import main.java.mentesbetoltes.MentesAdatKezeles;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.palyaelem.PalyaElem;

public class Hatszogracs {
    /**
     * Palya generálása
     *
     * @see RandomSzamGenerator -ez az osztály egy megadott minimum és maximum között generál egy main.java.random számot majd visszatér vele
     * @see PalyaElem -ebben az osztályban tárolodnak a pálya elem értékei:
     * -elfoglaható-e
     * -ki birtokolja
     * -rajta lévő dobokockák száma
     * -és a 6 szomszédja
     * debugMode ha az argumentumba benne szerepel csak akkor fut le vizualizája a pálya felépitését
     */
    public static PalyaElem[][][] palya;

    public Hatszogracs(int palyaMeretN, int palyaMeretM) {
        palya = new PalyaElem[palyaMeretM][palyaMeretN][2];
        for (int i = 0; i < palyaMeretN; i++) {
            for (int x = 0; x < palyaMeretM; x++) {
                for (int z = 0; z < 3; z++) {
                    RandomSzamGenerator doboKockaElosztas = new RandomSzamGenerator(1, 8);
                    int dobokockakSzama = doboKockaElosztas.randomSzamGenerator();
                    palya[i][x][z] = new PalyaElem(dobokockakSzama, false, i, x, z);
                }
            }
        }
        new MentesAdatKezeles().mentesPalya(palya);
        if (!(FoMenuBeallitas.argumantum.length == 0)) {
            for (int i = 0; i < FoMenuBeallitas.argumantum.length; i++) {
                if (FoMenuBeallitas.argumantum[i].equals("debuggMode") || FoMenuBeallitas.argumantum[i].equals("palyaMegjelenites")) {
                    Debugger palyaDebug = new Debugger();
                    palyaDebug.Hatszogracs(palya);
                }
            }
        }
        if (!(FoMenuBeallitas.argumantum.length == 0)) {
            for (int i = 0; i < FoMenuBeallitas.argumantum.length; i++) {
                if (FoMenuBeallitas.argumantum[i].equals("debuggMode") || FoMenuBeallitas.argumantum[i].equals("szomszedok")) {
                    Debugger szomszedekEllenorzes = new Debugger();
                    szomszedekEllenorzes.szomszedEllenorzesH(palya);
                }
            }
        }

    }
}
