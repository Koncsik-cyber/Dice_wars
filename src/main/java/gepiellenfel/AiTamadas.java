package main.java.gepiellenfel;

import main.java.palya.negyszogracs.Negyszogracs;
import main.java.beallitasok.rendomszamgenerator.RandomSzamGenerator;
import main.java.beallitasok.jatekosertekek.AIEmberTeruletek;

public class AiTamadas {
    private int terulet;
    protected int aiTamadX;
    protected int aiTamadY;
private int kitTamad;
protected int aiTamadSzomszedX;
protected int aiTamadSzomszedY;
    public AiTamadas(int hanyadik){
        RandomSzamGenerator melyikTerulet = new RandomSzamGenerator(0, AIEmberTeruletek.teruletekSzama[hanyadik]-1); //területek indexe miatt kell a -1
        RandomSzamGenerator merre = new RandomSzamGenerator(0,3); //merre 0..3 jobb fen bal lent
        terulet = melyikTerulet.randomSzamGenerator();
        aiTamadX = AIEmberTeruletek.teruletei[hanyadik][terulet].x;
        aiTamadY = AIEmberTeruletek.teruletei[hanyadik][terulet].y;
        if (Negyszogracs.palya[aiTamadX][aiTamadY].doboKockaSzam < 2){
            new AiViselkedes(hanyadik);
        }else {
            kitTamad = merre.randomSzamGenerator();
            if (Negyszogracs.palya[aiTamadSzomszedX][aiTamadSzomszedY].szomszedok[kitTamad].letezikASzomszed) {
                aiTamadSzomszedX = Negyszogracs.palya[aiTamadSzomszedX][aiTamadSzomszedY].szomszedok[kitTamad].szomszedN;
                aiTamadSzomszedY = Negyszogracs.palya[aiTamadSzomszedX][aiTamadSzomszedY].szomszedok[kitTamad].szomszedM;
            } else {
                new AiTamadas(hanyadik);
            }
        }
    }
}
