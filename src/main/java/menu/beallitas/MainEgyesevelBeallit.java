package main.java.menu.beallitas;

import main.java.Main;
import main.java.menu.FoMenu;

import java.util.Scanner;

/**
 * Ehyesével beállitás!
 * @author Koncsik Benedek (G7KJC7)
 * Ez az osztály ugy megy végig a beállitásokon, hogy csak egyesével nem kell mindenen végig menni kilehet választani mit szeretne az ember beálitani
 */
public class MainEgyesevelBeallit {
    public MainEgyesevelBeallit(String[] argumentum) {
        FoMenu foMenu = new FoMenu(Main.argumentum());
        Scanner scanf = new Scanner(System.in);
        System.out.println("Gépi ellenfél beálitása--> 1");
        System.out.println("Pálya méret beálitása--> 2");
        System.out.println("Pálya tipus beálitása--> 3");
        int kulonValaszt = scanf.nextInt();
        switch (kulonValaszt) {
            case 1:
                foMenu.gepiEllenfelBealitas();
                Main.beallitas();
                break;
            case 2:
                foMenu.palyaMeret1();
                foMenu.palyaMeret2();
                Main.beallitas();
                break;
            case 3:
                foMenu.palyatipus();
                Main.beallitas();
                break;
            default:
                System.err.println("Kérem 1 és 3 közötti számott írjon!");
                Main.beallitas();
                break;
        }
    }
}