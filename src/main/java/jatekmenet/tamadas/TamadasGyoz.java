package main.java.jatekmenet.tamadas;

import main.java.beallitasok.jatekosertekek.AIEmberTeruletek;
import main.java.jatekmenet.Tamadas;
import main.java.mentesbetoltes.MentesAdatKezeles;

public class TamadasGyoz extends Tamadas {
    public TamadasGyoz(int honanX, int honnanY, int honnanZ, int hovaX, int hovaY, int hovaZ){
        palyaTipus[hovaX][hovaY][hovaZ].doboKockaSzam =+ (palyaTipus[honanX][honnanY][honnanZ].doboKockaSzam-1);
        palyaTipus[honanX][honnanY][honnanZ].doboKockaSzam = 1;
        palyaTipus[hovaX][hovaY][hovaZ].kie =  palyaTipus[honanX][honnanY][honnanZ].kie;
        AIEmberTeruletek ujraeloszt = new AIEmberTeruletek();
        ujraeloszt.aiteruletei(palyaTipus);
        System.out.println("Sikeresen elfoglalva!");
        new MentesAdatKezeles().MentesString("Sikeresen elfoglalva!");
    }
}
