package main.java.jatekmenet.tamadas;

import main.java.beallitasok.jatekosertekek.AIEmberTeruletek;
import main.java.jatekmenet.Tamadas;
import main.java.mentesbetoltes.MentesAdatKezeles;
import main.java.palya.palyaelem.PalyaElem;

/**
 * Ha a támadó dobása nagyobb mint a védekezöjé akkor a támadott mezöre tesz anyi dobokockát ahányvolt a támadó mezön - 1
 * @author Koncsik Benedek (G7KJC7)
 */
public class TamadasGyoz {
    public TamadasGyoz(int honanX, int honnanY, int hovaX, int hovaY, PalyaElem[][] palyaTipus){
        palyaTipus[hovaX][hovaY].doboKockaSzam =+ (palyaTipus[honanX][honnanY].doboKockaSzam-1);
        palyaTipus[honanX][honnanY].doboKockaSzam = 1;
        palyaTipus[hovaX][hovaY].kie =  palyaTipus[honanX][honnanY].kie;
        AIEmberTeruletek ujraeloszt = new AIEmberTeruletek();
        ujraeloszt.aiteruletei(palyaTipus);
        System.out.println("Sikeresen elfoglalva!");
        new MentesAdatKezeles().MentesString("Sikeresen elfoglalva!");
    }
}
