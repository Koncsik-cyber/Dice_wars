package main.java;
import java.util.Scanner;
import main.java.menu.*;
import main.java.menu.beallitas.MainEgyesevelBeallit;
import main.java.menu.beallitas.MainMenuPont;

/**
 *Dice Wars!
 * @author Koncsik Benedek (G7KJC7)
 * @version 1.0 Béta
 * Debugg Mod:
 * -ha az argumentumnak a szomszedok paramétert adjuk akkor kiirja a palya első elemének aszomszédait
 * -ha az argumentumnak a palyaMegjelenites irjuk be akkor meg jelen a pálya
 * -ha az argumentumnak a eloszottTerulet irjuk be akkor kiirja menyi területet osztott szét játékosokra lebontva 1 érték Ember a többi a gépi ellenfelek
 * -ha az argumentumnak a kinenHanyadikTerulet paramlétert adjuk akkor ki irja kihez melyik terület tratozik
 * -ha inditásnál az argumentumnak megadjuk a debuggMode paramétert akkor mindent kiir a fentiek közül mindent
 */
public class Main {
    private static String[] argumentum;
    public static void main(String[] args) {
        argumentum = args;
        beallitas();
    }
public static String[] argumentum(){
        return argumentum;
}
    public static void beallitas(){
        FoMenu foMenu = new FoMenu(argumentum());
        Scanner scanf = new Scanner(System.in);
        new MainMenuPont();
        int valaszt = scanf.nextInt();
        switch (valaszt){
            case 1:
                foMenu.gepiEllenfelBealitas();
                foMenu.palyaMeret1();
                foMenu.palyaMeret2();
                foMenu.palyatipus();
                main(argumentum());
                break;
            case 2:
                new MainEgyesevelBeallit();
                break;
            case 3:
                foMenu.valaszt();
                break;
            default:
                System.err.println("Kérem 1 és 3 közötti számot írjon!");
                main(argumentum());
        }
        new JatekMenu(1);
    }
}