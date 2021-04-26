package main.java.jatekmenet;

import main.java.beallitasok.jatekosertekek.AIEmberTeruletek;
import main.java.beallitasok.jatekosertekek.Ellenfelek;
import main.java.beallitasok.rendomszamgenerator.RandomSzamGenerator;
import main.java.menu.beallitas.FoMenuBeallitas;
import main.java.palya.hatszogracs.Hatszogracs;
import main.java.palya.negyszogracs.Negyszogracs;
import main.java.palya.palyaelem.PalyaElem;

/**
 * A körök közzöt-i dobokocka elosztás
 * @author Koncsik Benedek (G7KJC7)
 */
public class KovetkezoKorDobokockaElosztas {
        private PalyaElem[][] paylaTipus;
    private int elosztahtoDobokockaSzam;
    public KovetkezoKorDobokockaElosztas(int jatekos){
     elosztahtoDobokockaSzam = Ellenfelek.ellenfelekTomb.get(jatekos) / 2;
     for (int i = 0; i < elosztahtoDobokockaSzam; i++) {
         RandomSzamGenerator rnDobokocka = new RandomSzamGenerator(1, elosztahtoDobokockaSzam);
         int menyiDobokocka = rnDobokocka.randomSzamGenerator();
            if (FoMenuBeallitas.isPalyaTipus()) paylaTipus = Negyszogracs.palya;
            else paylaTipus = Hatszogracs.palya;
             if (elosztahtoDobokockaSzam > 1) {
                 RandomSzamGenerator rnMelyik = new RandomSzamGenerator(0, Ellenfelek.ellenfelekTomb.get(jatekos));
                 int hanyadikTerulet = rnMelyik.randomSzamGenerator();
                 int x = AIEmberTeruletek.teruletei[jatekos][hanyadikTerulet].x;
                 int y = AIEmberTeruletek.teruletei[jatekos][hanyadikTerulet].y;
                 paylaTipus[x][y].doboKockaSzam += menyiDobokocka;
                 elosztahtoDobokockaSzam -= menyiDobokocka;
             }
         }


    }
}
