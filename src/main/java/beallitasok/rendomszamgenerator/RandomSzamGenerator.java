package main.java.beallitasok.rendomszamgenerator;

import java.util.Random;
/**
        *Prim szám készités/ellenörzés!
        * @author Koncsik Benedek (G7KJC7)
        */
public class RandomSzamGenerator {
    private int min;
    private int max;
    public int randomSzam = min;
    /**
     * Random szám generálás
     * @param min -az az érték, hogy ami a legkisebb szám lehet amit generál
     * @param max -az a szám ami a legnagyobbb lehet amit generál
     * Természetesen a min és max közötti számokat generá
     */
    public RandomSzamGenerator(int min, int max){
        this.min = min;
        this.max = max;
    }
    /**
     * A kapott min és max között generál számot!
     * @return vissza tér a main.java.random számmal ha nem kisebb mint a min szám
     * Ha kisebb akkor még egyzser lefut
     * @see Random -beépitett java.util.Random segítségével
     */
    public int randomSzamGenerator(){
        Random rn = new Random();
        randomSzam = rn.nextInt(max - min + 1) + min;
        if (randomSzam < min){
            return randomSzamGenerator();
        }else{
            return randomSzam;
        }

    }
}
