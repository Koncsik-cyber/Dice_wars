package main.java.mentesbetoltes;

import main.java.palya.palyaelem.PalyaElem;

import java.util.LinkedList;

public class MentesAdatKezeles {
    public static LinkedList<String> mentesAdat;

    /**
     * Páklya elmentése
     * @param palya megkaplya az aktuálisan elkészitett négy/hat-szögrács pályát amit soronként elment a mentesAdat listába
     */
    public void mentesPalya(PalyaElem[][][] palya){
        mentesAdat = new LinkedList<>();
        String sor = "";
        for (int i = 0; i < palya.length; i++) {
            for (int x = 0; x < palya[i].length; x++) {
                for (int z = 0; z < palya[i][x].length; z++) {
                    sor += palya[i][x][z] + " ";
                }
            }
            mentesAdat.add(sor);
            sor = "";
            }

        }
    /**
     * Hozzáadja a mentesAdat listához a megkapot String-rt
     * @param adat ez a string amit meghíváskor át ad és azt adja hozzá a mentesAdat listához
     * @return vissza tér a meghiváskor at adott adattal annak érdekében, hogy ne keljen külön sorban megvalósitani a kiratást és a mentést
     */
    public String MentesString(String adat){
        mentesAdat.add(adat);
            return adat;

    }
}
