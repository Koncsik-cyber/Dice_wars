package main.java.jatekmenet.ember;

import main.java.jatekmenet.ember.tamadkiratas.MitTamadEmberTamadas;
import main.java.jatekmenet.ember.tamadkiratas.MitTamademberKiras;
import main.java.mentesbetoltes.MentesAdatKezeles;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.hatszogracs.Hatszogracs;
import main.java.palya.negyszogracs.Negyszogracs;
import main.java.palya.palyaelem.PalyaElem;

import java.util.Scanner;

public class MitTamadhatEmber{

    protected PalyaElem[][][] palyaTipus;
    protected  int nemTamd = 0;
    public MitTamadhatEmber(int honanX, int honanY, int honanZ){
        if(FoMenuBeallitas.isPalyaTipus()) palyaTipus = Negyszogracs.palya;
        else palyaTipus = Hatszogracs.palya;
        if  (palyaTipus[honanX][honanY][honanZ].doboKockaSzam > 1) {
            for (int i = 0; i < palyaTipus[honanX][honanY][honanZ].szomszedok.length; i++) {
                if (palyaTipus[honanX][honanY][honanZ].szomszedok[i].letezikASzomszed) {
                        new MitTamademberKiras(i, honanX, honanY, honanZ, palyaTipus);
                    }
            }
        }else {
            System.out.println(new MentesAdatKezeles().MentesString("Innen nem lehet támadás inditani válasszon másik mezőt!"));
            new MelyikTamdaja();
        }

        if (nemTamd == 5) {
            System.out.println(new MentesAdatKezeles().MentesString("Innen nem lehet támadás inditani válasszon másik mezőt!"));
            new MelyikTamdaja();
        }
        Scanner scanf = new Scanner(System.in);
        System.out.println("Melyik irányba induljon a támadás? (1-4/6--> irja be melyik irányba 99--> mégsem támad)");
        int tamadase = scanf.nextInt();
        new MentesAdatKezeles().MentesString("Melyik irányba induljon a támadás? (1-4/6--> irja be melyik irányba 999--> mégsem támad)--> " + tamadase);
        new MitTamadEmberTamadas(tamadase, honanX, honanY, honanZ, palyaTipus);
    }
}
