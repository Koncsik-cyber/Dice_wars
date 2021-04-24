package main.java.palya.negyszogracs;

import main.java.beallitasok.rendomszamgenerator.RandomSzamGenerator;
import main.java.debugger.Debugger;
import main.java.mentesbetoltes.MentesAdatKezeles;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.palyaelem.PalyaElem;
/**
 * Itt generálodik a pálya!
 * @author Koncsik Benedek (G7KJC7)
 */
public class Negyszogracs {
    public static PalyaElem[][][] palya;
    public Negyszogracs(int palyaMeretN, int palyaMeretM) {
/**
 * Palya generálása
 * @see RandomSzamGenerator -ez az osztály egy megadott minimum és maximum között generál egy main.java.random számot majd visszatér vele
 * @see PalyaElem -ebben az osztályban tárolodnak a pálya elem értékei:
 * -elfoglaható-e
 * -ki birtokolja
 * -rajta lévő dobokockák száma
 * -és a 4 szomszédja
 * debugMode ha az argumentumba benne szerepel csak akkor fut le vizualizája a pálya felépitését
 */
        palya = new PalyaElem[palyaMeretN][palyaMeretM][1];
        for (int i = 0; i < palyaMeretN; i++) {
            for (int x = 0; x < palyaMeretM; x++) {
                RandomSzamGenerator doboKockaElosztas = new RandomSzamGenerator(1,8);
                int dobokockakSzama = doboKockaElosztas.randomSzamGenerator();
                palya[i][x][0] = new PalyaElem(dobokockakSzama, true, i, x, 0);
            }
        }
        new MentesAdatKezeles().mentesPalya(palya);
        if (!(FoMenuBeallitas.argumantum.length == 0)) {
            for (int i = 0; i < FoMenuBeallitas.argumantum.length; i++) {
                if (FoMenuBeallitas.argumantum[i].equals("debuggMode") || FoMenuBeallitas.argumantum[i].equals("palyaMegjelenites")) {
                    Debugger palyaDebug = new Debugger();
                    palyaDebug.negyzetracs(palya);
                }
            }
        }
        if (!(FoMenuBeallitas.argumantum.length == 0)) {
            for (int i = 0; i < FoMenuBeallitas.argumantum.length; i++) {
                if (FoMenuBeallitas.argumantum[i].equals("debuggMode") || FoMenuBeallitas.argumantum[i].equals("szomszedok")){
                    Debugger szomszedekEllenorzes = new Debugger();
                    szomszedekEllenorzes.szomszedEllenorzes(palya);
                }
            }
        }
    }
}
