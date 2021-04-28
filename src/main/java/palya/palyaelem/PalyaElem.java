package main.java.palya.palyaelem;

import main.java.beallitasok.prim.PrimSzam;
import main.java.palya.TeruletElosztas;

/**
 * Itt generálodik a pálya egyes elemeinek különbőző értéke!
 * @author Koncsik Benedek (G7KJC7)
 */
public class PalyaElem {
    public int doboKockaSzam;
    public int kie;
    public boolean elfoglalhatoe;
    public Szomszedok[] szomszedok;

    /**
     *
     * @param doboKockaSzam -randomszám 1-től 8-ig
     * @param negyzetracs -ha igaz akkor négyzetrács ha hamis akkor hatszögrács (még nincs megvalósitva)
     * @param n -a main.java.palya két dimenziós tömb n értéke
     * @param m -a main.java.palya két dimenziós tömb m értéke
     */
    public PalyaElem(int doboKockaSzam, boolean negyzetracs, boolean parosParatlan, int n, int m){
        if (negyzetracs)PalyaElemN(doboKockaSzam, n, m);
        else PalyaElemH(doboKockaSzam, n, m, parosParatlan);
}
public void PalyaElemN(int doboKockaSzam, int n, int m){

    PrimSzam primSzame = new PrimSzam();
    TeruletElosztas teruletElosztas = new TeruletElosztas();

    elfoglalhatoe = !(primSzame.primSzam(1,200));
    if (elfoglalhatoe) kie = teruletElosztas.teruletElosztas();
    else kie = 0;
    this.doboKockaSzam=doboKockaSzam;

    //jobb fent bal lent a szomszédok
    szomszedok = new Szomszedok[4];
    szomszedok[0] = new Szomszedok(true, n, m+1);
    szomszedok[1] = new Szomszedok(true, n-1, m);
    szomszedok[2] = new Szomszedok(true, n, m-1);
    szomszedok[3] = new Szomszedok(true, n+1, m);
}
      public void PalyaElemH(int doboKockaSzam, int n, int m, boolean parosParatlan){

            PrimSzam primSzame = new PrimSzam();
            TeruletElosztas teruletElosztas = new TeruletElosztas();

            elfoglalhatoe = !(primSzame.primSzam(1, 200));
            if (elfoglalhatoe) kie = teruletElosztas.teruletElosztas();
            else kie = 0;
            this.doboKockaSzam = doboKockaSzam;

          if (parosParatlan) {
            szomszedok = new Szomszedok[6];
            szomszedok[0] = new Szomszedok(false, n - 1, m - 1);
            szomszedok[1] = new Szomszedok(false, n - 1, m);
            szomszedok[2] = new Szomszedok(false, n, m - 1);
            szomszedok[3] = new Szomszedok(false, n + 1, m);
            szomszedok[4] = new Szomszedok(false, n + 1, m - 1);
            szomszedok[5] = new Szomszedok(false, n, m - 1);
        }else {
            szomszedok = new Szomszedok[6];
            szomszedok[0] = new Szomszedok(false, n - 1, m);
            szomszedok[1] = new Szomszedok(false, n - 1, m + 1);
            szomszedok[2] = new Szomszedok(false, n, m + 1);
            szomszedok[3] = new Szomszedok(false, n + 1, m + 1);
            szomszedok[4] = new Szomszedok(false, n + 1, m);
            szomszedok[5] = new Szomszedok(false, n, m - 1);
        }
    }
    @Override
    public String toString() {
        return kie + " " + elfoglalhatoe + " " + String.valueOf(doboKockaSzam);

    }
}
