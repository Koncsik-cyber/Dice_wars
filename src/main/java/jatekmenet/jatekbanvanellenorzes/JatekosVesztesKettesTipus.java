package main.java.jatekmenet.jatekbanvanellenorzes;

import main.java.Main;
import main.java.beallitasok.jatekosertekek.AIEmberTeruletek;
import main.java.jatekmenet.JatekbanVanEllenorzes;
import main.java.mentesbetoltes.MentesAdatKezeles;
import main.java.palya.palyaelem.PalyaElem;

/**
 * Játékos veszit nézi, hogy ha 1 mezöje maradt azon mennyi a dobokockák száma, ha egy akkor veszitett mert már akkor nem tud támadástt inditani.
 * @author Koncsik Benedek (G7KJC7)
 */
public class JatekosVesztesKettesTipus{
    public JatekosVesztesKettesTipus(PalyaElem[][] palya){
        if (AIEmberTeruletek.teruletekSzama[1] == 1) {
            int x = AIEmberTeruletek.teruletei[1][0].x;
            int y = AIEmberTeruletek.teruletei[1][0].y;
            int Z = AIEmberTeruletek.teruletei[1][0].z;
            if (palya[x][y].doboKockaSzam == 1) {
                System.out.println(new MentesAdatKezeles().MentesString("A játékos vesztett"));
                System.out.println(new MentesAdatKezeles().MentesString("<================ :( ================>"));
                System.out.printf("Új játék?");
                Main.beallitas();
            }
        }
    }
}
