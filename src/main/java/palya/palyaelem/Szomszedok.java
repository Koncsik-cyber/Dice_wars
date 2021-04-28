package main.java.palya.palyaelem;

import main.java.menu.beallitas.FoMenuBeallitas;

/**
 * Itt számolja ki a pálya elem szomszédjait!
 * @author Koncsik Benedek (G7KJC7)
 */
public class Szomszedok {

    public int szomszedN;
    public int szomszedM;
    public boolean letezikASzomszed;

    /**
     *
     * @param negyzetRacs ha igaz(true) akkor négyzetrács ha hamis(false) akkor hatszögrács
     * @param n -main.java.palya n eddig kordinátája (nem az eredeti hanem a paraméterbe át adot változtatott verzió)
     * @param m -main.java.palya m eddig kordinátája (nem, az eredeti hanem a paraméterbe át adot változtatott verzió)
     */
    public Szomszedok(boolean negyzetRacs, int n, int m){
        if (negyzetRacs) negyzetSzomsed(n,m);
        else hatszogSzomsed(n,m);
    }
    /**
     * @param n -main.java.palya n edig kordinátája (nem az eredeti hanem a paraméterbe át adot változtatott verzió)
     * @param m -main.java.palya m edig kordinátája (nem, az eredeti hanem a paraméterbe át adot változtatott verzió)
     * Ha n vagy az M átadott paraméter 0 alá esik akkor az a szomszéd nem létezik és a letezik public változot hamisra(false) értékre álitja minden más esetben igaz(true)
     */
    public void negyzetSzomsed(int n, int m){
        szomszedN = n;
        szomszedM = m;

        if (szomszedN < 0 || szomszedM < 0) letezikASzomszed = false;
        else if(szomszedN >= FoMenuBeallitas.getPalyaMeretN() || szomszedM >= FoMenuBeallitas.getPalyaMeretM()) letezikASzomszed = false;
        else letezikASzomszed = true;
    }
    public void hatszogSzomsed(int n, int m){
        szomszedN = n;
        szomszedM = m;

        if (szomszedN < 0 || szomszedM < 0) letezikASzomszed = false;
        else if(szomszedN >= FoMenuBeallitas.getPalyaMeretN() ) letezikASzomszed = false;
        else letezikASzomszed = true;
    }
}
