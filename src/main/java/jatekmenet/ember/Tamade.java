package main.java.jatekmenet.ember;

import main.java.jatekmenet.Tamadas;
import main.java.mentesbetoltes.MentesAdatKezeles;
import main.java.menu.beallitas.FoMenuBeallitas;


public class Tamade {
    public void tamade(char valasz,int x,int y){
        if (valasz == 'i') new MitTamadhatEmber(x,y);
        else new MelyikTamdaja();
    }
    public void inditETamadast(int valasz, int honnanX, int honnanY, int hovaX, int hovaY){
        if (FoMenuBeallitas.isPalyaTipus()) {
            if (valasz == 1 || valasz == 2 || valasz == 3 || valasz == 4) {
                System.out.println(new MentesAdatKezeles().MentesString("Induljon a terület elfoglalása!"));
                System.out.println(new MentesAdatKezeles().MentesString("========>X<========"));
                Tamadas tamad = new Tamadas();
                tamad.tamdasIndul(honnanX, honnanY, hovaX, hovaY, true);
            } else new MelyikTamdaja();
        }else {
            if (valasz == 1 || valasz == 2 || valasz == 3 || valasz == 4 || valasz == 5 || valasz == 6) {
                System.out.println(new MentesAdatKezeles().MentesString("Induljon a terület elfoglalása!"));
                System.out.println(new MentesAdatKezeles().MentesString("========>X<========"));
                Tamadas tamad = new Tamadas();
                tamad.tamdasIndul(honnanX, honnanY, hovaX, hovaY,  false);
            } else new MelyikTamdaja();
        }
    }
}
