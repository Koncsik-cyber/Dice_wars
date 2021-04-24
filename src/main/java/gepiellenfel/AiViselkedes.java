package main.java.gepiellenfel;
import main.java.beallitasok.jatekosertekek.Ellenfelek;
import main.java.mentesbetoltes.MentesAdatKezeles;
import main.java.menu.JatekMenu;
import main.java.beallitasok.rendomszamgenerator.RandomSzamGenerator;
import main.java.jatekmenet.Tamadas;
import main.java.menu.beallitas.FoMenuBeallitas;

/**
 *Gépi ellenfél gondolatai!
 * @author Koncsik Benedek (G7KJC7)
 */
    public class AiViselkedes {
    protected int agreszivitas;
    protected int hanyadikIndex;
    protected static int maxTamadas;
public AiViselkedes(){}
    /**
     * Itt dönti el az adott gépi ellenfél, hogy támadjon-e
     *
     * @param hanyadik -melyik gépiellenfél támadna
     * A tamade metodus igazzal(true) tér vissza akkor támad és meghivja a tamad metodust
     *           ha hamis(false) akkor a nemTamad metodust
     */
    public AiViselkedes(int hanyadik){
        hanyadikIndex=hanyadik-2;
        if(Ellenfelek.ellenfelekTomb.get(hanyadikIndex) < 0){
            System.out.println(new MentesAdatKezeles().MentesString("A " + hanyadik + ". gépi ellenfél kiesett!"));
            JatekMenu.kineltart++;
            new JatekMenu();
            }else {
            agreszivitas = AiBealitas.gepiEllenfel[hanyadikIndex].nehezseg;
            if (tamede(hanyadikIndex)) tamad(hanyadik);
                else nemTamad(hanyadik);

        }
    }
    /**
     * Itt egy egyszerű oszthatósággal eldönti, hogy támad-e
     * @see RandomSzamGenerator -osztályal generálok egy 1 és 100 közötti main.java.random számot
     * @param hanyadik -a gépi ellenfé
     * @return -igaz(true) ha osztható a generált main.java.random szám a gépi ellenfél agreszivitás/nehezsegi szintjével (1-10-es skálán 1 a nehéz 10 a könnyű)
     */
    public boolean tamede(int hanyadik){
        RandomSzamGenerator rn = new RandomSzamGenerator(1, 100);
        if (AiBealitas.gepiEllenfel[hanyadik].nehezseg == 10) new AiOkos();
        if (rn.randomSzamGenerator() % AiBealitas.gepiEllenfel[hanyadik].nehezseg == 0) return true;
            else return false;
        }
    public void tamad(int hanyadik){
        AiTamadas tamad = new AiTamadas(hanyadik);
        Tamadas aiTamd = new Tamadas();
        aiTamd.tamdasIndul(tamad.aiTamadX, tamad.aiTamadY, tamad.aiTamadZ, tamad.aiTamadSzomszedX,tamad.aiTamadSzomszedY, tamad.aiTamadSzomszedZ, FoMenuBeallitas.isPalyaTipus());
        maxTamadas++;
        if (maxTamadas == 5){
            maxTamadas=0;
            nemTamad(hanyadik);
        }else {
            new AiViselkedes(hanyadik);
        }
    }
    public void nemTamad(int hanyadik){
        System.out.println(new MentesAdatKezeles().MentesString("A " + hanyadik + " gépi ellenfél nem támad."));
        JatekMenu.kineltart++;
        new JatekMenu();
    }
}
