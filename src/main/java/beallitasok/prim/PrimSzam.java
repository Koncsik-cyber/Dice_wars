package main.java.beallitasok.prim;
import main.java.beallitasok.rendomszamgenerator.RandomSzamGenerator;

/**
 *Prim szám készités/ellenörzés!
 * @author Koncsik Benedek (G7KJC7)
 */
public class PrimSzam {
    public PrimSzam(){}
    /**
     * Prim szám-e?
     * @param min -más osztáylok átadják a minimum értéket ami majd a main.java.random szám generáláshoz kell
     * @param max -más osztáylok átadják a maximum értéket ami majd a main.java.random szám generáláshoz kell
     * @see RandomSzamGenerator -osztály generál egy main.java.random számot a megadott értékek között
     * Majd egy for ciklussal végig megy addig amig elnem éri a generált main.java.random számot
     * a ciklus ban egy if vizsgálattal megnézi hogy az i szám az osztható e a main.java.random számmal
     * ha igen akkor az osztok vátozohóz hozzá ad egyet ha nem akkor tovább lép
     * Ha az osztok nevü változo egyenlő 2 vel akkor prim és igazzal(true) tér vissza ha több akkor hamis(false)
     * @return -vissza térési értéke igaz(true) ha prim szám hami(false) ha nem prim
     */
    public boolean primSzam(int min, int max){
        RandomSzamGenerator randomPrim = new RandomSzamGenerator(min, max);
        int prime = randomPrim.randomSzamGenerator();
        int osztok = 0;
        for (int i = 1; i <= prime; i++){
            if ( prime % i == 0){
                osztok++;
            }
        }
        if (osztok == 2) return true;
        else return false;
    }
}
