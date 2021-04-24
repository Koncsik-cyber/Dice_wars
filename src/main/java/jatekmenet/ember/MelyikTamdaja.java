package main.java.jatekmenet.ember;

import main.java.beallitasok.jatekosertekek.AIEmberTeruletek;
import main.java.beallitasok.jatekosertekek.Ellenfelek;
import main.java.jatekmenet.JatekbanVanEllenorzes;
import main.java.mentesbetoltes.MentesAdatKezeles;
import main.java.menu.JatekMenu;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.hatszogracs.Hatszogracs;
import main.java.palya.negyszogracs.Negyszogracs;

import java.util.Scanner;

public class MelyikTamdaja {
    public MelyikTamdaja(){
        new JatekbanVanEllenorzes();
        System.out.println("Melyik mezőről induljon a támadás?");
        System.out.println("1-tól " + Ellenfelek.ellenfelekTomb.get(0) + "-ig írjon be egy szamot(999 akkor ki lép a terület vizsgálatból): ");
        new Ellenfelek();
        Scanner scanf = new Scanner(System.in);
        int terulet = scanf.nextInt();
        valaszt(terulet);
    }
    private void valaszt(int melyik) {
        int kiirasMelyik = melyik;
        if (melyik == 999) {
            new JatekMenu();
        } else {
            if (melyik > 0 && melyik <= Ellenfelek.ellenfelekTomb.get(0)) {
                melyik = melyik-1;
                if (FoMenuBeallitas.isPalyaTipus()){
                    System.out.println(new MentesAdatKezeles().MentesString(kiirasMelyik + ". mezőn " +
                            Negyszogracs.palya[AIEmberTeruletek.teruletei[1][melyik].x][AIEmberTeruletek.teruletei[1][melyik].y][AIEmberTeruletek.teruletei[1][melyik].z].doboKockaSzam
                            + " db dobokocka található."));
                }
                else {
                    System.out.println(new MentesAdatKezeles().MentesString(kiirasMelyik + ". mezőn " +
                            Hatszogracs.palya[AIEmberTeruletek.teruletei[1][melyik].x][AIEmberTeruletek.teruletei[1][melyik].y][AIEmberTeruletek.teruletei[1][melyik].z].doboKockaSzam
                            + " db dobokocka található."));
                }
                System.out.println(new MentesAdatKezeles().MentesString("Induljon innen a támadás? (HA i akkor indul a támadás, kiválaszthatód melyik irányba szeretnéd. Ha n akkor visszalép az előző menűbe.)"));
                Scanner scanf = new Scanner(System.in);
                char tamadase = scanf.next().charAt(0);
                new Tamade().tamade(tamadase, AIEmberTeruletek.teruletei[1][melyik].x, AIEmberTeruletek.teruletei[1][melyik].y, AIEmberTeruletek.teruletei[1][melyik].z);
                new MelyikTamdaja();
            } else {
                System.out.println(new MentesAdatKezeles().MentesString("Nem létezik ez az pálya elem!"));
            }
        }
    }
}
