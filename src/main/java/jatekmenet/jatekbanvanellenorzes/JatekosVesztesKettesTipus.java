package main.java.jatekmenet.jatekbanvanellenorzes;

import main.java.Main;
import main.java.beallitasok.jatekosertekek.AIEmberTeruletek;
import main.java.jatekmenet.JatekbanVanEllenorzes;
import main.java.mentesbetoltes.MentesAdatKezeles;

public class JatekosVesztesKettesTipus extends JatekbanVanEllenorzes {
    public JatekosVesztesKettesTipus(){
        if (AIEmberTeruletek.teruletekSzama[1] == 1) {
            int x = AIEmberTeruletek.teruletei[1][0].x;
            int y = AIEmberTeruletek.teruletei[1][0].y;
            int Z = AIEmberTeruletek.teruletei[1][0].z;
            if (palya[x][y][Z].doboKockaSzam == 1) {
                System.out.println("A játékos vesztett");
                System.out.println("<================ :( ================>");
                new MentesAdatKezeles().MentesString("A játékos vesztett");
                new MentesAdatKezeles().MentesString("<================ :( ================>");
                System.out.printf("Új játék?");
                Main.beallitas();
            }
        }
    }
}
