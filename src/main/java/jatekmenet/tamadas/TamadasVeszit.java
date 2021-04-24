package main.java.jatekmenet.tamadas;

import main.java.beallitasok.jatekosertekek.AIEmberTeruletek;
import main.java.jatekmenet.Tamadas;
import main.java.mentesbetoltes.MentesAdatKezeles;

public class TamadasVeszit extends Tamadas {
    public TamadasVeszit(int honanX, int honnanY, int honnanZ){
        palyaTipus[honanX][honnanY][honnanZ].doboKockaSzam = 1;
        AIEmberTeruletek ujraeloszt = new AIEmberTeruletek();
        ujraeloszt.aiteruletei(palyaTipus);
        System.out.println("Vesztett!");
        new MentesAdatKezeles().MentesString("Vesztett!");
    }
}
