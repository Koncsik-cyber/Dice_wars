package main.java.palya;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.beallitasok.rendomszamgenerator.RandomSzamGenerator;
import main.java.beallitasok.prim.PrimSzam;
/**
 * Itt osztodik el a területek!
 * @author Koncsik Benedek (G7KJC7)
 */
public class TeruletElosztas {
    public static int elosztottTerulet = 0;
    public static int eloszthatoTerulet;
    public static int[] kinekHanyTeruletvan;
    public static int eloszottTerulet;
    public static int aktualJatekos = 0;
    public TeruletElosztas(){}
    /**
     * elosztahto terület metodus létrehoz egy anyi elemű tombot ahány gépi ellenfél van +1 ami a játékos
     * és kiszámolja menyi területett lehet maximum elosztani
     */
    public static void elosztahotterulet(){
                int tomb = FoMenuBeallitas.getGepiEllenfel()+1;
        kinekHanyTeruletvan = new int[tomb];
        eloszthatoTerulet = FoMenuBeallitas.getPalyaMeretM()*FoMenuBeallitas.getPalyaMeretN();
    }
    /**
     * meg vizsgálja, hogy a terület elfoglalható-e ha igen akkor generál egy számot és a
     * ellenörzi, hogy az aktualis játékos létetzik-e ha nem akkor 0 ra azza az "emberre" álitja
     * a  kaphatemég metodust meghívja és ha igazza(true) tér vissza továbblép (ellenörzi, hogy az aktuális játékosnak menyi területe van)
     * ha tovább lép akkor a kinakVanTerulet tömbe az aktuuális játékoshoz tartozo értéket megnöveli egyel az elosztahtoTerulet változot meg csökenti
     * (eloszottTerulet csökenti ennek a debugmod nál van haszna ellenörzéskor)
     * és az aktuális játékos növeli egyel
     * @return -visszatér azzal a játékossal aki akpja aterületett vagy ha semleges terület akkor 0-val
     */
    public int teruletElosztas() {
        if (!(eloszthatoTerulet == elosztottTerulet)){
                if (aktualJatekos == (FoMenuBeallitas.getGepiEllenfel()+1)) aktualJatekos = 0;
                if (kaphateMeg(aktualJatekos)) {
                    kinekHanyTeruletvan[aktualJatekos]++;
                    eloszthatoTerulet--;
                    eloszottTerulet++;
                    aktualJatekos++;
                    return aktualJatekos;
                }
       }
    return 0;
    }
    /**
     * Ellenörzi menyi területe van az aktuális játékosnak!
     * @param aktualJatekos a teruletElosztás metodus átadja az aktuális játékos számát
     * ha nincs még területe akkor kaphat ha már van akkor elenörzi, hogy a kinakVanTerulet tömb aktuálJátékos indexében mennyi az értéke
     * Egy Játékosnak anyi kezdő mezője lehet ahány területett lehet kiosztani/amenyi gépi + Ember játszik
     * @return -visszatér igazzal(true) ha kaphat területet hamissal(false) ha már nem kaphat
     */
    private boolean kaphateMeg(int aktualJatekos){
        int tomb = FoMenuBeallitas.getGepiEllenfel()+1;
        if (kinekHanyTeruletvan[aktualJatekos] == 0)return true;
        else if (kinekHanyTeruletvan[aktualJatekos] == (elosztottTerulet / tomb)) return false;
        else return true;
    }
}
