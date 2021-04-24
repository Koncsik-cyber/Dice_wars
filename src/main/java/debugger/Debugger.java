package main.java.debugger;

import main.java.beallitasok.jatekosertekek.Ellenfelek;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.palyaelem.PalyaElem;

import java.util.Iterator;

/**
 *Játék debugg modja!
 * @author Koncsik Benedek (G7KJC7)
 */
public class Debugger {
    public Debugger() {
    }

    public void szomszedEllenorzes(PalyaElem[][][] palya) {
        System.out.println("A kiírások a 0 0 elemre szólnak!");
        System.out.println("A [0][0] szomsedja jobb: " + palya[0][0][0].szomszedok[0].szomszedN + "," + palya[0][0][0].szomszedok[0].szomszedM);
        System.out.println("A [0][0] szomsedja fent: " + palya[0][0][0].szomszedok[1].szomszedN + "," + palya[0][0][0].szomszedok[1].szomszedM);
        System.out.println("A [0][0] szomsedja bal: " + palya[0][0][0].szomszedok[2].szomszedN + "," + palya[0][0][0].szomszedok[2].szomszedM);
        System.out.println("A [0][0] szomsedja lent: " + palya[0][0][0].szomszedok[3].szomszedN + "," + palya[0][0][0].szomszedok[3].szomszedM);
        System.out.println("Létezik a szomszéd? " + palya[0][0][0].szomszedok[2].letezikASzomszed);
    }

    public void szomszedEllenorzesH(PalyaElem[][][] palya) {
        System.out.println("A kiírások a 0 0 elemre szólnak!");
        System.out.println("A [0][0][0] szomsedja jobb: " + palya[0][0][0].szomszedok[0].szomszedN + "," + palya[0][0][0].szomszedok[0].szomszedM+","+palya[0][0][0].szomszedok[0].szomszedX);
        System.out.println("A [0][0][0] szomsedja fent: " + palya[0][0][0].szomszedok[1].szomszedN + "," + palya[0][0][0].szomszedok[1].szomszedM+","+palya[0][0][0].szomszedok[1].szomszedX);
        System.out.println("A [0][0][0] szomsedja bal: " + palya[0][0][0].szomszedok[2].szomszedN + "," + palya[0][0][0].szomszedok[2].szomszedM+","+palya[0][0][0].szomszedok[2].szomszedX);
        System.out.println("A [0][0][0] szomsedja lent: " + palya[0][0][0].szomszedok[3].szomszedN + "," + palya[0][0][0].szomszedok[3].szomszedM+","+palya[0][0][0].szomszedok[3].szomszedX);
        System.out.println("A [0][0][0] szomsedja terben Fent: " + palya[0][0][0].szomszedok[4].szomszedN + "," + palya[0][0][0].szomszedok[4].szomszedM+","+palya[0][0][0].szomszedok[4].szomszedX);
        System.out.println("A [0][0][0] szomsedja terben lent: " + palya[0][0][0].szomszedok[5].szomszedN + "," + palya[0][0][0].szomszedok[5].szomszedM +","+palya[0][0][0].szomszedok[5].szomszedX);
        System.out.println("Létezik a szomszéd? " + palya[0][0][0].szomszedok[2].letezikASzomszed);
    }

    /**
     * első szám a kie(1 játékos 2,3,4,5..... gépi ellenfél) a második érték boolean ha elfoglalható akkor igaz(true) ha nem akkor hamis(false) harmadik érték a pályán lévő dobokockák száma
     *
     * @param palya - az adot pálya tömb ezt irja ki
     */
    public void negyzetracs(PalyaElem[][][] palya) {
        int palyaElemSzam = 0;
        for (int x = 0; x < FoMenuBeallitas.getPalyaMeretN(); x++) {
            for (int y = 0; y < FoMenuBeallitas.getPalyaMeretM(); y++) {
                if ((x + y) % 2 == 0) {
                    System.out.print("| ■ " + palya[x][y][0] + " ■ |");
                    palyaElemSzam++;
                } else {
                    System.out.print("| □ " + palya[x][y][0] + " □ |");
                    palyaElemSzam++;
                }
            }
            System.out.println();
        }
        System.out.println("Összes pálya elem száma: " + palyaElemSzam);

    }

    public void Hatszogracs(PalyaElem[][][] palya) {
        int palyaElemSzam = 0;
        for (int x = 0; x < FoMenuBeallitas.getPalyaMeretN(); x++) {
            for (int y = 0; y < FoMenuBeallitas.getPalyaMeretM(); y++) {
                for (int z = 0; z < FoMenuBeallitas.getPalyaMeretN(); z++) {
                    if ((x + y) % 2 == 0) {
                        System.out.print("| ■ " + palya[x][y][z] + " ■ |");
                        palyaElemSzam++;
                    } else {
                        System.out.print("| □ " + palya[x][y][z] + " □ |");
                        palyaElemSzam++;
                    }
                }
                System.out.println();
            }
            System.out.println("Összes pálya elem száma: " + palyaElemSzam);

        }
/*
    public void palyaEloszottTerulet(){
        System.out.println("Elosztott területek: " + Arrays.toString(TeruletElosztas.kinekHanyTeruletvan));
        System.out.println("Elosztott terulet összesen: " + TeruletElosztas.eloszottTerulet);
        System.out.println("Elosztható terulet ami maradt: " + TeruletElosztas.eloszthatoTerulet);
    }
    public void kinekHanyadik(PalyaElem[][][] palya){

        for (int i = 0; i < AIEmberTeruletek.teruletei.length; i++){
            int k=1;
            for (int x = 0; x < AIEmberTeruletek.teruletei[i].length; x++){
                System.out.print(" "+ k + AIEmberTeruletek.teruletei[i][x]);
                k++;
            }
            System.out.println();
        }
        System.out.println();
        /*for (int i=0; i < palya.length; i++){
            for (int x=0; x < palya[i].length; x++){
                System.out.print(" Kie: " + palya[i][x].kie);
            }
        }
    }
    public void kinenHanyadikTeruletKicsi(){
        System.out.print("Ember gépi ellenfél területei: ");
        Iterator<Integer> it = Ellenfelek.ellenfelekTomb.iterator();
        while(it.hasNext()) {
            Integer elem = it.next();
            System.out.print(elem + " ");
        }

    }

    */
    }
}
