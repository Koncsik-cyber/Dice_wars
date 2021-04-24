package main.java.menu.beallitas;

import main.java.Main;
import main.java.jatekmenet.ember.MelyikTamdaja;
import main.java.mentesbetoltes.WriteFile;
import main.java.menu.JatekMenu;
import main.java.palya.megjelenites.PalyaEmberTeruletSzam;

import java.io.IOException;
import java.util.Scanner;

/**
 * Játék menü!
 * @author Koncsik Benedek (G7KJC7)
 * Ha az emberi játékos jön kiirja melyik számmal mit végez a program. Ezek után a beírt számnak megfelelöen hajta végre a meghivot metodusokat
 */
public class JatekMenuEmber extends JatekMenu {
public JatekMenuEmber(){
    new PalyaEmberTeruletSzam();
    System.out.println("Tamadás--> 1");
    System.out.println("A kör kihagyása--> 2");
    System.out.println("A játék mentése--> 3");
    System.out.println("A kilépés vissza a fömenübe--> 4");
    Scanner scanf = new Scanner(System.in);
    int valaszt = scanf.nextInt();
    switch (valaszt) {
        case 1:
            new MelyikTamdaja();
            break;
        case 2:
            tovabbLep();
            break;
        case 3:
            try {
                new WriteFile("mentes.txt");
                System.out.println("Sikeres mentés");
                new JatekMenu(kineltart);
            } catch (IOException e) {
                System.err.println("nem sikerült a mentés!");
                e.printStackTrace();
            }
            break;
        case 4:
            new Main().beallitas();
        default:
            System.err.println("Kérem 1-et vagy 4-et írj be!");
    }
}
}
